function validar(){
    
    var nome = document.getElementById('nome').value.trim();
    var idade = document.getElementById('idade').value.trim();

    console.log(nome);
    console.log(idade);

    if(nome == ''){
        exibeMsgErro('divMsg', 'Informe o nome');
        return false;
    }

    if(idade == ''){
        exibeMsgErro('divMsg', 'Informe a idade');
        return false;
    }

    return true;
}

function exibeMsgErro(id, msg){
    document.getElementById(id);
    divMsg.innerHTML = msg;
}