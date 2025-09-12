package business;

public class Adicao extends Calculo{

    public Adicao(float valor1, float valor2){
        this.valor1=valor1;
        this.valor2=valor2;
    }

    @Override
    public void calcular() {
        this.resultado = this.valor1+this.valor2;
    }
}
