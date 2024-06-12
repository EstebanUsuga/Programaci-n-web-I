<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Intro JSP - EL -  JSTL</title>
</head>
<body>
     <h3>Parcial Lenguajes de progromación</h3>     
     <h3>Texteo lenguaje de expresiones :D &dollar;{}</h3>    
     <span>3.48<sup>5</sup> = ${Math.pow(3.48, 5)}</span><br>
     <span>Header del navegador: ${header["user-agent"]}</span><br>
     <h3>JSTL (JSP Standard Tag Library)</h3>
     <c:set var="var1" value="Hola profe espero que esté muy bien"/>
     <p><c:out value="${var1}"/></p>  
          
</body>
</html>