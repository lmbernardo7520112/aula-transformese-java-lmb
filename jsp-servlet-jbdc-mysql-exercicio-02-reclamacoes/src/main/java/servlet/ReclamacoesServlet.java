package servlet;

import java.io.IOException;
import java.io.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ReclamacoesDao;
import model.Reclamacoes;
import model.TipoProblema;

@WebServlet("/ReclamacoesServlet")
public class ReclamacoesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
	private ReclamacoesDao reclamacoesDao;
    
	/*public ReclamacoesServlet() {
        super();
        
    }*/
	
	public void init() {
		reclamacoesDao = new ReclamacoesDao();
	}
	
	/*protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}*/

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
		String endereco = request.getParameter("endereco");
        String problema = request.getParameter("problema");
        String descricao = request.getParameter("descricao");
        String dataHora = new java.util.Date().toString();
        
        Reclamacoes reclamacao = new Reclamacoes(endereco, TipoProblema.valueOf(problema), descricao); 
	
        reclamacao.setEndereco(endereco);
        reclamacao.setTipoDoProblema(TipoProblema.valueOf(problema));
        reclamacao.getDescricaoDoProblema();
        
        try {
        	reclamacoesDao.registraReclamacao(reclamacao);
        } catch (Exception e) {
        	e.printStackTrace();
        }
        
        String reclamacoes = "";
    	int lastId = 0;
    	try {
    		File file = new File("reclamacoes.txt");
    		if (file.exists()) {
    			BufferedReader br = new BufferedReader(new FileReader(file));
    			String line;
    			while ((line = br.readLine()) != null) {
    				if (line.startsWith("ID:")) {
    					long id = Long.parseLong(line.substring(3));
    					if (id > lastId) {
    						reclamacoes += line + "<br>";
    					}
    				} else {
    					reclamacoes += line + "<br>";
    				}	
    			}
    			
    			br.close();
    			
    		} else {
    			reclamacoes = "Não há reclamações registradas";
    		}
    	
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
        
        try {
    		FileWriter textoReclamacao = new FileWriter("reclamacoes.txt", true);
    		textoReclamacao.write("-------------------------------------------------\n");
    		textoReclamacao.write("ID:" + System.currentTimeMillis() + "\n");
    		textoReclamacao.write("Endereço:" + endereco +"\n");
    		textoReclamacao.write("Tipo de Problema:" + problema + "\n");
    		textoReclamacao.write("Descrição do problema:" + descricao + "\n");
    		textoReclamacao.write("Data e Hora:" + dataHora + "\n");
    		textoReclamacao.write("-------------------------------------------------\n");
    		textoReclamacao.close();
    		
    	} catch (IOException e) {
    		e.printStackTrace();
    	}

        
    	
        RequestDispatcher rd = request.getRequestDispatcher("reclamacoes.jsp");
        request.setAttribute("reclamacoes", reclamacoes);
        request.getRequestDispatcher("reclamacoesdetails.jsp").forward(request, response);
       /*rd.forward(request, response);
        response.sendRedirect("reclamacoesdetails.jsp");
        response.sendRedirect("reclamacoesdetails.jsp");
         * request.getRequestDispatcher("reclamacoes.jsp").forward(request, response);*/
	}
	

	
	

}
