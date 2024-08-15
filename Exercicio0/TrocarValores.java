package Exercicio0;

public class TrocarValores {

    public static void main(String[] args) {
        trocarValores(3,4);
    }
    public static void trocarValores(int a, int b) {
        System.out.println("Antes da troca: A = " + a + ", B = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Depois da troca: A = " + a + ", B = " + b);
    }
}
