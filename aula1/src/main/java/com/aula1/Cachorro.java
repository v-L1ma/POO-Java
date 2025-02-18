/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.aula1;

/**
 *
 * @author lab53
 */
public class Cachorro {

    String nome, raca; // atributos

    //constructor
    Cachorro(String nome, String raca){
        this.nome = nome;
        this.raca = raca;
        //SEM o this refere-se ao atributo da classe enquando a variavel e o this refere-se
        //ao parametro
    }

    void latir(){
        System.out.println(nome + ": AUAU");

    }

    void mostrarRaca(){
        System.out.println(raca);

    }

}
