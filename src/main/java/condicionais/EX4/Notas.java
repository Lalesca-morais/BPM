package condicionais.EX4;

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno(entre 0 e 10): ");
        double nota = scanner.nextDouble();

        if (nota >= 0 && nota <= 10) {
            if (nota >= 8) {
                System.out.println("Aluno aprovado!");
            } else if (nota >= 6) {
                System.out.println("Aluno em recuperação!");
            } else {
                System.out.println("Aluno reprovado!");
            }
        } else {
            System.out.println("Nota inválida, favor digitar uma nota válida.");
        }
    }
}
