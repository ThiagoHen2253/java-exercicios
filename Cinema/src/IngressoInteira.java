public class IngressoInteira extends Ingresso {

    public IngressoInteira(double valorBase) {
        super(valorBase);
    }

    @Override
    public double calcularPreco() {
        return valorBase;
    }
}