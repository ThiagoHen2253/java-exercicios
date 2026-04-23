public class Ave extends Animal{


    public Ave(){}
    public Ave(String nome, int patas, double velocidade, int localizacao){
        super(nome, patas, velocidade, localizacao);
    }

    @Override
    public void mover(){
        setLocalizacao(getLocalizacao() + 10);
    }
    
}
