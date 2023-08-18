import java.io.BufferedWriter;
import java.io.FileWriter;

public class ExEscritaArquivo {
    public static void main(String[] args) throws Exception{
        String nomeArqSaida = "arqSaida.csv";
        BufferedWriter arqGravacao = new BufferedWriter(new FileWriter(nomeArqSaida));
        
        String nomeProduto = "Mouse";
        String preco = "123.45";
        String estoque = "35";
        String linha = nomeProduto + ";" + preco + ";" + estoque;
        arqGravacao.write(linha);
        arqGravacao.newLine();

        nomeProduto = "Teclado";
        preco = "543.21";
        estoque = "53";
        linha = nomeProduto + ";" + preco + ";" + estoque;
        arqGravacao.write(linha);
        arqGravacao.close();

    }
}
