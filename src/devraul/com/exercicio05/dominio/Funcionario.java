package devraul.com.exercicio05.dominio;

import devraul.com.exercicio05.servico.QuantidadeSalariosMinimos;

public abstract class Funcionario implements QuantidadeSalariosMinimos {
    private String nome;
    private double salario;

    public static final double SALARIO_MINIMO = 1293.20;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void calculaQuantidadeSalariosMinimos() {
        double qntSalariosMinimos = this.salario / SALARIO_MINIMO;
        System.out.printf("%s recebe %.2f, equivalente a %.2f salários mínimos[%.2f]\n", this.nome,this.salario, qntSalariosMinimos, SALARIO_MINIMO);
    }
}
