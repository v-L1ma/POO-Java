package com.aula;

import com.Produto;

/**
 *
 * @author lab53
 */
/*  Exemplo (carrinho de produtos): Em um e-commerce todo produto possui nome, preço e tipo(escritório, tecnologia e vestuário) .
    Em um um carrinho podemos ter vários produtos e ele provera as funcionalidades:
    -calcular o total da compra
*/

public class Aula05 {

    public static void main(String[] args) {
        
        Produto p1 = new Produto("Apagador", 100, Tipo.ESCRITORIO);
        Produto p2 = new Produto("Gis", 2.5, Tipo.ESCRITORIO);
        Produto p3 = new Produto("Regua", 10, Tipo.ESCRITORIO);
        Carrinho k = new Carrinho();
        k.cadastrar(p1);
        k.cadastrar(p2);
        k.cadastrar(p3);
        k.cadastrar(null);
        k.listarProdutos();
    }
}
