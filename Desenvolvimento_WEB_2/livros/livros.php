<?php 

$msgErro = '';
$titulo = '';
$genero = '';
$qtd_pag = '';
$autor = '';


//validar se o numero de paginas é maior que zero

ini_set('display_errors', 1);
error_reporting(E_ALL);

include_once("persistencia.php");

$livros = buscarDados();

if(isset($_POST['submetido'])) {
    $titulo = $_POST['titulo'];
    $genero = $_POST['genero'];
    $qtd_pag = $_POST['qtd_pag'];
    $autor = $_POST['autor'];

    if(! trim($titulo)){
        $msgErro = 'Informe um titulo';
    }else if(! $genero){
        $msgErro = 'Informe um genero';
    }else if(! trim($autor)){
        $msgErro = 'Informe um autor';
    }
    else if($qtd_pag <= 0){
        $msgErro = 'Informe um n° de paginas maior que 0';
    
    }else if(strlen($titulo) <= 3 || strlen($titulo) >= 50){
        $msgErro = 'Informe título do livro com no mínimo 3 e no máximo 50 caracteres';
    
    }else{
        $id = vsprintf( '%s%s-%s-%s-%s-%s%s%s',
        str_split(bin2hex(random_bytes(16)), 4) );

        $livro = array('id' => $id,
                'titulo' => $titulo,
                'genero' => $genero,
                'paginas' => $qtd_pag,
                'autor' => $autor);
        array_push($livros, $livro);

        //Persistir o array livros no arquivo
        salvarDados($livros);
    }

}

?>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastro de Livros</title>
</head>
<body>

    <h1>Cadastro de livros</h1>

    <h3>Formulário de livros</h3>
    <form action="" method="POST">
        <input type="text" name="titulo" value="<?php echo $titulo ?>"
            placeholder="Informe o título" />
        
        <br><br>

        <select name="genero">
            <option value="">---Selecione o gênero---</option>
            <option value="D" <?php if($genero == 'D'){ echo 'selected'; } ?>
                >Drama</option>
            <option value="F" <?php echo ($genero == 'F' ? 'selected' : '')  ?>
                >Ficção</option>
            <option value="R" <?php if($genero == 'R'){ echo 'selected'; } ?>
                >Romance</option>
            <option value="O" <?php if($genero == 'O'){ echo 'selected'; } ?>
                >Outro</option>
        </select>

        <br><br>

        <input type="number" name="qtd_pag" placeholder="Informe a quantidade de páginas" value="<?php echo $qtd_pag ?>" />

        <br><br>

        <input type="text" name="autor" placeholder="Informe o autor" value="<?php echo $autor ?>"/>

        <br><br>

        <input type="hidden" name="submetido" value="1" />

        <button type="submit">Gravar</button>
        <button type="reset">Limpar</button>
    </form>
    
    <div style="color : red;"> <?php echo $msgErro ?> </div>

    <h3>Listagem de livros</h3>
    <table border="1">
        <tr>
            <td>Título</td>
            <td>Gênero</td>
            <td>Páginas</td>
            <td>Autor</td>
            <td></td>
        </tr>

        <?php foreach($livros as $l): ?>
            <tr>
                <td><?= $l['titulo'] ?></td>
                <td><?php 
                    switch($l['genero']) {
                        case 'D':
                            echo 'Drama';
                            break;
                        
                        case 'F':
                            echo 'Ficção';
                            break;

                        case 'R':
                            echo 'Romance';
                            break;

                        case 'O':
                            echo 'Outro';
                            break;

                        default:
                            echo $l['genero'];
                    } 
                ?></td>
                <td><?= $l['paginas'] ?></td>
                <td><?= $l['autor'] ?></td>
                <td><a href="livros_del.php?id=<?= $l['id'] ?>" 
                        onclick="return confirm('Confirma a exclusão do livro?')">
                        Excluir</a></td>
            </tr>   
        <?php endforeach; ?>

    </table>
    
</body>
</html>