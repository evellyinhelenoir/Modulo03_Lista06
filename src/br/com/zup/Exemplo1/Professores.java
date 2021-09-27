package br.com.zup.Exemplo1;

public class Professores extends Funcionarios{
    private String disciplina;

    public Professores(String nome, String senioridade, double salario, String disciplina) {
        super(nome, senioridade, salario);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        StringBuilder retornoDoMetodo = new StringBuilder();
        retornoDoMetodo.append("Nome: " + getNome());
        retornoDoMetodo.append("\t Senioridade: " + getSenioridade());
        retornoDoMetodo.append("\t Salario: " + getSalario());
        retornoDoMetodo.append("\t Disciplina: " +getDisciplina());
        return retornoDoMetodo.toString();


        //  String retorno = "Nome: " +this.getNome() + " \t Senioridade: " +this.getSenioridade() + " \t Disciplina: " +this.getDisciplina();
        //  return retorno;
    }
}