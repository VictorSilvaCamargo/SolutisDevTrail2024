package Exercicio01;

public class DivisaoMultiplosDeTres {
    public static void main(String[] args) {
        System.out.println("Divisão dos múltiplos de 3 por 2 (int e double):");

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                int resultadoInt = i / 2;
                double resultadoDouble = i / 2.0;

                System.out.println("Número: " + i);
                System.out.println("Resultado (int): " + resultadoInt);
                System.out.println("Resultado (double): " + resultadoDouble);
                System.out.println();
            }
        }
    }
}
