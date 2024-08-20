package Aula06;

public class Chefe extends Trabalhador implements SeguroSaude {
    private double salarioBase;
    private String matriculaPlano;
    private int qtdeDependentes;

    public Chefe(String nome, String sobrenome, double salarioBase, String matriculaPlano, int qtdeDependentes) {
        super(nome, sobrenome);
        this.salarioBase = salarioBase;
        this.matriculaPlano = matriculaPlano;
        this.qtdeDependentes = qtdeDependentes;
    }

    public String getMatriculaPlano() {
        return this.matriculaPlano;
    }
    public int getQtdeDependentes() {
        return this.qtdeDependentes;
    }
    public String getNomeCompletoTitular() {
        return getNome() + " " + getSobrenome();
    }


    @Override
    public double gerarSalario() {
        return 0;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setMatriculaPlano(String matriculaPlano) {
        this.matriculaPlano = matriculaPlano;
    }

    public void setQtdeDependentes(int qtdeDependentes) {
        this.qtdeDependentes = qtdeDependentes;
    }
}

