import java.util.Scanner;
public class Carro implements Veiculos{
    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void acelerar() {
         Scanner sc = new Scanner(System.in);
        System.out.println("Qual a intensidade de aceleracao?");
        int intensidade = sc.nextInt();
       System.out.println("Acelerando carro");
       sc.close();
    }

    @Override
    public void frear() {
       System.out.println("Freio do carro ativado");
    }

    @Override
    public String obterTipo() {
        return "carro";
    }

    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}

    

}
