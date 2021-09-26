package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Turma turma1 = new Turma(23, 1);
        List<Coordenadores> coordenadores = new ArrayList<>();
        Coordenadores coord = new Coordenadores("Eve", "30000000333", "298", "Sao Paulo",299, 8);
        Professores prof1 = new Professores("Paulo", "3294293", "3284739", "Rio de Janeiro", 2345, "Havard", "Biologia", 12, 2);

        prof1.adicionarTurma(5);
        prof1.adicionarAlunos(5);

       coordenadores.add(coord);

        boolean loop = true;

        while (loop) {
            System.out.println("Digite 1 para adicionar professores aos coordenadores.\n" +
                    "Digite 2 para mostrar a lista de professores supervisionados.\n" +
                    "Digite 3 para fechar o programa.");
            int opcao = scan.nextInt();
            scan.nextLine();

            if (opcao == 1){

                for (Coordenadores referencia : coordenadores){

                    System.out.println("Digite a quantidade de professores que deseja adicionar.\n" +
                            "Limite máximo de professores deste coordenador: "+coord.capacidadeCoordernador);
                    coord.adicionarProfessores(scan.nextInt());
                    System.out.println("Quantidade de professores atuais: "+coord.referencia+"\n" +
                            "");
                }

            }else if(opcao == 2){
                System.out.println("Quantidade total de professores deste coordenador: "+coord.getProfessoresSupervisionados()+"\n" +
                        "");

            }else if(opcao == 3){
                loop = false;
            }
        }
    }
}
