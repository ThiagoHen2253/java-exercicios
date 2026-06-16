import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cinema implements GerenciadorArquivo {

    private ArrayList<Filme> filmes;
    private Scanner scanner;

    public Cinema() {
        filmes = new ArrayList<>();
        scanner = new Scanner(System.in);

        carregarArquivo();
        
    }

    public void cadastrarFilme() {
        scanner.nextLine();

        System.out.print("Funcionário responsável: ");
        String nomeFuncionario =
        scanner.nextLine();

        Funcionario funcionario =
        new Funcionario(
                nomeFuncionario,
                25,
                "Atendente"
        );

        System.out.print("Título do filme: ");
        String titulo = scanner.nextLine();

        System.out.print("Gênero: ");
        String genero = scanner.nextLine();

        System.out.print("Duração (min): ");
        int duracao = scanner.nextInt();

        System.out.print("Classificação indicativa: ");
        int classificacao = scanner.nextInt();
        scanner.nextLine();

        Filme filme = new Filme(
                titulo,
                genero,
                duracao,
                classificacao
        );

        filmes.add(filme);

        System.out.println(
        "Filme cadastrado por: " +
        funcionario.getNome());
    }

    public void listarFilmes() {

        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme cadastrado.");
            return;
        }

        for (Filme filme : filmes) {
            filme.exibirFilme();
        }
    }

    public void comprarIngresso() {
        scanner.nextLine();

        System.out.print("Nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Idade do cliente: ");
        int idade = scanner.nextInt();

        Cliente cliente =

        new Cliente(nome, idade);

    if (filmes.isEmpty()) {
        System.out.println("Nenhum filme cadastrado.");
        return;
    }

    System.out.println("\n===== FILMES DISPONÍVEIS =====");

    for (int i = 0; i < filmes.size(); i++) {

        System.out.println(
                (i + 1) + " - " +
                filmes.get(i).getTitulo()
        );
    }

    System.out.print("Escolha o filme: ");
    int escolha = scanner.nextInt() - 1;

    if (escolha < 0 || escolha >= filmes.size()) {
        System.out.println("Filme inválido.");
        return;
    }

    System.out.println("\nTipo de ingresso:");
    System.out.println("1 - Inteira");
    System.out.println("2 - Meia");
    System.out.println("3 - VIP");
    System.out.print("Escolha: ");

    int tipo = scanner.nextInt();

    Ingresso ingresso;

    switch (tipo) {

        case 1:
            ingresso = new IngressoInteira(30);
            break;

        case 2:
            ingresso = new IngressoMeia(30);
            break;

        case 3:
            ingresso = new IngressoVIP(30);
            break;

        default:
            System.out.println("Tipo inválido.");
            return;
    }

        System.out.println("\n===== COMPRA REALIZADA =====");

        System.out.println("Cliente: " +
        cliente.getNome());

        System.out.println("Idade: " +
        cliente.getIdade());

        System.out.println("Filme: " +
        filmes.get(escolha).getTitulo());

ingresso.exibirPreco();
}

    public void menu() {

        int opcao;

        do {

            System.out.println("\n===== CINEMA =====");
            System.out.println("1 - Cadastrar Filme");
            System.out.println("2 - Listar Filmes");
            System.out.println("3 - Comprar Ingresso");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    cadastrarFilme();
                    break;

                case 2:
                    listarFilmes();
                    break;

                case 3:
                    comprarIngresso();
                    break;

                case 0:
                    salvarArquivo();
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }
    @Override
public void salvarArquivo() {

    try {

        BufferedWriter writer =
                new BufferedWriter(
                        new FileWriter("filmes.txt")
                );

        for (Filme filme : filmes) {

            writer.write(
                    filme.getTitulo() + ";" +
                    filme.getGenero() + ";" +
                    filme.getDuracao() + ";" +
                    filme.getClassificacao()
            );

            writer.newLine();
        }

        writer.close();

        System.out.println("Filmes salvos com sucesso!");

    } catch (IOException e) {

        System.out.println("Erro ao salvar arquivo.");
    }
}
@Override
public void carregarArquivo() {

    try {

        BufferedReader reader =
                new BufferedReader(
                        new FileReader("filmes.txt")
                );

        String linha;

        while ((linha = reader.readLine()) != null) {

            String[] dados = linha.split(";");

            String titulo = dados[0];
            String genero = dados[1];
            int duracao = Integer.parseInt(dados[2]);
            int classificacao =
                    Integer.parseInt(dados[3]);

            Filme filme = new Filme(
                    titulo,
                    genero,
                    duracao,
                    classificacao
            );

            filmes.add(filme);
        }

        reader.close();

    } catch (IOException e) {

        System.out.println("Nenhum arquivo encontrado.");
    }
}
}
