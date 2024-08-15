package Exercicio0;

public class VerificadorParImpar {

    public static void verificarParImpar(int numero) {
        if (numero % 2 == 0) {
            System.out.println(numero + " é um número par.");
        } else {
            System.out.println(numero + " é um número ímpar.");
        }
    }

    public static void main(String[] args) {
        int numero1 = 7;
        int numero2 = 4;


        verificarParImpar(numero1);
        verificarParImpar(numero2);
    }
}

