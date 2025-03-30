/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.aula;


/**
 *
 * @author Vinicius Lima
 */
public class Ex1Simulado {


    public static void main(String[] args) {

        Carro Civic = new Carro();
        Carro HB20 = new Carro();
        Radar radar1 = new Radar();

        System.out.println("Hello World!");
        System.out.println(Civic.getEstado());
        System.out.println(Civic.getVelocidade());
        System.out.println("primeira mudanca ");
        Civic.alterarEstado();
        Civic.mostrarEstado();
        Civic.alterarEstado();
        Civic.acelerar(15.6);

        HB20.alterarEstado();
        HB20.mostrarEstado();
        HB20.alterarEstado();
        HB20.acelerar(45.4);


        
        radar1.adicionarCarro(Civic);
        radar1.adicionarCarro(HB20);

        radar1.listarCarrosDesligados();
        radar1.listarCarrosMovendo();

    }


}
