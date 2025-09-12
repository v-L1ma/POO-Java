package business;

public class Dividir extends Calculo{

    public Dividir(float valor1, float valor2){
        this.valor1=valor1;
        this.valor2=valor2;
    }

    @Override
    public void calcular() {
        if (valor2==0){
            this.resultado = 0;
            System.out.println("O valor do divisor não pode ser zero...");
        } else {
            this.resultado = this.valor1/this.valor2;
        }
    }
}