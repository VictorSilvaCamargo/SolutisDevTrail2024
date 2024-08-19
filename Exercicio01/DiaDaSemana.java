package Exercicio01;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] diasDaSemana = {
                "Segunda-feira", "Terça-feira", "Quarta-feira",
                "Quinta-feira", "Sexta-feira", "Sábado", "Domingo"
        };

        System.out.print("Digite um número de 1 a 7: ");
        int numero = scanner.nextInt();

        if (numero >= 1 && numero <= 7) {
            String dia = diasDaSemana[numero - 1];
            System.out.println("O dia correspondente é: " + dia);
        } else {
            System.out.println("Número inválido! Por favor, digite um número de 1 a 7.");
        }
    }
}
