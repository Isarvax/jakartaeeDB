<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Crear estudiante</title>
</head>
<body>
<h1>Crear Estudiante</h1>
<form method="post" action="/student-form">
    <label for="name">Nombre:</label>
    <input type="text" id="name" name="name" required><br><br>
    <label for="career">Carrera:</label>
    <input type="text" id="career" name="career" required><br><br>
    <input type="submit" value="Guardar">
</form>
</body>
</html>