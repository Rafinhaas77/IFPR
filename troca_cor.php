
<?php
    if(isset($_POST["cor"])){
        $cor = $_POST["cor"];
    }else{
        $cor = "white";
    }
    echo "<style>body{background-color: ".$cor.";}</style>";
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Troca de cor</title>
</head>

<body>
    <h2>Troca de cor</h2>
    <form method="POST" action="troca_cor.php">
    <select name="cor">
        <option value="">--Selecione a cor de fundo---</option>
        <option value="tomato">Tomato</option>
        <option value="dodgerblue">DodgerBlue</option>
        <option value="gray">Gray</option>
        <option value="violet">Violet</option>
        <option value="orange">Orange</option>
        <option value="mediumseagreen">MediumSeaGreen</option>
        <option value="slateblue">SlateBlue</option>
        <option value="lightgray">LightGray</option>
    </select>
    <br><br>
    <button type="submit">Trocar cor</button>
    </form>
</body>
</html>