<?php
if (isset($_GET['inicio']) && isset($_GET['razao']) && isset($_GET['quantidade'])) {
    $inicio = $_GET['inicio'];
    $razao = $_GET['razao'];
    $quantidade = $_GET['quantidade'];

    echo "Progressão Aritmética: ";
    for ($i = 0; $i < $quantidade; $i++) {
        echo $inicio + ($i * $razao);
        if ($i < $quantidade - 1) {
            echo ", ";
        }
    }
} else {
    echo "Parâmetros faltando. Informe os valores de 'inicio', 'razao' e 'quantidade' via método GET.";
}
?>
