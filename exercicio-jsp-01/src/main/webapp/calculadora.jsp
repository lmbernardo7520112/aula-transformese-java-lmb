<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="javax.servlet.http.HttpServletRequest" %>.
<!DOCTYPE html>
<html>
<head>
    <title>Resultado</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div class="container">
        <h1>Resultado</h1>
        <%
        	double numero_1 = Double.parseDouble(request.getParameter("numero_1").toString());
        	double numero_2 = Double.parseDouble(request.getParameter("numero_2").toString());
			String operador = (String) request.getParameter("operador");
			double resultado = 0.0;
			
			if (operador != null) {
				switch (operador) {
					case "+":
                		resultado = numero_1 + numero_2;
                		break;
					case "-":
                    	resultado = numero_1 - numero_2;
                    	break;
					case "*":
                    	resultado = numero_1 * numero_2;
                    	break;
					case "/":
                    	resultado = numero_1 / numero_2;
                    	break;
				}
			}
			%>
			<% if (operador != null && !operador.isEmpty()) { %>
				<p>O resultado é: <%= resultado %></p>
			<% } else { %>
				<p>Operador inválido.</p>
			<% } %>
			<a href="calculadora.html">Voltar</a>
		</div>
	</body>
</html>
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			