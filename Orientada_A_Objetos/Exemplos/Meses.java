package Exemplos;
public class Meses {
    String[] nomesMeses = new String[12];

    //Método construtor
    //Executado automaticamente sempre
    //  que se cria um objeto da classe
    //Não tem tipo d retorno
    //Mesmo nome da classe
    public Meses(){
        atribuirValores();
    }

    private void atribuirValores(){
        nomesMeses[0] = "Janeiro";
        nomesMeses[1] = "Fevereiro";
        nomesMeses[2] = "Março";
        nomesMeses[3] = "Abril";
        nomesMeses[4] = "Maio";
        nomesMeses[5] = "Junho";
        nomesMeses[6] = "Julho";
        nomesMeses[7] = "Agosto";
        nomesMeses[8] = "Setembro";
        nomesMeses[9] = "Outubro";
        nomesMeses[10] = "Novembro";
        nomesMeses[11] = "Dezembro";
    }

    public String pegarNomeMes(int nro){
        if((nro < 1) || (nro > 12)){
            return "";
        }else{
            return nomesMeses[nro - 1];
        }
    }
}
