package Exercicio0;

public class DivisaoPor2 {

    public static void imprimirDivisoes() {

        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0) {

                int resultadoInt = i / 2;

                double resultadoDouble = i / 2.0;

                System.out.println("Número: " + i);
                System.out.println("Divisão por 2 (int): " + resultadoInt);
                System.out.println("Divisão por 2 (double): " + resultadoDouble);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        imprimirDivisoes();
    }
}
