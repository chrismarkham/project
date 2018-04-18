<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="Style" type="text/css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>

<h1> Welcome to our online retail store! </h1></br>
<h2> Please select one of the following options to start shopping!</h2></br> 

<form name="memberLogin" action="memberLogin.jsp" method="post">
     <input type="submit" name="submit" value="Existing Account">
</form>
<form name="newLogin" action="newLogin.jsp" method="post">
     <input type="submit" name="submit" value="New Account">
</form>
</body>
</html>