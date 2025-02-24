/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.aula2;

/**
 *
 * @author lab53
 */
public class Aluno {

    private String nome , ra;
    private double pr;

    public Aluno(String nome, String ra, double pr){
        this.nome = nome;
        this.ra = ra;
        this.pr =Math.min(10, Math.max(0, pr));//validando para não ser menor que zero
    }

    public void mostrarInfo(){
        System.out.println("Nome:" + nome);
        System.out.println("Ra:" + ra);
        System.out.println("PR:" + pr);
    }

    // Evitar
    public void  setPR(double pr){
        this.pr = pr;
    }

    //leitura do PR
    public double getPR(){
        return pr;
    }


}
