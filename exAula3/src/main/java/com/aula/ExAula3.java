/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.aula;

/**
 *
 * @author lab53
 */
public class ExAula3 {

    public static void main(String[] args) {
        
        Bateria b = new Bateria(50);
        Celular cel = new Celular(b, "Vinicius", "13981934062", Status.OFF);

        cel.ligar();
        cel.mostrarInfo();

    }
}
