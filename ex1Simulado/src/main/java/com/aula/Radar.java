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

        for (Carro carro:radar){
            if(carro.getEstado() == EstadoDoCarro.MOVENDO){
             velocidadeMedia +=  carro.getVelocidade();
            }
            
        }

        velocidadeMedia = velocidadeMedia / radar.size();
        
            System.out.println("Carros em movimento:");
            System.out.println("Quantidade:"+ radar.size());
            System.out.println("Velocidade media:"+ velocidadeMedia);

    }

    public void listarCarrosDesligados(){

        for (Carro carro:radar){
            if(carro.getEstado() == EstadoDoCarro.DESLIGADO){
            System.out.println("Carro:");
            System.out.println("Estado:"+carro.getEstado());
            System.out.println("Velocidade:"+carro.getVelocidade());
            }
        }

    }

}

