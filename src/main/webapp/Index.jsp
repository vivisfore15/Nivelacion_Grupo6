<%@page import="Controlador.Conexion"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Prestamos Libros</h1>
<%
if(request.getParameter("men")!=null){
	String mensaje=request.getParameter("men");
out.print("<script type='text/javascript'>alert('"+mensaje+"');</script>");
}
%>
<form action="Libro" method="post">
<div><label>Codigo: </label><input type="text" name="isbn"></div>
<div><label>Titulo: </label><input type="text" name="titulo"></div>
<div><label>Editorial: </label><input type="text" name="editorial"></div>
<div><label>Autor: </label><input type="text" name="autor"></div>
<div><label>Paginas: </label><input type="number" name="paginas"></div>
<div><input type="submit" name="insertar" value="Registrar">
<input type="submit" name="consultar" value="Consultar">
<input type="submit" name="actualizar" value="Actualizar">
<input type="submit" name="eliminar" value="Eliminar">
</div>
</form>

</body>
</html>