package Exercicio0;

public class QuadradoNumeros {

    public static void exibirQuadrados() {
        for (int i = 0; i <= 10; i++) {
            int quadrado = i * i;
            System.out.println("O quadrado de " + i + " é " + quadrado);
        }
    }

    public static void main(String[] args) {
        exibirQuadrados();
    }
}

