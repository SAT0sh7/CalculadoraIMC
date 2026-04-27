import java.util.Scanner;
import java.util.Locale;
public class CalculadoraIMC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC: %.2f%n", imc);

        if (imc < 18.5) {
            System.out.println("Classificacao: Abaixo do peso");
        } else if (imc >= 18.5 && imc < 25.0) {
            System.out.println("Classificacao: Peso normal");
        } else if (imc >= 25.0 && imc < 30.0) {
            System.out.println("Classificacao: Sobrepeso");
        } else {
            System.out.println("Classificacao: Obesidade");
        }

        scanner.close();
    }
}



