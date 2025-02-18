package com.ex1;


public class Produto {

    String nome;
    Double preco;
    Status status;

    Produto(String nome, Double preco, Status status){
        this.nome = nome;
        this.preco = preco;
        this.status = status;
    }

    void mostrarPreco(){
        switch (status) {
            case NORMAL:
                System.out.println("Produto"+ nome + ": R$" + preco);
                break;
            case PROMOCAO:
                preco = preco-((preco * 20)/100);
                System.out.println("Produto"+ nome + ": R$" + preco);
                break;
            case BAIXO_ESTOQUE:
                preco = preco+((preco * 10)/100);
                System.out.println("Produto"+ nome + ": R$" + preco);
                break;
            default:
                System.out.println("Status não encontrado");
        }
    }

}
