/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aula;

/**
 *
 * @author lab53
 */
public class Celular {

    private String nome, numero;
    private Bateria bat;
    private Status status;

    public Celular(Bateria bat, String nome, String numero, Status status) {
        this.bat = bat;
        this.nome = nome;
        this.numero = numero;
        this.status = status;
    }

    public void ligar() {
        if (bat.isVazio() || status.getStatus()) {
            return;
        }
        bat.gastar(5);
        System.err.println("Oi " + nome);
        status = status.ON;
    }

    public void desligar() {
        if (status.getStatus()) {
            status = Status.OFF;
            System.out.println("...");
        }
    }

    public void mostrarInfo(){
        if(!bat.verificarPeloMenos5() || !status.getStatus()){
            return;
        }
        bat.gastar(5);
        System.out.println("Nome:"+nome);
        System.err.println("Numero:"+numero);
    }

}
