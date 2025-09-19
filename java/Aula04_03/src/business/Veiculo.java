package business;

public abstract class Veiculo {
    private String modelo;
    private String fabricante;
    private String ano;
    protected int velocidadeAtual;

    public Veiculo(String modelo, String fabricante,String ano){
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.ano = ano;
    }

    public void Acelerar(){
        velocidadeAtual += 5;
    }

    public void Desacelerar(){

        if (velocidadeAtual<=0){
            return;
        }

        velocidadeAtual -= 5;
    }

    public void Parar(){
        velocidadeAtual = 0;
    }

    @Override
    public String toString(){
        return String.format("Veiculo: %s, Velocidade atual %d", modelo,velocidadeAtual);
    }

    public String getModelo() {
        return modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getAno() {
        return ano;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }
}
