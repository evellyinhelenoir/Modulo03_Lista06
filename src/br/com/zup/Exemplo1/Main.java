package br.com.zup.Exemplo1;

public class Main {
    public static void main(String[] args) {
        Professores professor = new Professores("André", "Graduação", 90000, "Java");
        Professores professor2 = new Professores("Marcio", "doutorado", 70000000, "C#");
        Professores professor3 = new Professores("Dorayen","Pos doutorado", 486432573, "OBJECTIVE C");

        Coordenadores cordenador = new Coordenadores("Barbara", "Senior", 700000000);

        cordenador.adicionarProfessor(professor);
        cordenador.adicionarProfessor(professor2);
        cordenador.adicionarProfessor(professor3);

        System.out.println(cordenador);
    }
}