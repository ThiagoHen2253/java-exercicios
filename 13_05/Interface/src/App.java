
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculos> listaVeiculos =  new ArrayList<>();
        listaVeiculos.add(new Carro("Fusca"));
        System.out.println("Digite o tipo da bicicelta");
        listaVeiculos.add(new Bicicleta(sc.next()));

        for (Veiculos veiculos : listaVeiculos){
            veiculos.acelerar();
            veiculos.frear();
            System.out.println(veiculos.obterTipo());
        }
        sc.close();
        
    }
}
