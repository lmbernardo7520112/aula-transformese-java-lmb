<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formul�rio de reclama��es</title>
<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div class="container">
		<form action="<%= request.getContextPath() %>/ReclamacoesServlet" method="post">
			<label for="endereco">Endere�o:</label>
			<input type="text id="endereco" name="endereco"><br><br>
			<label for="problema">Tipo de Problema:</label>
			<select id="problema" name="problema">
				<option value="buracos">Buracos</option>
				<option value="praca">Pra�a</option>
				<option value="policiamento">Policiamento</option>
				<option value="outro">Outro</option>
			</select><br><br>
			<label for="descricao">Descri��o do Problema:</label>
				<textarea id="descricao" name="descricao" rows="8" cols="8"></textarea><br><br>
				<input type="submit" value="Enviar reclamação">
		</form>
	</div>
</body>
</html>