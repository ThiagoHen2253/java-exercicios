public class App {

  public static void main(String[] args) throws Exception {
    Funcionario individuo1 = new Funcionario();
  }

}

public class Funcionario {
  String nome;
  String departamento;
  Double salario;
  String dataDeEntrada;
  String RG;
  Boolean estaNaEmpresa;
  void bonifica(double aumento){
    this.salario +=;
  }
  void demite(){
    this.estaNaEmpresa = false;
  }
  void mostrarDados(){
    String status = this.estaNaEmpresa? "sim": "nao";
    System.out.println("\n ======= Dados do Funcionario =========");
    System.out.println("Nome: " + this.nome);
    System.out.println("departamento: "+ this.departamento);
    System.out.println("salario: "+ this.salario);
    System.out.println(" data de entrada: "+ this.dataDeEntrada);
    System.out.println("RG: "+ this.RG);
    System.out.println("esta na empresa: " + this.estaNaEmpresa);
  }

  // .foramtted ficha 



  

  

}