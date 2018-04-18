<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="Style" type="text/css" rel="stylesheet">
<title>New Member Account</title>
</head>
<body>

<p> Please enter the following information to create an account! </p>

 <form action="products.jsp" method="post" >
 <p>
  <label>First name:</label>
  <input type="text" name="first name"> </br> 
  <label>Last name:</label>
  <input type="text" name="last name"> </br>
   <label>E-mail:</label>
  <input type="text" name="email"> </br> 
  <label>Username:</label>
  <input type="text" name="username"> </br>
  <label>Password: </label>
  <input type="text" name="password"> <p> * Password must be longer than 6 characters, contain at least one number and one special character </p> 
   </p>
 </br> 
  <input type="submit" value="Create account!" />
  </p>
</form>

</body>
</html>