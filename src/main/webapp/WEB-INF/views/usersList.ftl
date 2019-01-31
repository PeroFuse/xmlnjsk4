<<!doctype html>
<html>
<head>
    <meta charset="UTF-8"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Vartotojai</title>
</head>
<body>
<h1>Vartotojai</h1>
<table>
    <tr>
        <th>Id</th>
        <th>Vardas</th>
        <th>El. pastas</th>
        <th>Metai</th>
    </tr>
    <#list users as user>
        <tr>
            <td><a href="user/${user.id}">${user.id}</a></td>
            <td>${user.name}</td>
            <td>${user.email}</td>
            <td>${user.age}</td>
        </tr>
    </#list>
</table>
</body>
</html>