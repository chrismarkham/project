<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@ page import="model.Product" %>
    
<% Product product = (Product) request.getAttribute("product"); %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<link href="Style" type="text/css" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="stylesheet.css"/>
<title>Update a Product</title>
</head>
<body>

<h2>Please enter the product you would like to update below:</h2>

<form name=updateForm action=updateProduct method=get >
<p>
   <label>SKU:</label>
   <input type=text name=sku value="<%= product.getSku() %>" /><br />
  <label>Product Type:</label>
   <input type=text name=productType value="<%= product.getProductType() %>" /><br />
   <label>Flavor:</label>
   <input type=text name=flavor value="<%= product.getFlavor() %>" /><br />
   <label>Cost:</label>
   <input type=text name=cost value="<%= product.getCost() %>" /><br />
   <label>Price:</label>
   <input type=text name=price value="<%= product.getPrice() %>" /><br />
   <label>Quantity:</label>
   <input type=text name=quantity value="<%= product.getQuantity() %>" /><br />
   </p>
   
   <input class="button" type=submit name=submit value="Update the Product"/>

</form>
</body>
</html>