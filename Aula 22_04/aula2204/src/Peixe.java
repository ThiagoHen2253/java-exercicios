public class Peixe extends Animal{
    private int agua;

    public Peixe(){}
    public Peixe(String nome, int patas, double velocidade, int localizacao, int agua){
        super(nome, patas, velocidade, localizacao);
        this.agua = agua;
    }
    public int getAgua() {return agua;}
    public void setAgua(int agua) {this.agua = agua;}

    @Override
    public void mover(){
        System.out.println("Peixe " + getNome() + " movendo ~ ~ ~ ~ >");
       // int localAtual = getLocalizacao();
        //localAtual += 2;
        setLocalizacao(getLocalizacao() + 2);

    }
    


   

    
    
}
