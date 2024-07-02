package DesafioJava;

import java.util.Scanner;

public class ConverterNotaParaConceito {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota do aluno: ");
        double nota = entrada.nextDouble();

        if (nota >= 9) {
            System.out.println("Conceito A");
        } else if (nota >= 7) {
            System.out.println("Conceito B");
        } else if (nota >= 5) {
            System.out.println("Conceito C");
        } else if (nota >= 3) {
            System.out.println("Conceito D");
        } else {
            System.out.println("Conceito F");
        }
    }
}

