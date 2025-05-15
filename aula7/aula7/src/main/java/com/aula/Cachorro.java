package com.aula;

public class Cachorro implements Mamifero{
    @Override
    public void mamar() {
        System.out.println("GutGUt");
    }

    @Override
    public void reproduzir() {
        System.out.println("Fazendo novo cachorro");
    }

    @Override
    public void emitirSom() {
        System.out.println("AUAUAAUUAUAUA");
    }
}
