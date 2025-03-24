/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.aula;

/**
 *
 * @author lab53
 */
public class Produto {

    private final String nome;
    private double preco;
    private Tipo tipo;

    public Produto(String nome, double preco, Tipo tipo) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void mostrar(){
        System.out.println("Nome:"+ nome);
        System.out.println("Preco:"+ preco);
        System.out.println("Tipo:"+ tipo);
    }


}
