package Aula06;

public class TrabalhadorPorComissao extends Trabalhador implements SeguroSaude, AssociacaoClube {
    private double vendasTotais;
    private double taxaComissao;
    private String matriculaPlano;
    private int qtdeDependentes;
    private String numeroAssociado;
    private String endereco;

    public TrabalhadorPorComissao(String nome, String sobrenome, double vendasTotais, double taxaComissao, String matriculaPlano, int qtdeDependentes, String numeroAssociado, String endereco) {
        super(nome, sobrenome);
        this.vendasTotais = vendasTotais;
        this.taxaComissao = taxaComissao;
        this.matriculaPlano = matriculaPlano;
        this.qtdeDependentes = qtdeDependentes;
        this.numeroAssociado = numeroAssociado;
        this.endereco = endereco;
    }

    @Override
    public String getMatriculaPlano() {
        return matriculaPlano;
    }

    @Override
    public int getQtdeDependentes() {
        return qtdeDependentes;
    }

    @Override
    public String getNomeCompletoTitular() {
        return getNome() + " " + getSobrenome();
    }

    @Override
    public double gerarSalario() {
        return vendasTotais * taxaComissao;
    }

    @Override
    public String getNumeroAssociado() {
        return numeroAssociado;
    }

    @Override
    public String getNomeCompletoAssociado() {
        return getNome() + " " + getSobrenome();
    }

    @Override
    public String getEndereco() {
        return endereco;
    }

    public void setNumeroAssociado(String numeroAssociado) {
        this.numeroAssociado = numeroAssociado;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setVendasTotais(double vendasTotais) {
        this.vendasTotais = vendasTotais;
    }

    public void setTaxaComissao(double taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public void setMatriculaPlano(String matriculaPlano) {
        this.matriculaPlano = matriculaPlano;
    }

    public void setQtdeDependentes(int qtdeDependentes) {
        this.qtdeDependentes = qtdeDependentes;
    }
}
