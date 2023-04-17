<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
        	double numero_1 = Double.parseDouble(request.getParameter("numero_1"));
        	double numero_2 = Double.parseDouble(request.getParameter("numero_2"));
			String operador = request.getParameter("operador");
			double resultado = 0.0;
			
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
			%>
			<p>O resultado é: <%= resultado %></p>
			<a href="index.html">Voltar</a>
		</div>	
</body>
</html>