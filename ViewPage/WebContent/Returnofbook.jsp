<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="orange">
<center>
RETURN OF BOOKS
<form action="returnofbook" method="post" >
<div>
<br>
    MemberIdNo: <input type="text" name="memberidno">
    <br><br>
    BookCODE:   <input type="text" name="bookcode">
    <br><br>
    Dateofissue :<input type="text" name="dateofissue">
    <br><br>
    DateofExpiry:<input type="text" name="dateofexpiry">
    </div>
    <br>
 <input type="submit" value="Add">
 </form>
 </center>
</body>
</html>