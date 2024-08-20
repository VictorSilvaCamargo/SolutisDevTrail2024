package Aula05;

public class Matrizes {
    public static void main(String[] args) {
        int[][] tabuleiroInt = new int[8][8];
        int valorInt = 1;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabuleiroInt[i][j] = valorInt;
                valorInt *= 2;
            }
        }

        System.out.println("Matriz Int\n");

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tabuleiroInt[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Matriz Long \n");

        long[][] tabuleiroLong = new long[8][8];
        long valorLong = 1;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                tabuleiroLong[i][j] = valorLong;
                valorLong *= 2;
            }
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(tabuleiroLong[i][j] + " ");
            }
            System.out.println();
        }


    }
}
