<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body {
    background: url(i2.jpg);
    background-size: 100% 100%;
    background-repeat: repeat;
}
form {
    align:middle;
    background-color: linen;
    width: 300px;
    padding: 20px;
    border: 10px solid navy;
    margin: 20px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index page</title>
</head>
<body bgcolor="linen">
<h2 align="center">Warning:Only Employees of <em><font color="linen">JustIntegrate IT</font></em> are allowed to access further</h2>
<center>
<s:form action="Mylogin">
<h2 style="color: black;">EMPLOYEE LOGIN</h2>
<s:textfield name="username" label="Enter Useraname"/>
<s:password name="password" label="Enter Password"/>
<s:submit value="Click here to login"/>
</s:form>
</center>
</body>
</html>