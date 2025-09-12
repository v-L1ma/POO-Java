import business.Figura;
import business.Quadrado;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Quadrado quadradoUpCasting = new Quadrado();
        quadradoUpCasting.setLado(5);

        Figura figuraUpCasting = quadradoUpCasting;

        System.out.println(figuraUpCasting.calcular());

        Figura figuraDownCasting = new Quadrado();
        Quadrado quadradoDown = (Quadrado)figuraDownCasting;

        quadradoDown.setLado(10);
    }
}