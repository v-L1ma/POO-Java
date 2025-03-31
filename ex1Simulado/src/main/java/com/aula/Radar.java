package com.aula;

import java.util.ArrayList;

public class Radar{

    private ArrayList<Carro> radar;

    public Radar(){
        radar = new ArrayList<Carro>();
    }

    public void adicionarCarro(Carro carro){

        if(carro != null){
            radar.add(carro);
        }      

    }

    public void listarCarrosMovendo(){

        double velocidadeMedia = 0;
        int qtd = 0;

        for (Carro carro:radar){
            if(carro.getEstado() == EstadoDoCarro.MOVENDO){
             velocidadeMedia +=  carro.getVelocidade();
             qtd++;
            }
            
        }

        velocidadeMedia = velocidadeMedia / qtd;
        
            System.out.println("Carros em movimento:");
            System.out.println("Quantidade:"+ qtd);
            System.out.println("Velocidade media:"+ velocidadeMedia);

    }

    public void listarCarrosDesligados(){

        for (Carro carro:radar){
            if(carro.getEstado() == EstadoDoCarro.DESLIGADO){
            carro.mostrarEstado();
            }
        }

    }

}

