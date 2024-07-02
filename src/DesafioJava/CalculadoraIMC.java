package DesafioJava;
import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura (em metros): ");
        double altura = scanner.nextDouble();

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        // Determinação da categoria
        String categoria;
        if (imc < 18.5) {
            categoria = "Abaixo do peso";
        } else if (imc < 24.9) {
            categoria = "Peso normal";
        } else if (imc < 29.9) {
            categoria = "Sobrepeso";
        } else if (imc < 34.9) {
            categoria = "Obesidade Grau I";
        } else if (imc < 39.9) {
            categoria = "Obesidade Grau II";
        } else {
            categoria = "Obesidade Grau III";
        }

        System.out.printf("Seu IMC é %.2f (%s)%n", imc, categoria);
    }
}
