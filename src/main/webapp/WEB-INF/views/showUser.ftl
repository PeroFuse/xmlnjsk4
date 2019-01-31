<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Vartotojo informacija</title>
</head>
<body>
    <h1>Vartotojo informacija</h1>
    <table>
        <tr>
            <td><b>Id:</b></td>
            <td>${user.id}</td>
        </tr>
        <tr>
            <td><b>Vardas:</b></td>
            <td>${user.name}</td>
        </tr>
        <tr>
            <td><b>El.pastas:</b></td>
            <td>${user.email}</td>
        </tr>
        <tr>
            <td><b>Metai:</b></td>
            <td>${user.age}</td>
        </tr>
    </table>
    <br>
    <a href="/users">Atgal</a>
</body>
</html>