package br.com.zup;

public class Professores extends Funcionarios {

    Turma turma;
    private String graduacao;
    private String disciplina;
    private int qtdAlunos;
    private int qtdTurmas;

    public Professores(String nome, String cpf, String numRegistro, String orgaoLotacao, double salario, String graduacao, String disciplina, int qtdAlunos, int qtdTurmas) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
        this.graduacao = graduacao;
        this.disciplina = disciplina;
        this.qtdAlunos = qtdAlunos;
        this.qtdTurmas = qtdTurmas;
    }

    public Professores(String nome, String cpf, String numRegistro, String orgaoLotacao, double salario, Turma turma, String graduacao, String disciplina) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
        this.turma = turma;
        this.graduacao = graduacao;
        this.disciplina = disciplina;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public int getQtdTurmas() {
        return qtdTurmas;
    }

    public int setQtdTurmas(int qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
        return qtdTurmas;
    }

    public int adicionarTurma(int quatidade){
        qtdTurmas = qtdTurmas + quatidade;
        System.out.println("Quantidade de turmas: "+qtdTurmas);
        return qtdTurmas;
    }
    public int adicionarAlunos(int quantidade){
        qtdAlunos = qtdAlunos + quantidade;
        System.out.println("Quantidade de alunos: "+qtdAlunos);
        return qtdAlunos;
    }
}
