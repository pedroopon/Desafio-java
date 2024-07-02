package DesafioJava;
import java.util.Scanner;

public class VerificaNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            // Número positivo
            double raizQuadrada = Math.sqrt(numero);
            System.out.printf("Raiz quadrada: %.2f%n", raizQuadrada);
        } else if (numero < 0) {
            // Número negativo
            double numeroAoQuadrado = numero * numero;
            System.out.printf("Número ao quadrado: %.2f%n", numeroAoQuadrado);
        } else {
            System.out.println("O número é zero.");
        }
    }
}
