package Exercicio01;

import java.util.Scanner;

public class VerificaPalindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        if (isPalindromo(palavra)) {
            System.out.println("A palavra \"" + palavra + "\" é um palíndromo.");
        } else {
            System.out.println("A palavra \"" + palavra + "\" não é um palíndromo.");
        }
    }

    public static boolean isPalindromo(String palavra) {
        String palavraMinuscula = palavra.toLowerCase();
        int tamanho = palavraMinuscula.length();

        for (int i = 0; i < tamanho / 2; i++) {
            if (palavraMinuscula.charAt(i) != palavraMinuscula.charAt(tamanho - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
