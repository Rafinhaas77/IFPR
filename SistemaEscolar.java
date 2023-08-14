import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SistemaEscolar {
    private Escola e1;
    BufferedReader reader;
    public static void main(String[] args) throws Exception{
        SistemaEscolar se = new SistemaEscolar();
        se.e1 = new Escola();
        se.reader = new BufferedReader(
            new InputStreamReader(System.in));

        System.out.println("Nome da escola:");
        se.e1.setNome(se.reader.readLine());
        System.out.println("Telefone:");
        se.e1.setFone(se.reader.readLine());
        se.menu();
    }

    //menu
    private void menu() throws Exception{
        String opcao = "";
        while(!opcao.equals("4")){
            System.out.println("------------------------");
            System.out.println("[1] Cadastrar nova turma");
            System.out.println("[2] Listar turmas existentes");
            System.out.println("[3] Consultar uma turma");
            System.out.println("[4] Sair");
            opcao = this.reader.readLine();
            switch (opcao) {
                case "1":
                    this.cadastrarTurma();
                    break;
                case "2":
                    this.listarTurmas();
                    break;
                case "3":
                    this.consultarTurma();
                    break;
                default:
                    break;
            }
        }
    }

    //cadastrar turma
    private void cadastrarTurma(){

    }

    //listar turmas
    private void listarTurmas(){

    }

    //consultar turma
    private void consultarTurma(){

    }
}
