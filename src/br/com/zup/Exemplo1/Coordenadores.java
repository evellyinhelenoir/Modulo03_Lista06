package br.com.zup.Exemplo1;


import java.util.ArrayList;
import java.util.List;

public class Coordenadores extends Funcionarios{
    private List<Professores> professoresSupervisionados = new ArrayList<>();

    public Coordenadores(String nome, String senioridade, double salario) {
        super(nome, senioridade, salario);
    }

    public void adicionarProfessor(Professores prof){
        professoresSupervisionados.add(prof);
    }

    public void exibirProfessoresSupervisionados(){
        for (Professores referencia:professoresSupervisionados) {
            System.out.println(referencia);
        }
    }

    public List<Professores> getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    @Override
    public String toString() {
        StringBuilder retornarDados = new StringBuilder();
        retornarDados.append("Nome: " + getNome());
        retornarDados.append("\n Senioridade: " +getSenioridade());
        retornarDados.append("\n Salario: R$ " +getSalario());
        retornarDados.append("\n Professores supervisionados: " +getProfessoresSupervisionados());
        return retornarDados.toString();
    }
}