package br.com.zup.Exemplo1;

public class Funcionarios {
    private String nome;
    private String senioridade;
    private double salario;

    public Funcionarios(String nome, String senioridade, double salario) {
        this.nome = nome;
        this.senioridade = senioridade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}