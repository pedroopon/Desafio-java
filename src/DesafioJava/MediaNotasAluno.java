package DesafioJava;

import java.util.Scanner;

public class MediaNotasAluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7) {
            System.out.println("Aluno aprovado! Média: " + media);
        } else if (media >= 5) {
            System.out.println("Aluno em recuperação. Média: " + media);
        } else {
            System.out.println("Aluno reprovado. Média: " + media);
        }
    }
}

