<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>

<%
	String endereco = request.getParameter("endereco");
	String problema = request.getParameter("problema");
	String descricao = request.getParameter("descricao");
	String dataHora = new java.util.Date().toString();
	
	try {
		FileWriter textoReclamacao = new FileWriter("reclamacoes.txt", true);
		textoReclamacao.write("-------------------------------------------------\n");
		textoReclamacao.write("Endereço:" + endereco +"\n");
		textoReclamacao.write("Tipo de Problema:" + problema + "\n");
		textoReclamacao.write("Descrição do problema;" + descricao + "\n");
		textoReclamacao.write("Data e Hora:" + dataHora + "\n");
		textoReclamacao.write("-------------------------------------------------\n");
		textoReclamacao.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
%>
<%
	String reclamacoes = "";
	try {
		File file = new File("reclamacoes.txt");
		if (file.exists()) {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				reclamacoes += line + "<br>";
				
			}
			
			br.close();
			
		} else {
			reclamacoes = "Não há reclamações registradas";
		}
	
	} catch (IOException e) {
		e.printStackTrace();
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formulário de Reclamações</title>
<link rel="stylesheet" type="text/css" href="style.css">
<
</head>
<body>
	<div class="container">
		<p>Reclamação enviada com sucesso!</p>
		<p><%= reclamacoes %></p>
		<a href="reclamacoes.html">Voltar</a>
	</div>
</body>
</html>