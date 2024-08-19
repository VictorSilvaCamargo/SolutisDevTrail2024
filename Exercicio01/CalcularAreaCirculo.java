package Exercicio01;

import java.util.Scanner;

public class CalcularAreaCirculo {
    private static final double PI = 3.141592653589793;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        // Calcula a área do círculo
        double area = PI * Math.pow(raio, 2);

        // Arredonda o resultado
        double areaArredondada = Math.round(area);

        System.out.println("A área do círculo com raio " + raio + " é: " + areaArredondada);
    }
}
