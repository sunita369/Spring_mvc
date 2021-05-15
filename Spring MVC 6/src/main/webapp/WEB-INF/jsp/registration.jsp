<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>  
<head>  
<style>  
.error{color:red}  
</style>  
</head>  
	<body>  
		<form:form action="helloagain" modelAttribute="user">  
		UserName: <form:input path="userName"/> <br><br>  
		Password(*): <form:password path="password"/> 
		 Email:<form:input path="email"/><br><br>
		  Contact:<form:input path="contact"/><br><br>
		   City:<form:input path="city"/><br><br> 
		    ZipCode:<form:input path="zipCode"/><br><br>  
		<form:errors path="pass" cssClass="error"/><br><br> 
		
		 
		<input type="submit" value="submit">  
		</form:form>  
	</body>  
</html>  