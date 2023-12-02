<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List, entity.Product"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h2>Products</h2>
		<%
			Product product = (Product) request.getAttribute("product");

			out.println("<p>Name: " + product.getName() + "</p>");
			out.println("<p>Price: " + product.getPrice() + "</p>");
		%>
		<button onclick="window.location.href='viewallproducts';">
			view all product</button>
		<br>
		<button onclick="window.location.href='viewproduct';">
			view product</button>

	</div>

</body>
</html>