package br.com.zup.Exemplo2;

public class Funcionarios {
    private String nome;
    private String cpf;
    private String registro;
    private String orgaoLotacao;
    private double salario;

    public Funcionarios() {
    }

    public Funcionarios(String nome, String cpf, String registro, String orgaoLotacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.registro = registro;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double aumentarSalario(){
        double novoSalario = (0.1 * salario) + salario;
        return novoSalario;
    }

    @Override
    public String toString() {
      StringBuilder retorno = new StringBuilder();
      retorno.append("Nome: " +nome);
      retorno.append("\n CPF: "+cpf);
      retorno.append("\n Registro: "+registro);
      retorno.append("\n Orgao de Lotação: "+orgaoLotacao);
      retorno.append("\n Salário: "+salario);
      return retorno.toString();
    }
}
