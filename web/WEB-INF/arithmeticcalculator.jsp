<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="POST" action="age">
            <label>First:</label>
            <input type="number" name="first" value="${firstNumber}">
            <br>
            <label>Second:</label>
            <input type="number" name="second" value="${secondNumber}">
            <br><br>
            <input type="submit" id="additionButton" name="add" value="+">
            <input type="submit" id="subtractionButton" name="subtract" value="-">
            <input type="submit" id="multiplicationButton" name="nultiply" value="*">
            <input type="submit" id="modulusButton" name="modulus" value="%">
        </form>
        <p>Result: ${message}</p>
        <a href="age">Age Calculator</a>
    </body>
</html>
