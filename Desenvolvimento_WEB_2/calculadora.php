<?php

    if(isset($_POST["operacao"]) && isset($_POST["valor1"]) && isset($_POST["valor2"]) && ($_POST["valor2"] != 0)){
        $valor1 = $_POST["valor1"];
        $valor2 = $_POST["valor2"];
        $operacao = $_POST["operacao"];
        $campos = 0;
    }else if($_POST["valor2"] == 0 && $_POST["operacao"] == "divisao"){
        $campos = 1;
    }else{
        $campos = 2;
    }

?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calculadora</title>
</head>

<body>
    <h2>Calculadora</h2>
    <form method="POST" action="calculadora.php">
    <input name="valor1" type="number" placeholder="Informe o valor 1" />
    <br><br>
    <input name="valor2" type="number" placeholder="Informe o valor 2" />
    <br><br>
    <select name="operacao">
        <option value="">--Selecione a operação---</option>
        <option value="adicao">+</option>
        <option value="subtracao">-</option>
        <option value="multiplicacao">*</option>
        <option value="divisao">/</option>
    </select>
    <br><br>
    <button type="submit">Calcular</button>
    </form>
    <br><br>

    <?php
        if($campos == 0){
            switch($operacao){
                case 'adicao':
                    $resultado = $valor1 + $valor2;
                    break;
                case 'subtracao':
                    $resultado = $valor1 - $valor2;
                    break;
                case 'multiplicao':
                    $resultado = $valor1 * $valor2;
                    break;
                case 'divisao':
                    $resultado = $valor1 / $valor2;
                    break;
            }
            echo "<div>O resultado da $operacao é: $resultado</div>"; 
        }else if($campos == 1){
            echo "<div>Não é permitido divisão por zero, favor informar outro valor!</div>";
        }else if($campos == 2){
            echo "<div>Favor preencher todos os campos</div>";
        }
    ?>

</body>
</html>