import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CompainhaAerea {

    private Companhia companhia;
    BufferedReader reader;
    public static void main(String[] args) throws Exception{
        CompainhaAerea compainhaAerea = new CompainhaAerea();
        compainhaAerea.companhia = new Companhia();
        compainhaAerea.reader = new BufferedReader(
            new InputStreamReader(System.in));

        System.out.println("Nome da compainha aerea:");
        compainhaAerea.companhia.setNome(compainhaAerea.reader.readLine());
        System.out.println("Telefone:");
        compainhaAerea.companhia.setFone(compainhaAerea.reader.readLine());
        compainhaAerea.menu();
    }

    private void menu() throws Exception{
        String opcao = "";
        while(!opcao.equals("4")){
            System.out.println("------------------------");
            System.out.println("[1] Cadastrar novo voo");
            System.out.println("[2] Listar voos existentes");
            System.out.println("[3] Consultar um voo");
            System.out.println("[4] Sair");
            opcao = this.reader.readLine();
            switch (opcao) {
                case "1":
                    this.cadastrarVoo();
                    break;
                case "2":
                    this.listarVoos();
                    break;
                case "3":
                    this.consultarVoo();
                    break;
                default:
                    break;
            }
        }
    }

    private void cadastrarVoo() throws Exception{
        Voo voo = new Voo();
        System.out.println("Cadastro de voo:");
        System.out.println("Informe o identificado do voo:");

        voo.setIdentificador(Integer.parseInt(reader.readLine()));

        System.out.println("Informe o modelo do aviao:");
        voo.setModeloAviao(reader.readLine());

        System.out.println("Cadastro de passageiros no voo "+ voo.getIdentificador());

        for(int i = 0; i < 120; i++){
            System.out.println("Nome:");
            String nome = reader.readLine();
            if(nome.equals("")){
                break;
            }
            Passageiro passageiro = new Passageiro();
            passageiro.setNome(nome);
            System.out.println("Informe o RG:");
            passageiro.setRG(reader.readLine());
            voo.setPassageiro(passageiro);
        }
        this.companhia.setVoo(voo);
    }

    private void listarVoos(){
        System.out.println("---------------------");
        System.out.println("Relatorio dos Voos:");
        for(int i = 0; i < this.companhia.getQtdVoos(); i++){
            System.out.println("Voo Numero: " + this.companhia.getVoo(i).getIdentificador()
            + " - Modelo: " + this.companhia.getVoo(i).getModeloAviao());
        }
    }

    private void consultarVoo() throws Exception{
        System.out.println("----------------------");
        System.out.println("Consulta de voo");
        System.out.println("Identificador do voo:");
        int identificadorVoo = Integer.parseInt(reader.readLine());
        boolean achou = false;

        for(int i = 0; i < this.companhia.getQtdVoos(); i++){
            Voo voo = this.companhia.getVoo(i);
            if(voo.getIdentificador() == identificadorVoo){
                System.out.println("Passageiros no voo:");
                int posPassageiro = 0;
                while(voo.getPassageiro(posPassageiro) != null){
                    String linha = "Nome: " + voo.getPassageiro(posPassageiro).getNome();
                    linha += "RG: " + voo.getPassageiro(posPassageiro).getRG();
                    System.out.println(linha);
                    posPassageiro++;
                }
                int vazio = 120 - voo.getQtdPassageiros();
                System.out.println("A quantidade de assentos livres nesse voo eh: " + vazio);
                achou = true;
                break;
            }
        }
        if(!achou){
            System.out.println("Voo não encontrado");
        }
    }
}
