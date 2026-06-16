public class IngressoMeia extends Ingresso {

    public IngressoMeia(double valorBase) {
        super(valorBase);
    }

    @Override
    public double calcularPreco() {
        return valorBase / 2;
    }
}