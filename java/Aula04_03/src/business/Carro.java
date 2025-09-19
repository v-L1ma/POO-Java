package business;

public class Carro extends Veiculo{

    private int quantidadePortas;

    public Carro(String modelo, String fabricante,String ano,int quantidadePortas){
        super(modelo,fabricante,ano);
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    @Override
    public void Acelerar(){
        if (velocidadeAtual>=180) {
            System.out.println("Limite de velocidade dos veículos é 180km/h.");
            return;
        }

        velocidadeAtual += 10;
    }

    @Override
    public String toString(){
        return  "Modelo: " + getModelo() + "Fabricante: " + getFabricante() + "Ano: " + getAno() + " Velocidade: " + getVelocidadeAtual() + "quantidadePortas: " + quantidadePortas;
    }
}
