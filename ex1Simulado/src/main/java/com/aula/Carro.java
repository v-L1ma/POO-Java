/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.aula;

/**
 *
 * @author Vinicius Lima
 */
public class Carro {

    private EstadoDoCarro estado;
    private double velocidade;

    public Carro() {
        this.estado = estado.DESLIGADO;
        this.velocidade = 0;
    }

    public EstadoDoCarro getEstado() {
        return estado;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public EstadoDoCarro alterarEstado() {

        switch (estado) {
            case estado.DESLIGADO:
                return estado = estado.LIGADO;

            case estado.LIGADO:
                return estado = estado.MOVENDO;

            case estado.MOVENDO:
                return estado = estado.PARADO;

            case estado.PARADO:
                return estado = estado.DESLIGADO;

            default:
                throw new AssertionError();
        }
    }

    public double acelerar(double aceleracao) {
        if (estado == estado.MOVENDO) {

                return velocidade += aceleracao;

        } else return 0;
    }

    public void mostrarEstado() {
        System.out.println("Estado:" + estado);
        System.out.println("Velocidade:" + velocidade);
    }

}
