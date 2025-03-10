/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.aula04;

/**
 *
 * @author lab53
 */
public class Endereco {

    private String cep, logradouro, cidade;
    private Estado estado;

    public Endereco(String cep, String cidade, Estado estado, String logradouro) {
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
        this.logradouro = logradouro;
    }

    public void  mostrarInfos() {
        System.out.println("Cep:" + cep);
        System.out.println("Cidade:" + cidade);
        System.out.println("Logradouro:" + logradouro);
        System.out.println("Estado:" + estado);
    }
    
}
