<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%
    String table = (String) request.getAttribute("table");
%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<link href="Style" type="text/css" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="stylesheet.css"/>
<title>Products</title>
</head>
<body>

<h1>Products</h1>
<h2> Here are our current products. You can view, update, delete or add new products below!</h2>

<div id="table">
<table border=1>
<tr>
	<th>SKU</th>
	<th>Product Type</th>
	<th>Flavor</th>
	<th>Cost</th>
	<th>Price</th>
	<th>Quantity</th>
	<th colspan=2>Edit</th>
<%= table %>
</table>
</div>
<br />
<p>
<a href = "add">Add product to cart</a>
</p>

</body>
</html>