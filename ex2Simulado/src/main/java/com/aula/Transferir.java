/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.aula;

/**
 *
 * @author lab53
 */
public class Transferir {

    public static void transferir(Conta de, Conta para, double valor){
        if (de.getSaldo()>=valor) {
            de.retirar(valor);
            para.depositar(valor);
        } else System.out.println("Não há saldo suficiente na conta para transferir");
    }

}
