
package com.aula1;

public class Aluno {

    String nome;
    Curso curso; //declarando um ENUM
    
    Aluno(String nome, Curso curso){
        this.nome = nome;
        this.curso = curso;
    }

    void mostrarInformacao(){
        System.out.println(nome);
        switch (curso) {
            case ADS:
                System.out.println("CURSO DE COBOL");
                break;
            case SI:
                System.out.println("CURSO DE DESIGN");
                break;   
            case CD:
                System.out.println("CURSO DE PYTHON");
                break;
            case RH:
                System.out.println("CURSO DE HUMANAS");
                break;
            default:
                System.out.println("NGM LIGA");
        }
    }
}
