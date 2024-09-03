
public class DescontoProgressivo10  {

    public static void main(String[] args) {
        double valorCompra = 200.00; // Valor da compra
        double desconto = calcularDesconto(valorCompra);
        double valorFinal = valorCompra - desconto;

        System.out.println("Valor da Compra: R$ " + valorCompra);
        System.out.println("Desconto Aplicado: R$ " + desconto);
        System.out.println("Valor Final: R$ " + valorFinal);
    }

    public static double calcularDesconto(double valor) {
        double desconto = 0.0;

        if (valor <= 100) {
            desconto = 0.05 * valor;
        } else if (valor <= 200) {
            desconto = 0.10 * valor;
        } else {
            desconto = 0.15 * valor;
        }

        return desconto;
    }
}