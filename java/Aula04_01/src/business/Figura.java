package business;

public abstract class Figura implements IFigura{

    protected float lado, altura;

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
}
