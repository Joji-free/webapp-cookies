<%--
  Created by IntelliJ IDEA.
  User: ander
  Date: 15/5/2025
  Time: 20:32
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html; UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }
        form {
            max-width: 400px;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        div {
            margin-bottom: 15px;
        }
        input[type="text"], input[type="password"] {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }
    </style>
</head>
<body>
<h1>Login de usuario</h1>

<form action="/webapp_cookies/login" method="post">
    <div>
        <label for="username">Nombre de usuario:</label>
        <div>
            <input type="text" name="username" id="username" required>
        </div>
    </div>

    <div>
        <label for="pass">Password:</label>
        <div>
            <input type="password" name="password" id="pass" required>
        </div>
    </div>

    <div>
        <input type="submit" value="Enviar">
    </div>
</form>
</body>
</html>
