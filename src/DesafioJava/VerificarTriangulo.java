package DesafioJava;
import java.util.Scanner;

public class VerificarTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro lado do triângulo: ");
        double lado1 = entrada.nextDouble();

        System.out.print("Digite o segundo lado do triângulo: ");
        double lado2 = entrada.nextDouble();

        System.out.print("Digite o terceiro lado do triângulo: ");
        double lado3 = entrada.nextDouble();

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os lados formam um triângulo válido.");
        } else {
            System.out.println("Os lados não formam um triângulo válido.");
        }
    }
}

