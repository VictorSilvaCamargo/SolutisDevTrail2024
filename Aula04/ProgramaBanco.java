package Aula04;

public class ProgramaBanco {
    public static void main(String[] args) {
        // Criando os clientes
        Cliente cliente1 = new Cliente("987.654.321-09","João da Silva", "São Pailo", "1995");
//        Cliente cliente2 = new Cliente("765.432.109-87","Maria Oliveira", "Rio de Janeiro","1998");

        // Criando a conta corrente
        ContaCorrente conta = new ContaCorrente("12345-6", "Corrente", cliente1, null, 1000.0, 5000.0);

        // Realizando algumas operações de crédito
        conta.credito(500.0);
        conta.credito(200.0);

        // Realizando algumas operações de débito
        conta.debito(300.0);
        conta.debito(1500.0);


        conta.resumo();
    }
}
