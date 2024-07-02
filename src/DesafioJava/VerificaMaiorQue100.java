package DesafioJava;

import java.util.Scanner;

public class VerificaMaiorQue100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;

        System.out.print("Digite um número: ");
        numero = scanner.nextDouble();

        if (numero > 100) {
            System.out.println("O número é maior que 100.");
        } else {
            double dobro = numero * 2;
            System.out.println("O número não é maior que 100. O dobro desse número é: " + dobro);
        }

        scanner.close();
    }
}
