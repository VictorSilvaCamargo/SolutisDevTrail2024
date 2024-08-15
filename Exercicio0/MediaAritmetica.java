package Exercicio0;

import java.util.Scanner;

public class MediaAritmetica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        double soma = 0;


        while (count < 50) {
            System.out.print("Digite o número " + (count + 1) + ": ");
            double numero = scanner.nextDouble();
            soma += numero;
            count++;
        }


        double media = soma / 50;


        System.out.println("A média aritmética dos 50 números é: " + media);

        scanner.close();
    }
}
