package DesafioJava;

import java.util.Scanner;

public class EncontrarMaiorNumero {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = entrada.nextInt();

        if (numero1 > numero2) {
            System.out.println("O maior número é: " + numero1);
        } else if (numero2 > numero1) {
            System.out.println("O maior número é: " + numero2);
        } else {
            System.out.println("Os números são iguais.");
        }
    }
}

