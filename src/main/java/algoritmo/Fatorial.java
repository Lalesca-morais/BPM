package algoritmo;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int fatorial = 1;

        do {
            System.out.print("Digite um valor inteiro(entre 1 e 12): ");
            numero = entrada.nextInt();
        } while (numero <= 0 || numero >= 13);

        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}



