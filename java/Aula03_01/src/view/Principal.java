package view;

import business.Adicao;
import business.Dividir;
import business.Multiplicar;
import business.Subtrair;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================================================================");
        System.out.println("Sistema matematico de fazer calculos matematicos".toUpperCase());
        System.out.println("==========================================================================================");
        System.out.println();
        System.out.println();
        System.out.println("Insira dois numeros que eu irei realizar cada tipo de calculo matematico com eles!!!");

        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();

        System.out.println(num1);
        System.out.println(num2);

        Adicao adicao = new Adicao(num1,num2);
        adicao.calcular();
        Subtrair subtrair = new Subtrair(num1,num2);
        subtrair.calcular();
        Dividir dividir = new Dividir(num1,num2);
        dividir.calcular();
        Multiplicar multiplicacao = new Multiplicar(num1,num2);
        multiplicacao.calcular();

        System.out.println("Adição: " + adicao.getResultado());
        System.out.println("Subtração: " + subtrair.getResultado());
        System.out.println("Dividir: " + dividir.getResultado());
        System.out.println("Multiplicar: " + multiplicacao.getResultado());
    }
}
