package br.com.zup.Exemplo1;

public class Administrativos extends Funcionarios{
    private String funcaoAdm;
    private String senioridade;

    public String getFuncaoAdm() {
        return funcaoAdm;
    }

    public void setFuncaoAdm(String funcaoAdm) {
        this.funcaoAdm = funcaoAdm;
    }

    public String getSenioridade() {
        return senioridade;
    }

    public void setSenioridade(String senioridade) {
        this.senioridade = senioridade;
    }

    public Administrativos(String nome, String senioridade, double salario, String funcaoAdm, String senioridade1) {
        super(nome, senioridade, salario);
        this.funcaoAdm = funcaoAdm;
        this.senioridade = senioridade1;
    }
}
