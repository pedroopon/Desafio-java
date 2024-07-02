package DesafioJava;

import java.util.Scanner;

public class VerificaIntervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;

        System.out.print("Digite um número: ");
        numero = scanner.nextDouble();

        if (numero >= 10 && numero <= 20) {
            System.out.println("O número está dentro do intervalo de 10 a 20.");
        } else {
            System.out.println("O número está fora do intervalo de 10 a 20.");
        }

        scanner.close();
    }
}
