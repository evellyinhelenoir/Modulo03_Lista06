package br.com.zup.Exemplo2;

import java.util.ArrayList;
import java.util.List;

public class Coodernadores extends Funcionarios{
    private List<Professores> professoresSupervisionados = new ArrayList<>();

    public Coodernadores() {
    }

    public Coodernadores(String nome, String cpf, String registro, String orgaoLotacao, double salario) {
        super(nome, cpf, registro, orgaoLotacao, salario);
    }

    public List<Professores> getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(List<Professores> professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }
    public void adicionarProfessores(Professores professores){
        professoresSupervisionados.add(professores);
    }

    @Override
    public double aumentarSalario(){
        double novoSalario = (0.05 * getSalario()) + getSalario();
        return novoSalario;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("\n Nome: " +getNome());
        retorno.append("\n CPF: "+getCpf());
        retorno.append("\n Registro: "+getRegistro());
        retorno.append("\n Orgao de Lotação: "+getOrgaoLotacao());
        retorno.append("\n Salário: "+getSalario());
        retorno.append("\n Quantidade de Professores Supervisionados: "+ professoresSupervisionados.size());
        retorno.append("\n Professores Supervisionados: "+professoresSupervisionados);
        retorno.append("\n -----------------------------------");
        return retorno.toString();
    }
}
