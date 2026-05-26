public class Pessoa  implements Comparable<Pessoa>{
    private String nome;
    private String cpf;
    private String DataNascimento;

    public Pessoa(){}
    public Pessoa(String nome, String cpf, String DataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.DataNascimento = DataNascimento;
    }

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}
    public String getDataNascimento() {return DataNascimento;}
    public void setDataNascimento(String dataNascimemto) {this.DataNascimento = dataNascimemto;}

    
    @Override
    public String toString() {
        return "pessoa [nome=" + nome + ", cpf=" + cpf + ", dataNascimemto=" + DataNascimento + "]";
    }
    public String escreveObjetoCrv(){
        return nome + "," + cpf + "," + DataNascimento;
    }

    @Override
    public int compareTo(Pessoa outra) {
        return this.nome.compareTo(outra.nome);
    }
}
