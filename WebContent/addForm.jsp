<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=US-ASCII">
<link href="Style" type="text/css" rel="stylesheet">
<link type="text/css" rel="stylesheet" href="stylesheet.css"/>
<title>Grocery Store</title>
</head>
<body>

<h2> Please enter the product you would like to add to the database below: </h2>

<form name=addForm action=addProduct method=get >
<p>
   <label> SKU: </label>
   <input type=text name=sku value="" /> <br />
	<label> Product Type:</label>
   <input type=text name=productType value="" /><br />
   <label>Flavor:</label>
   <input type=text name=flavor value="" /><br />
    <label> Cost:</label>
   <input type=text name=cost value="" /><br />
    <label>Price:</label>
   <input type=text name=price value="" /><br />
    <label>Quantity:</label>
   <input type=text name=quantity value="" /><br />
 </p>
   <input class="button" type=submit name=submit value="Add the Product" />
</form>
</body>
</html>