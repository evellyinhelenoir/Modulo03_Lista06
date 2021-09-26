package br.com.zup;

import java.util.List;

public class Coordenadores extends Funcionarios {
    private int professoresSupervisionados = 0;
    public int capacidadeCoordernador;
    public int referencia = 0;

    public Coordenadores(String nome, String cpf, String numRegistro, String orgaoLotacao, double salario, int capacidadeCoordernador) {
        super(nome, cpf, numRegistro, orgaoLotacao, salario);
        this.capacidadeCoordernador = capacidadeCoordernador;
    }

    public int getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }

    public void setProfessoresSupervisionados(int professoresSupervisionados) {
        this.professoresSupervisionados = professoresSupervisionados;
    }

    @Override
    public double aumentaSalario(double aumento) {
        aumento = getSalario() * 1.05;
        return aumento;
    }

    public int adicionarProfessores(int quantidade) {

        if (referencia < capacidadeCoordernador && quantidade <= capacidadeCoordernador) {

            System.out.println("Professor adicionado com sucesso.");
            referencia = referencia + quantidade;
            this.professoresSupervisionados = this.professoresSupervisionados + quantidade;


        } else {
            System.out.println("Você excedeu a quantidade de professores que este coordenador pode supervisionar.");
        }
        return professoresSupervisionados;
    }
}