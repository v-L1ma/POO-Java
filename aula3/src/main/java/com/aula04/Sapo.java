/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.aula04;

/**
 *
 * @author lab53
 */
public class Sapo {

    private int qtPulo;
    private static int qtSapo;

    public Sapo(){
        qtPulo++;
        qtSapo++;
    }

    public int getQtPulo() {
        return qtPulo;
    }

    public static int getQtSapo() {
        return qtSapo;
    }
    

}
