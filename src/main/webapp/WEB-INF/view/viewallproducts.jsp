<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<%@ page import="entity.Product"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All products</title>
</head>
<body>
	<h4>This is view All products page</h4>
	<%
		List<Product> products = (List<Product>) request.getAttribute("products");

		for (Product product : products) {
			out.println("<p>Name: " + product.getName() + "</p>");
			out.println("<p>Price: " + product.getPrice() + "</p>");
		}
	%>
	<br>
	<button onclick="window.location.href='';">
		Home</button>
	<br>
</body>
</html>
