package Aula06;

public class Principal {

    public static void main(String[] args) {
        // Criação dos trabalhadores
        SeguroSaude[] trabalhadores = {
                new Chefe("Carlos", "Silva", 5000.0, "C123", 2),
                new Chefe("Maria", "Fernandes", 6000.0, "C456", 1),
                new TrabalhadorPorComissao("João", "Pereira", 10000.0, 0.1, "T789", 3,"001","RJ"),
                new TrabalhadorPorComissao("Ana", "Souza", 15000.0, 0.15, "T101", 0,"002","SP")
        };

        // Impressão da legislação do seguro
        System.out.println("Legislação do Seguro: " + SeguroSaude.LEGISLACAO);

        // Impressão das informações dos trabalhadores
        for (SeguroSaude trabalhador : trabalhadores) {
            System.out.println("\nMatrícula do Plano: " + trabalhador.getMatriculaPlano());
            System.out.println("Nome Completo do Titular: " + trabalhador.getNomeCompletoTitular());
            System.out.println("Quantidade de Dependentes: " + trabalhador.getQtdeDependentes());
        }
    }
}

