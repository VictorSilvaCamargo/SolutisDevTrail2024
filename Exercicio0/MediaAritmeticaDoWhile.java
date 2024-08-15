package Exercicio0;

import java.util.Scanner;

public class MediaAritmeticaDoWhile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double soma = 0;

        do {
            System.out.print("Digite o número " + (count + 1) + ": ");
            double numero = scanner.nextDouble();
            soma += numero;
            count++;
        } while (count < 50);


        double media = soma / 50;


        System.out.println("A média aritmética dos 50 números é: " + media);


        scanner.close();
    }
}
