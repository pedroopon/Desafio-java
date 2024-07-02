package DesafioJava;

import java.util.Scanner;

public class CategoriaProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigo;

        System.out.print("Digite o código do produto: ");
        codigo = scanner.nextInt();

        if (codigo >= 1 && codigo <= 10) {
            System.out.println("Categoria: Alimento não-perecível");
        } else if (codigo >= 11 && codigo <= 20) {
            System.out.println("Categoria: Alimento perecível");
        } else if (codigo >= 21 && codigo <= 30) {
            System.out.println("Categoria: Vestuário");
        } else if (codigo >= 31 && codigo <= 40) {
            System.out.println("Categoria: Eletrônicos");
        } else {
            System.out.println("Código inválido");
        }

        scanner.close();
    }
}
