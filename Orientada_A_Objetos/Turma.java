public class Turma {
    private int numeroTurma;
    private String nomeCurso;
    private int ano;
    private int qtdeAlunos;
    private Aluno[] vetAlunos;

    public Turma(){
        this.vetAlunos = new Aluno[40];
        this.qtdeAlunos = 0;
    }

    public int getNumeroTurma(){
        return this.numeroTurma;
    }
    public void setNumeroTurma(int nt){
        this.numeroTurma = nt;
    }
    public String getNomeCurso() {
        return nomeCurso;
    }
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public Aluno getAluno(int pos){
        return this.vetAlunos[pos];
    }
    public void setAluno(Aluno a){
        if(this.qtdeAlunos < 40){
            this.vetAlunos[qtdeAlunos] = a;
            this.qtdeAlunos++;
        }
    }
    public int getQtdeAlunos(){
        return this.qtdeAlunos;
    }
}
