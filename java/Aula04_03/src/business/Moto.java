package business;

import java.io.Console;

public class Moto extends Veiculo{
    private boolean descansoAcionado;

    public Moto(String modelo, String fabricante,String ano) {
        super(modelo,fabricante,ano);
    }

    @Override
    public void Acelerar(){
        if (velocidadeAtual>0){
            descansoAcionado=false;
        }

        if (velocidadeAtual>=180) {
            System.out.println("Limite de velocidade dos veículos é 180km/h.");
            return;
        }

        velocidadeAtual += 5;
    }

    @Override
    public void Desacelerar(){
        if (velocidadeAtual<=0){
            descansoAcionado=false;
            return;
        }
        velocidadeAtual -= 5;
    }

    @Override
    public String toString(){
        return  " Modelo: " + getModelo() + " Fabricante: " + getFabricante() + " Ano: " + getAno() + " Velocidade: " + getVelocidadeAtual() + " Descanso: " + descansoAcionado;
    }
}
