package Exercicio01;

import java.util.Scanner;

public class OrdenaPalavras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = scanner.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = scanner.nextLine();

        if (palavra1.compareTo(palavra2) < 0) {
            System.out.println("Ordem alfabética:");
            System.out.println(palavra1);
            System.out.println(palavra2);
        } else {
            System.out.println("Ordem alfabética:");
            System.out.println(palavra2);
            System.out.println(palavra1);
        }

        if (palavra1.length() > palavra2.length()) {
            System.out.println("A palavra com o maior número de caracteres é: " + palavra1);
        } else if (palavra1.length() < palavra2.length()) {
            System.out.println("A palavra com o maior número de caracteres é: " + palavra2);
        } else {
            System.out.println("As palavras têm o mesmo número de caracteres.");
        }
    }
}
