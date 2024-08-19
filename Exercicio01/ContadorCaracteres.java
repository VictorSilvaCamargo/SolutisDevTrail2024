package Exercicio01;

import java.util.Scanner;

public class ContadorCaracteres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma cadeia de caracteres: ");
        String texto = scanner.nextLine();

        int contadorVogais = 0;
        int contadorEspacos = 0;
        int contadorConsoantes = 0;

        String textoMinusculo = texto.toLowerCase();

        for (char c : textoMinusculo.toCharArray()) {
            if (c == ' ') {
                contadorEspacos++;
            } else if (isVogal(c)) {
                contadorVogais++;
            } else if (Character.isLetter(c)) {
                contadorConsoantes++;
            }
        }

        // Exibe os resultados
        System.out.println("Quantidade de vogais: " + contadorVogais);
        System.out.println("Quantidade de espaços em branco: " + contadorEspacos);
        System.out.println("Quantidade de consoantes: " + contadorConsoantes);
    }

    private static boolean isVogal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
