<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*" %>
<%@ page import="dao.*"%>
<%@ page import="servlet.*" %>
<%@ page import="model.*"%>

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
		<% String reclamacao = (String) request.getAttribute("reclamacao"); %>
		<p><%= reclamacao %></p>
		<a href="reclamacoes.jsp">Voltar</a>
	</div>
</body>
</html>