package com.aula;

public class Retangulo extends Forma{

    private double medida2;

    public Retangulo(double medida, double medida2){
        super(medida);
        this.medida2 = medida2;
    }

    public double getMedida2(){
        return this.medida2;
    }

}
