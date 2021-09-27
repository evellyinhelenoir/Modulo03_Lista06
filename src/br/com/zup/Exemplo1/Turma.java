package br.com.zup.Exemplo1;

public class Turma {

   private int qtdAlunos;
   private int qtdTurmas;

    public Turma(int qtdAlunos, int qtdTurmas) {
        this.qtdAlunos = qtdAlunos;
        this.qtdTurmas = qtdTurmas;
    }
    public Turma (){

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

    public int adicionarTurmaExtra(int quantidade){
        int adicionar = this.setQtdTurmas(quantidade);
        return adicionar;
    }
}
