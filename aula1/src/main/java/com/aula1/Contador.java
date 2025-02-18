package com.aula1;

public class Contador{
    int quantidade;

    void zerar(){
        quantidade = 0;
    }

    void incrementar(){
        quantidade++;

    }

    void decrementar(){
        if( quantidade>0){
            quantidade--;
        }
    }

    void mostrar(){
        System.out.println(quantidade);
    }
}