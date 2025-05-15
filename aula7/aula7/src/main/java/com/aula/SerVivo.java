package com.aula;

public interface SerVivo {

    default void respirar(){
        System.out.println("Respirei");
    }

    void reproduzir();
}
