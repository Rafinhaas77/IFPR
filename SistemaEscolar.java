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
        Turma t = new Turma();
        System.out.println("Cadastro de Turma");
        System.out.println("Numero da Turma");

        t.setNumeroTurma(Integer.parseInt(reader.readLine()));

        System.out.println("Nome do Curso");
        t.setNomeCurso(reader.readLine());
        System.out.println("Ano");
        t.setAno(Integer.parseInt(reader.readLine()));

        System.out.println("----Alunos----");

        for(int i = 0; i < 40; i++){
            System.out.println("Nome:");
            String nome = reader.readLine();
            if(nome.equals('')){
                break;
            }
            Aluno aluno = new Aluno();
            aluno.setNome(nome);
            System.out.println("Matricula");
            aluno.setMatricula(reader.readLine());
            System.out.println("Nota 1");
            aluno.setNota1(Float.parseFloat(reader.readLine()));
            System.out.println("Nota 2");
            aluno.setNota2(Float.parseFloat(reader.readLine()));
            System.out.println("Nota 3");
            aluno.setNota3(Float.parseFloat(reader.readLine()));
            System.out.println("Nota 4");
            aluno.setNota4(Float.parseFloat(reader.readLine()));
            t.setAluno(aluno);
        }
        this.e1.setTurma(t);
    }

    //listar turmas
    private void listarTurmas(){

    }

    //consultar turma
    private void consultarTurma(){

    }
}
