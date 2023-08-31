<?php
$nome = "";
$idade = "";

if(isset($_POST['submetido'])){
    $nome = trim($_POST['nome']);
    $idade = trim($_POST['idade']);

    if(! $nome){
        $msgErro = 'Informe o nome';
    }else if(! $idade){
        $msgErro = 'Informe a idade';
    }else{
        echo $nome . " - " . $idade;
        $nome = '';
        $idade = '';
    }

}


?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Validacao</title>
</head>
<body>

    <h1>Formulario a validar</h1>    
    <form method="post"> <!-- Para validar com js, utilizar onsubmit="return validar()" -->
        <input type="text" name="nome" id="nome" placeholder="Nome:" value="<?php echo $nome ?>" />
        <br><br>
        <input type="number" name="idade" id="idade" placeholder="Idade:" value="<?php echo $idade ?>" />
        <br><br>
        <button type="submit">Enviar</button>
        <input type="hidden" name="submetido" value="1"> 
    </form>

    <br><br>

    <div id="divMsg" style="color: red;">
        <?php echo $msgErro ?>
    </div>

    <script src="validacao.js"></script>
</body>
</html>