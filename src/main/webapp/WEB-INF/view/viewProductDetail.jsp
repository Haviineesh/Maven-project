<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="entity.Product" %>
    <%@ page import="java.util.Optional" %>
<%@ page isELIgnored="false" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is viewproductdetail page</h1>
<%
    Product product = (Product)request.getAttribute("product");

    if (product!=null) {
%>
        <p>Product Name: <%= product.getName() %></p>
        <p>Product Price: <%= product.getPrice() %></p>
<%
    } else {
%>
        <p>Product not found.</p>
<%
    }
%></body>
</html>
