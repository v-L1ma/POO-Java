/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.ex1;

/**
 *
 * @author lab53
 */
public class Ex1 {

    public static void main(String[] args) {
       
       Produto b = new Produto("Banana", 10.0, Status.PROMOCAO);

       b.mostrarPreco();

       Produto t = new  Produto("Teclado", 100.0, Status.BAIXO_ESTOQUE);

       t.mostrarPreco();

       Produto c = new Produto("Cadeira", 20.0, Status.NORMAL);

       c.mostrarPreco();
    }
}
