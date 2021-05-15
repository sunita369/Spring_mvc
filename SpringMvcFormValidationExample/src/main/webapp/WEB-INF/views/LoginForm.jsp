<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<style>
    .error {
        color: red; font-weight: bold;
    }
</style>
</head>
<body>
    <div align="center">
        <h2>Login Form</h2>
        <table border="0" width="90%">
        <form:form action="login" commandName="userForm">
				<tr>
					<td align="left">Name: </td>
					<td align="left" width="60%"><form:input path="name" size="30"/></td>
                    <td align="left"><form:errors path="name" cssClass="error"/></td>
                </tr>
				<tr>
                    <td>Password: </td>
                    <td><form:password path="password" size="30"/></td>
                    <td><form:errors path="password" cssClass="error"/></td>
                </tr>
				
                <tr>
                    <td align="left" width="20%">Email: </td>
                    <td align="left" width="40%"><form:input path="email" size="30"/></td>
                    <td align="left"><form:errors path="email" cssClass="error"/></td>
                </tr>
                <tr>
                    <td>Contact: </td>
                    <td><form:password path="contact" size="10"/></td>
                    <td><form:errors path="contact" cssClass="error"/></td>
                </tr>
				<tr>
                    <td>City : </td>
                    <td width="40%"><form:password path="city" size="30"/></td>
                    <td><form:errors path="city" cssClass="error"/></td>
                </tr>
				<tr>
                    <td>Zip: </td>
                    <td><form:password path="zip" size="6"/></td>
                    <td><form:errors path="zip" cssClass="error"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td align="center"><input type="submit" value="Login"/></td>
                    <td></td>
                </tr>
        </form:form>
        </table>
    </div>
</body>
</html>
