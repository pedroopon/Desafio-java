package DesafioJava;
import java.util.Scanner;

public class DescontoCompra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Digite a categoria do cliente (1 para comum, 2 para associado, 3 para VIP): ");
        int categoria = scanner.nextInt();

        double desconto = 0.0;

        switch (categoria) {
            case 1:
                // Cliente comum (sem desconto)
                break;
            case 2:
                // Cliente associado (10% de desconto)
                desconto = 0.10;
                break;
            case 3:
                // Cliente VIP (20% de desconto)
                desconto = 0.20;
                break;
            default:
                System.out.println("Categoria inválida. Digite 1, 2 ou 3.");
                return;
        }

        double valorFinal = valorCompra - (valorCompra * desconto);
        System.out.printf("Valor final da compra: R$%.2f%n", valorFinal);
    }
}
