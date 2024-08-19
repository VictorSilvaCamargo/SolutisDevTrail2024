package Exercicio01;

import java.util.Scanner;

public class ConversaoMilhasKm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância em milhas: ");
        double milhas = scanner.nextDouble();

        double quilometros = milhas * 1.609;

        System.out.println(milhas + " milhas equivalem a " + quilometros + " quilômetros.");
    }
}
