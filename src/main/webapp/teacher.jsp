<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Crear profesor</title>
</head>
<body>
<h1>Crear profesor</h1>
<form method="post" action="/teacher-form">
    <label for="name">Nombre:</label>
    <input type="text" id="name" name="name" required><br><br>
    <label for="email">Email:</label>
    <input type="text" id="email" name="email" required><br><br>
    <input type="submit" value="Guardar">
</form>
</body>
</html>