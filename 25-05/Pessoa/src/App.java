
import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Pessoa p1 = new Pessoa("Maria das Naves", "2189905965", "10/06/1987");
        Pessoa p2 = new Pessoa("Adriano Silva", "9489936934", "01/01/2000");
        Pessoa p3 = new Pessoa("Eliane Moraes", "1111111124", "23/04/1999");

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        System.out.println("Array sem cordenacao \n" + pessoas);
        Collections.sort(pessoas);
        System.out.println("Array ordenado \n" + pessoas);

        System.out.println("Buscar nome Maria das Naves" + Collections.binarySearch(pessoas, p1));

        Pessoa p5 = new Pessoa("Joao Ribeiro", "04444444400", "15/04/2005");
        Pessoa p6 = new Pessoa("Katia Santana", "143253465367", "19/05/2006");
        Pessoa p7 = new Pessoa("Elisangela Silva", "9465060896", "12/12/2200");

        ArrayList<Pessoa> pessoas2 = new ArrayList<>();
        pessoas2.add(p5);
        pessoas2.add(p6);
        pessoas2.add(p7);

        Collections.sort(pessoas2);

        System.out.println("conjuntos disjuntos?" + Collections.disjoint(pessoas, pessoas2));

        pessoas2.add(p1);
        System.out.println("Depois de add p1 - conjuntos de disjuntos?" + Collections.disjoint(pessoas, pessoas2));

        System.out.println("Frequencia de nome: " + p1.getNome() + Collections.frequency(pessoas, p1));

        Collections.reverse(pessoas2);
        System.out.println("Array Apos Collections.reverse; " + pessoas2);


    }
}
