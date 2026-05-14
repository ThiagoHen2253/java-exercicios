public class Bicicleta implements  Veiculos{
    private String montanha;

    public Bicicleta(String montanha){
        this.montanha = montanha;
    }

    @Override
    public void acelerar() {
       System.out.println("Voce esta pedalando mais!!!");
    }

    @Override
    public void frear() {
       System.out.println("voce freio a bicicleta!!");
    }

    @Override
    public String obterTipo() {
        return "bicicleta";
    }

    public String getMontanha() {return montanha;}
    public void setMontanha(String montanha) {this.montanha = montanha;}



}
