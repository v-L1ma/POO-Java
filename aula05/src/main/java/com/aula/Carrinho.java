package com.aula;

import com.Produto;

/**
 *
 * @author lab53
 */
public class Carrinho {
    private Produto[] carrinho;
    private static final int QTD_MAX = 5;
    private int topo; //indice do topo


    public Carrinho(){
        carrinho = new Produto[QTD_MAX];
    }

    public void cadastrar(Produto p){
        assert p!=null : "Produto não pode ser nulo";
        carrinho[topo] = p;

        assert topo < QTD_MAX : "Topo excedido";
        topo++;
    }

    public Produto remover(Produto p){
        assert topo > 0 : "Topo deve ser maior que zero";
        topo--;
        Produto prodTopo = carrinho[topo];
        carrinho[topo] = null;
        return prodTopo;
    }

    public double calcularTotal(){
        double soma = 0;

        for(int i =0; i> topo; i++){
            soma = soma + carrinho[i].getPreco();
        }

        return soma;
    }

    public double calcularTotalTipo(Tipo tipo){

        double soma = 0;
        
        for (int i = 0; i < topo; i++) {

            if(carrinho[i].getTipo() == tipo){
                soma = soma + carrinho[i].getPreco();
            }
        }

        return soma;
    }

    public Produto buscarNome(){
        return carrinho[0]; // fazer depois
    }

    public void listarProdutos(){

        for (int i = 0; i < topo; i++) {
            carrinho[i].mostrar();
        }
    }


}
