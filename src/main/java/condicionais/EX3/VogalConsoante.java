package condicionais.EX3;

import java.util.Scanner;

public class VogalConsoante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        String input = scanner.nextLine();

        char letra = input.charAt(0);

        if (letra >= 'a' && letra <= 'z') {
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("A letra é vogal!");
            } else {
                System.out.println("A letra é consoante!");
            }
        } else {
            System.out.println("A letra informada não é válida!");
        }
    }
}

