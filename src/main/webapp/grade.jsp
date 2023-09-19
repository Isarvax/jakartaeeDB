index.jsp<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Crear Grado</title>
</head>
<body>
<h1>Crear Grado</h1>
<form method="post" action="/grade-form">
    <label for="grade">Grado:</label>
    <input type="text" id="grade" name="grade" required><br><br>
    <input type="submit" value="Guardar">
</form>
</body>
</html>