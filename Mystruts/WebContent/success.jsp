<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
<style>
form {
    align:middle;
    background-color:lightgreen ;
    width: 300px;
    padding: 35px;
    border: 15px solid navy;
    margin: 25px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success page</title>
 </head>
<body bgcolor="linen">
<h3>
Hi <s:property value="username"></s:property>
</h3>
<marquee>
<h1>Welcome to Just Integrate IT pvt ltd!!!!</h1>
</marquee>
<img src="success.jpg" height="100px" width="150px"/>
<s:form action="addsuccess">
<s:textfield name="newuser" label="Enter New username"/>
<s:textfield name="anewpass" label="Enter Password"/>
<s:submit label="submit"/>
</s:form>
<h3 align="center" style="color:red;">
<a href="http://localhost:8080/Mystruts/index.jsp">click here to switch to a different user</a></h3>
 </body>
</html>