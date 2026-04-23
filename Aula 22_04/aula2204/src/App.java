public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("\n------ POLIMORFISMO  com animais ------\n");
        Animal animais[] = new Animal[10];
        Animal doguinho = new Animal("Doguinho", 3, 5.5, 0);

        // associar objeto a posicao do array
        animais[0] = doguinho;
        animais[0].mover();

       animais[1] = new Peixe("Nemo", 1, 0.2, 3, 1);
       animais[1].mover();

       animais[2] = new Ave("Aveeee", 2, 20, 0);
       animais[2].mover();
    }
}
