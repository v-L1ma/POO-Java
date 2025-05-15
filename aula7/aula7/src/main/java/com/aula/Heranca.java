package com.aula;

public class Heranca {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Produto produto = new Produto();

        System.out.println(Gerador.gerarInsert(cliente));
        System.out.println(Gerador.gerarInsert(produto));

//        Circulo c = new Circulo(7);
//        System.out.println(c.calcularPerimetro());
//
//        Gato gato = new Gato();
//        Cachorro dog = new Cachorro();
//
//        gato.mamar();
//        gato.emitirSom();
//        gato.reproduzir();
//        gato.respirar();
//
//        dog.mamar();
//        dog.emitirSom();
//        dog.reproduzir();
//        dog.respirar();


    }
}