package Aula06;

public abstract class Trabalhador {
    private String nome;
    private String sobrenome;

    public Trabalhador(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public abstract double gerarSalario();

    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }

}
