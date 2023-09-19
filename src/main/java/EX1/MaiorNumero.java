package EX1;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int valor1 = scanner.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int valor2 = scanner.nextInt();

        if (valor1 > valor2) {
            System.out.println("O maior número é: " + valor1);
        } else if (valor2 > valor1) {
            System.out.println("O maior número é: " + valor2);
        } else {
            System.out.println("Os números são iguais!");
        }
    }
}

