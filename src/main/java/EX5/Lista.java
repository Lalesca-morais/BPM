package EX5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.print("Digite a quatidade de números que deseja inserir na lista: ");
        int tamanho = scanner.nextInt();

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            int numero = scanner.nextInt();
            numeros.add(numero);
        }
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println("\n-----Lista de forma decrescente-----");

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}

