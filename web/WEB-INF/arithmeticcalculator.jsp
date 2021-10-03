<%-- 
    Document   : arithmeticcalculator
    Created on : Oct 3, 2021, 11:01:03 AM
    Author     : 849533
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form>
            <label>First:</label>
            <input type="number" name="first" value="${firstNumber}">
            <br>
            <label>Second:</label>
            <input type="number" name="second" value="${secondNumber}">
            <br><br>
            <input type="button" id="additionButton" value="+">
            <input type="button" id="subtractionButton" value="-">
            <input type="button" id="multiplicationButton" value="*">
            <input type="button" id="divisionButton" value="%">
        </form>
        <p>${message}</p>
        <a href="agecalculator.jsp">Age Calculator</a>
    </body>
</html>
