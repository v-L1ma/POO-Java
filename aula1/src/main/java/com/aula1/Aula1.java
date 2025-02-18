/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.aula1;

/**
 *
 * @author lab53
 */
public class Aula1 {

    public static void main(String[] args) {
       Aluno a = new Aluno("Vinicius", Curso.ADS);
       Aluno b = new Aluno("Vanuza", Curso.RH);


       a.mostrarInformacao();
        b.mostrarInformacao(); 
    }
}
