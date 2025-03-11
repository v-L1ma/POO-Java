/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.aula;

/**
 *
 * @author lab53
 */
public class Bateria {

    private int carga;

    public Bateria(int carga) {
        this.carga = Math.min(Math.max(0, carga),100);
    }

    public void gastar(int quantidade){
        int aux = Math.min(carga, quantidade);
        assert(aux>carga):"A quantidade deve ser menor que a carga";
        carga = carga-aux;
    }

    public void recarregar(){
        if(carga<=95){
            carga = carga + 5;
        } else {
            carga = 100;
        }

    }

    public boolean  isVazio(){
        return carga==0;
    }

    public boolean verificarPeloMenos5(){
        return carga >=5;
    };

}
