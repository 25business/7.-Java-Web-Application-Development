<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Names</title>
</head>
<body>
    <p>
        <a href="/names">Default</a>
        <a href="/names?sort=asc">Ascending</a>
        <a href="/names?sort=desc">Descending</a>
    </p>
    <h1>Names</h1>
    <ul>
        <#list names as name>
        <li>${name}</li>
        </#list>
    </ul>
</body>
</html>