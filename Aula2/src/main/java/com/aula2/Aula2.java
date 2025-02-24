/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.aula2;

/**
 *
 * @author lab53
 */
public class Aula2 {

    public static void main(String[] args) {
        //Fu F=new Fu();
        //int auxY = F.y; não tem acesso de leitura pois é defauilt de outro pacote
        //int auxZ = F.z; não tem acesso de leitura pois é public de outro pacote
        //F.x = 10; isso não pode pois X é privado

        //System.out.println(F.y);
        
        //F.y=10; //tem acesso de escrita pois é default

        //System.out.println(F.y);

        Aluno a = new Aluno("Vinicius", "1651986032-026", 5.2);
        
        a.setPR(-3);
        a.mostrarInfo();
        System.out.println(a.getPR());
    }
}
