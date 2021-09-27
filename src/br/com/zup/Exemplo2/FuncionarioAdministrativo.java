package br.com.zup.Exemplo2;

public class FuncionarioAdministrativo extends Funcionarios{
    private String funcaoAdm;
    private String senioridade;

    public FuncionarioAdministrativo() {
    }

    public FuncionarioAdministrativo(String nome, String cpf, String registro, String orgaoLotacao, double salario, String funcaoAdm, String senioridade) {
        super(nome, cpf, registro, orgaoLotacao, salario);
        this.funcaoAdm = funcaoAdm;
        this.senioridade = senioridade;
    }

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

    @Override
    public String toString() {
        return "FuncionarioAdministrativo{" +
                "funcaoAdm='" + funcaoAdm + '\'' +
                ", senioridade='" + senioridade + '\'' +
                '}';
    }
}
