<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="entity.Product"%>
<%@ page import="java.util.Optional"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find product details</title>
</head>
<body>
	<h1>This is view product detail page</h1>

	<form action="viewproduct" method="post">
		<label for="productName">Product Name:</label> <input type="text"
			id="productName" name="name" required> <input type="submit"
			value="View Product">
	</form>
	<%
		Product product = (Product) request.getAttribute("product");

		if (product != null) {
	%>
	<p>
		Product Name:
		<%=product.getName()%></p>
	<p>
		Product Price:
		<%=product.getPrice()%></p>
	<%
		} else {
	%>
	<p>Product not found.</p>
	<%
		}
	%>

	<button onclick="window.location.href='';">Home</button>
</body>
</html>