/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aula04;

/**
 *
 * @author lab53
 */
public class Cliente {

    private String nome;

    //puxa todos o membros publicos de endereço
    private Endereco endereco;

    public Cliente(Endereco endereco, String nome) {
        this.endereco = endereco;
        this.nome = nome;
    }


    public void mostrarInfos() {
        System.out.println("Nome:" + nome);
        //Reaproveitando o metodo já criado na classe endereço
        endereco.mostrarInfos();
    }

}
