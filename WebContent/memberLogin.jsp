<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="Style" type="text/css" rel="stylesheet">
<title>Log-In Page</title>
</head>
<body>

<p> Please enter your log-in information to start shopping! </p>

  <form action="products.jsp" method="post" >
  <label><p>Username:</p> </label>
  <input type="text" name="username"> </br> 
  <label><p>Password: </p></label>
  <input type="text" name="password"> 
 </br> 
  <input type="submit" value="Log-in!" /></p>
 </form>

     <p> Forgot your password? </p> 
     <input type="submit" value="Click here!" /></p>
     </form>
</body>
</html>