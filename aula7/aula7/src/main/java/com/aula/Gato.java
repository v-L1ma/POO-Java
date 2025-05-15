package com.aula;

public class Gato implements Mamifero{

    @Override
    public void reproduzir(){
        System.out.println("UIII");
    }

    @Override
    public void mamar(){
        System.out.println("GUT GUT");
    }

    @Override
    public void emitirSom(){
        System.out.println("MIAUUUUUUUUUUUUUUUUUUUU");
    }
}
