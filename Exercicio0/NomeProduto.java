package Exercicio0;


public class NomeProduto {

    public static String obterNomeProduto(String codigo) {
        if (codigo.equals("001")) {
            return "Parafuso";
        } else if (codigo.equals("002")) {
            return "Porca";
        } else if (codigo.equals("003")) {
            return "Prego";
        } else {
            return "Diversos";
        }
    }

    public static void main(String[] args) {
        String produto1 = obterNomeProduto("001");
        String produto2 = obterNomeProduto("002");
        String produto3 = obterNomeProduto("003");
        String produto4 = obterNomeProduto("004");

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        System.out.println(produto4);
    }
}

