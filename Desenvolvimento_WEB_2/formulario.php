<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <?php
    $usuario = $_POST["usuario"];
    $senha = $_POST["senha"];
    if($usuario == "ifpr" && $senha == "tads"):
        echo "<h1>Bem vindo ao TADS!!</h1>";
    else: ?>
        <h2>Login no IFPR</h2>
        <form method="POST" action="formulario.php">
        <input name="usuario" type="text" placeholder="Informe seu usuario" />
        <br><br>
        <input name="senha" type="password" placeholder="Informe a senha" />
        <br><br>
        <button type="submit">Login</button>
        </form>
    <?php endif; ?>

</body>
</html>