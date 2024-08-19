package Exercicio01;

import java.util.Scanner;

public class MonitoramentoConsumo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quilometragemTotal = 0;
        int litrosTotal = 0;

        int numeroDeTanques = 0;

        while (true) {
            System.out.print("Digite a quilometragem dirigida (ou -1 para encerrar): ");
            int quilometragem = scanner.nextInt();

            if (quilometragem == -1) {
                break;
            }

            System.out.print("Digite a quantidade de combustível em litros: ");
            int litros = scanner.nextInt();

            if (litros <= 0) {
                System.out.println("A quantidade de combustível deve ser positiva.");
                continue;
            }

            double consumo = (double) quilometragem / litros;
            System.out.printf("Consumo para este tanque: %.2f km/l%n", consumo);

            quilometragemTotal += quilometragem;
            litrosTotal += litros;
            numeroDeTanques++;
        }

        if (numeroDeTanques > 0) {
            double consumoMedio = (double) quilometragemTotal / litrosTotal;
            System.out.printf("Quilometragem combinada: %d km%n", quilometragemTotal);
            System.out.printf("Soma total de litros de combustível: %d l%n", litrosTotal);
            System.out.printf("Consumo médio: %.2f km/l%n", consumoMedio);
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }
    }
}
