
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>MEMBERSHIP</title>
</head>
<body bgcolor="orange">

<center>
<h1>MEMBERSHIP</h1>
<form action="Membership" method="post" >
<br><br><br><br>

<table>
<tr>
    
    <td>IdNo:   <input type="text" name="idNo"></td>
   
    <td>Name:   <input type="text" name="name"></td>

    </tr>
    <tr>
   <td> Address:<input type="text" name="address"></td>
   
    <td>DateofIssue:<input type="text" name="dateofIssue"></td>
    
    </tr>
    <tr>
    <td>DateofExpiry:<input type="text" name="dateofExpiry"></td>
    
    <td>Status ofMs:<input type="text" name="statusofMs"></td>
   </tr>
   <tr>
   <td> Type ofMs:<input type="text" name="typeofMs"></td>
    
    <td>Ammount:<input type="text" name="ammount"></td>
  </tr>
   
    </table>
 <input type="submit" value="Add">
 


</form>
</center>
</body>
</html>