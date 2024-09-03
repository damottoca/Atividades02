class VerificacaoAprovacao {
    public static void main(String[] args) {
        // Exemplo de notas
        double[] notas = {7.5, 8.0, 6.5, 9.0, 7.0};
        double media = calcularMedia(notas);

        // Verifica se o aluno foi aprovado
        if (media >= 6.0) {
            System.out.println("Aluno aprovado com média: " + media);
        } else {
            System.out.println("Aluno reprovado com média: " + media);
        }
    }

    // Método para calcular a média das notas
    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }
}

