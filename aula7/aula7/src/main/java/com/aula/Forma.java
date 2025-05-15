package com.aula;

public abstract class Forma {

    private double medida;

    public Forma(double medida){
        this.medida=medida;
    }

    public double getMedida() {
        return medida;
    }

    public abstract double calcularPerimetro();

    public abstract double calcularArea();
    
}
