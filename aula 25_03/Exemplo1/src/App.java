import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        Conta conta1 = new Conta();
        System.out.println("Digite seu nome: ");
        String n = sc.next();
        conta1.setNome(n);
        conta1.setNumero(2);
        // System.out.println(conta1.toString());

        Conta conta2 = new Conta();
        conta2.setNumero(5);
        System.out.println(conta1.toString());
        System.out.println(conta2.toString());


        sc.close();
    }
}
