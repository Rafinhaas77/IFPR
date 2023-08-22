public class Companhia {
    private String nome;
    private String fone;
    private int qtdVoos;
    private Voo[] vetVoos;

    public Companhia(){
        this.vetVoos = new Voo[10];
        this.qtdVoos = 0;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }
    public void setFone(String fone) {
        this.fone = fone;
    }

    public Voo getVoo(int pos){
        return this.vetVoos[pos];
    }
    public void setVoo(Voo v){
        if(this.qtdVoos < 10){
            this.vetVoos[this.qtdVoos] = v;
            this.qtdVoos++;
        }
    } 
    
    public int getQtdVoos(){
        return this.qtdVoos;
    }    
}


