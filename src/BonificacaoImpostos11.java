
class Funcionario {
    private final String nome;
    private final double salarioBase;
    private double bonificacao;
    private double imposto;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        double salarioBase1 = salarioBase;
        return salarioBase1;
    }

    public double getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(double bonificacao) {
        this.bonificacao = bonificacao;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularSalarioLiquido() {
        return salarioBase + bonificacao - imposto;
    }
}

public class BonificacaoImpostos11 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carla", 1612.00);

        // Exemplo de bonificação e imposto
        funcionario.setBonificacao(500.00);
        funcionario.setImposto(300.00);

        double salarioLiquido = funcionario.calcularSalarioLiquido();
        System.out.println("Salário líquido de " + funcionario.getNome() + ": R$ " + salarioLiquido);
    }
}
