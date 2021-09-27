package br.com.zup.Exemplo2;

public class Main {
    public static void main(String[] args) {
        Professores prof1 = new Professores("Eve", "32542542", "4535235", "java", 5000, "2", "Java","23423", "525");
        Coodernadores cord = new Coodernadores("23423", "324324", "24523", "523534", 5000);

        System.out.println(cord);
        cord.adicionarProfessores(prof1);
        System.out.println(cord);
        double novoSalario = cord.aumentarSalario();
        cord.setSalario(novoSalario);
        System.out.println(cord);
    }
}
