
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        FileReader fl = new FileReader("src/cadastro_pessoas.csv");
        BufferedReader br = new BufferedReader(fl);

        String line = null;
        br.readLine();
        while ((line = br.readLine()) != null){
           
            String dados[] = line.split(",");
            
            Pessoa p = new Pessoa(dados[0], dados[1], dados[2]);
            pessoas.add(p);
        }
        br.close();
        System.out.println(pessoas.size() + "  pessoas cadatradas no sistema");
        Pessoa p2 = new Pessoa("Odette da Silva", "123.423.456-23", "12/12/1333");

        BufferedWriter bw = new BufferedWriter(new FileWriter("src/cadastro_pessoas.csv", true));

        bw.newLine();
        bw.write(p2.escreveObjetoCrv());
        bw.close();
}
}