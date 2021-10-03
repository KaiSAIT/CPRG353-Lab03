<%-- 
    Document   : agecalculator
    Created on : Oct 3, 2021, 10:33:37 AM
    Author     : 849533
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form>
            <label>Enter your age:</label>
            <input type="number" name="age" value="${userAge}">
            <br><br>
            <input type="submit" value="Age next birthday">
        </form>
        <p>${message}</p>
        <a href="arithmeticcalculator.jsp">Arithmetic Calculator</a>
    </body>
</html>
