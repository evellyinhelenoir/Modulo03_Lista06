package br.com.zup;

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

    public Administrativos(String nome, String cpf, String numRegistro, String orgaoLotacao, double salario, String funcaoAdm, String senioridade) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
        this.funcaoAdm = funcaoAdm;
        this.senioridade = senioridade;


    }
}
