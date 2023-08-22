public class Voo {
    private int identificador;
    private String modeloAviao;
    private Passageiro[] vetPassageiro;
    private int qtdPassageiros;

    public Voo(){
        this.vetPassageiro = new Passageiro[120];
        this.qtdPassageiros = 0;
    }

    public int getIdentificador(){
        return this.identificador;
    }
    public void setIdentificador(int i){
        this.identificador = i;
    }

    public String getModeloAviao(){
        return this.modeloAviao;
    }
    public void setModeloAviao(String m){
        this.modeloAviao = m;
    }

    public Passageiro getPassageiro(int pos){
        return this.vetPassageiro[pos];
    }
    public void setPassageiro(Passageiro p){
        if(this.qtdPassageiros < 120){
            this.vetPassageiro[qtdPassageiros] = p;
            this.qtdPassageiros++;
        }
    }

    public int getQtdPassageiros(){
        return this.qtdPassageiros;
    }
}
