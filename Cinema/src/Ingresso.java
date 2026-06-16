public abstract class Ingresso {

    protected double valorBase;

    public Ingresso(double valorBase) {
        this.valorBase = valorBase;
    }

    public abstract double calcularPreco();

    public void exibirPreco() {
        System.out.println("Preço: R$ " + calcularPreco());
    }
}
