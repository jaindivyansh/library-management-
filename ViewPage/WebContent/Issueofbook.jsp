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
ISSUE OF BOOKS
<form action="issueofbook" method="post" >
<div>
<br>
    MemberIdNo: <input type="text" name="id_no">
    <br><br>
    BookCODE:   <input type="text" name="Book_code">
    <br><br>
    Dateofissue :<input type="text" name="Issue_date">
    <br><br>
    DateofExpiry:<input type="text" name="expiry_date">
    </div>
    <br>
 <input type="submit" value="Add">


</form>
</center>
</body>
</html>