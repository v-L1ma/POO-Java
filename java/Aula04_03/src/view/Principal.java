package view;

import business.Carro;
import business.Moto;
import business.Veiculo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Vai querer andar de que?");
        System.out.println("1- Carro");
        System.out.println("2- Moto");

        Veiculo veiculo = null;

        String opcaoEscolhidaMenu1 = scanner.next();
        switch (opcaoEscolhidaMenu1){
            case "1":
                veiculo = new Carro("HB20", "Hyundai", "2020", 4);
                break;
            case "2":
                veiculo = new Moto("mt03", "Honda", "2025");
                break;
            default:
                System.out.println("Por favor, escolha uma das opções acima");
                break;
        }

        assert veiculo != null;
        String opcaoEscolhidaMenu2;
        do {
            System.out.println("O que quer fazer agora?");
            System.out.println("1- Acelerar");
            System.out.println("2- Desacelerar");
            System.out.println("3- Parar");
            System.out.println("0- Sair");

            opcaoEscolhidaMenu2 = scanner.next();

            switch (opcaoEscolhidaMenu2){
                case "1":
                    veiculo.Acelerar();
                    break;
                case "2":
                    veiculo.Desacelerar();
                    break;
                case "3":
                    veiculo.Parar();
                    break;
                case "0":
                    break;
                default:
                    System.out.println("Por favor, escolha uma das opções acima");
                    break;
            }

            System.out.println(veiculo);
        }while(!opcaoEscolhidaMenu2.equals("0"));
    }
}

//- crie uma primeira classe chamada Principal (onde terá a função "main"; pacote: "view");
//
//- elabore uma segunda classe chamada Veiculo (abstrata) que deverá ficar num pacote chamado "business". Nela, deverão existir os atributos "modelo",
// "fabricante", "ano" e "velocidadeAtual". Além disso, deverão existir os métodos "acelerar", "desacelerar" e "parar", onde a velocidade sofrerá,
// respectivamente, o acréscimo de 5km/h, o decréscimo de 5km/h e a atribuição de 0km/h (desaceleração total);
//
//- desenvolva uma terceira classe chamada Carro, que seja subclasse de Veiculo. Nela, inclua o atributo "quantidadePortas" (que deverá ser alimentado
// pelo usuário) e faça um polimorfismo do método "acelerar", de modo a aumentar a velocidade de 10km/h em 10km/h (não mais de 5km/h em 5km/h);
//
//- crie uma quarta classe chamada Moto, também subclasse de Veiculo; ela deverá ter o atributo "descansoAcionado" (booleano) e um polimorfismo do
// método "acelerar", outro do método "desacelerar" e outro para método "parar": quando a velocidade for igual a 0, o atributo "descansoAcionado" deverá
//  ser verdadeiro; quando a velocidade for maior que 0, o atributo deverá ir para falso;
//
//- na classe Principal, permita ao usuário selecionar qual tipo de veículo ele quer utilizar (carro ou moto) e instancie o que for correspondente;
//
//- aumente e diminua as velocidades a seu bel prazer, sempre exibindo a velocidade (e o modelo do veículo) a cada alteração (considere criar um
// método ou sobrescrever o método "toString" para exibir essas informações);
//
//        - (opcional) se preferir incrementar mais o exercício, permita ao usuário escolher quando acelerar e desacelarar.
//
//
//Requisitos adicionais:
//        - utilize um construtor não-default na classe Veiculo com a seguinte assinatura:
//public Veiculo(String modelo, String fabricante, int ano);
//
//- implemente o encapsulamento (getters e setters) de modo que o valor da velocidade não possa ser alterado por alguma classe externa
// (alheia à regra de negócio), devendo ser alterada, apenas, pelos métodos de negócio ("acelerar", "desacelerar" e "parar");
//
//- limite a faixa de velocidade dos veículos entre 0km/h a 180km/h.
//
//- utilize os conceitos de downcasting e/ou upcasting obrigatoriamente na classe Principal.
//
