import java.util.Scanner;

public class ClassificacaoTemperatura08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a temperatura em Celsius: ");
        double temperatura = scanner.nextDouble();

        if (temperatura < 13) {
            System.out.println("Está frio.");
        } else if (temperatura >= 13 && temperatura <= 25) {
            System.out.println("Está moderado.");
        } else {
            System.out.println("Está quente.");
        }

        scanner.close();
    }
}
