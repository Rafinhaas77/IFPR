import java.io.BufferedWriter;
import java.io.FileWriter;

public class CriarHTML {
    public static void main(String[] args) throws Exception{
        String nomeArqSaida = "cores.html";
        BufferedWriter arqGravacao = new BufferedWriter(new FileWriter(nomeArqSaida));
        String bloco;
        String valorHEX;
        String primeiro[] = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        String segundo[] = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        String terceiro[] = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        
        bloco = "<!DOCTYPE html>" + 
                    "<html>" +
                    "<head>" +
                        "<style>" +
                            "table {" +
                                "border-collapse: collapse;"+
                                "width: 50%;"+
                                "margin: auto;"+
                                "margin-top: 50px;"+
                            "}"+
                
                            "th, td {"+
                                "border: 1px solid black;"+
                                "padding: 8px;"+
                                "text-align: center;"+
                            "}"+
        
                        "</style>"+
                    "</head>"+
                    "<body>"+
                    "<h1>Tabela de cores HTML</h1>"+
                    "<br><br>"+
                    "<table>";

        arqGravacao.write(bloco);
        
        for(int i = 0; i<primeiro.length;i++ ){
            for(int j = 0; j<segundo.length; j++){
                for(int k = 0; k<terceiro.length; k++){
                    valorHEX = "#" + primeiro[i] + "0" + segundo[j] + "0" + terceiro[k] + "0";
                    bloco = "<tr><td>" + valorHEX + "</td><td style='background-color:" + valorHEX + "'</td>" + valorHEX + "</tr>";
                    arqGravacao.write(bloco);
                }
            }
        }

        bloco = "</table>"+
        "</body>"+
        "</html>";
        arqGravacao.close();
    }
}