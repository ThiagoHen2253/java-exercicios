public class IngressoVIP extends Ingresso {

    public IngressoVIP(double valorBase) {
        super(valorBase);
    }

    @Override
    public double calcularPreco() {
        return valorBase + 20;
    }
}
