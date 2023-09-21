<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Crear Materia</title>
</head>
<body>
<h1>Crear Materia</h1>
<form method="post" action="/subject-form">
    <label for="subject">Materia:</label>
    <input type="text" id="subject" name="subject" required><br><br>
    <input type="submit" value="Guardar">
</form>
</body>
</html>