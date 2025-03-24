/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.aula;

import java.util.ArrayList;
import java.util.Optional;

/**
 *
 * @author lab53
 */
public class Carrinho {

    private ArrayList<Produto> carrinho;

    public Carrinho (){
        carrinho = new ArrayList<Produto>();
    }

    public void adicionar(Produto p){
        if(p != null){
            carrinho.add(p);
            
        }
    }

    public void listar(){

        for (int i = 0; i < carrinho.size() ; i++) {
            
           carrinho.get(i).mostrar();
        }

        /*for (Produto produto : carrinho) {

            produto.mostrar();
            
        }*/

    }

    public double calcularTotal(){
        
        double soma =0;

        for(Produto produto:carrinho){
            soma += produto.getPreco();
        }

        return soma;
    }

    public double  calcularTotal(Tipo tipo){
        double soma =0;

        for (Produto produto : carrinho) {
            if(tipo == produto.getTipo()){
                soma+=produto.getPreco();
            }
        }
        return soma;
    }

    public Optional<Produto> buscarPrimeiroPorNome(String nome){

        for(Produto produto: carrinho){
            if(nome.equals(produto.getNome())){
                return Optional.of(produto);
            }
        }
        return  Optional.empty();
    }

    public ArrayList<Produto> buscarPorNome(String nome){

        ArrayList<Produto> produtos = new ArrayList<Produto>();

        for (Produto produto : carrinho) {
            if(nome.equals(produto.getNome())){

                produtos.add(produto);
            }
        }

        return produtos;

    }

    public void removerProduto(String nome){
        Optional<Produto> produtoAchadoOuNao = buscarPrimeiroPorNome(nome);
        if(produtoAchadoOuNao.isPresent()){
            carrinho.remove(produtoAchadoOuNao.get());
        } else {
            System.out.println("Produto não encontrado");
        }
    }

}
