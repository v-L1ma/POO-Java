/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.aula;

/**
 *
 * @author lab53
 */
public class Conta {

    private String nome;
    private double saldo;


    public Conta(String nome, double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }


    public double getSaldo(){
        return saldo;
    }

    public String getNome(){
        return nome;
    }

    public void  depositar(double valor){
        if(valor>0){
            saldo += valor;
        }
    }

    public void retirar(double valor){
        if(saldo>=valor){
            saldo -= valor;
        } else System.out.println("Saldo insuficiente");
    }

    public boolean verificarSaldo(){
        return saldo>0;
    }


}
