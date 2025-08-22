package view;

import domain.Aluno;
import domain.Professor;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Vinicius", "vinicius@hotmail.com", 1);

        System.out.println(aluno1.entrarNaSala());

        Aluno aluno2 = new Aluno("Vanuza", "Vanuza@hotmail.com", 2);

        System.out.println(aluno2.entrarNaSala("aluna"));

        Professor professor = new Professor("Davi", "davi@hotmail.com",33);

        System.out.println(professor.entrarNaSala());
    }
}