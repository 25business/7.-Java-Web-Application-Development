<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Homepage</title>
</head>
<body>
    <h1>${title}</h1>
    <p>
        <b>First name:</b> ${person.first_name} <br>
        <b>Last name:</b> ${person.last_name} <br>
        <b>Age:</b> ${person.age} <br>
        <b>Full name:</b> ${person.full_name()}

    </p>
    <ul>
        <#list names as name>
        <li>${name}</li>
        </#list>
    </ul>
</body>
</html>