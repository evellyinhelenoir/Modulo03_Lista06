package br.com.zup.Exemplo2;

public class Professores extends Funcionarios{
    private String nivelGraduacao;
    private String disciplina;
    private String qtdAlunos;
    private String qtdTurmas;

    public Professores() {
    }

    public Professores(String nome, String cpf, String registro, String orgaoLotacao, double salario, String nivelGraduacao, String disciplina, String qtdAlunos, String qtdTurmas) {
        super(nome, cpf, registro, orgaoLotacao, salario);
        this.nivelGraduacao = nivelGraduacao;
        this.disciplina = disciplina;
        this.qtdAlunos = qtdAlunos;
        this.qtdTurmas = qtdTurmas;
    }

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(String qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public String getQtdTurmas() {
        return qtdTurmas;
    }

    public void setQtdTurmas(String qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
    }
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Nome: " +getNome());
        retorno.append("\n CPF: "+getCpf());
        retorno.append("\n Registro: "+getRegistro());
        retorno.append("\n Orgao de Lotação: "+getOrgaoLotacao());
        retorno.append("\n Salário: "+getSalario());
        retorno.append("\n Nivel de Graduação: "+nivelGraduacao);
        retorno.append("\n Disciplina Ministrada: "+disciplina);
        retorno.append("\n Quantidade de Alunos: "+qtdAlunos);
        retorno.append("\n Quantidade de Turmas: "+qtdTurmas);
        return retorno.toString();
    }
}
