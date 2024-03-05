// https://youtu.be/zqZDrxDpPUM?list=PLfDIQS3HDSglAa4I5Rab5GZVM5zJkuVBL
package controller;

public class ProdutoController {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 18.50, 100); //produto1 é umainstância da classe Produto (ou, simplesmente um objeto)
        System.out.println(produto1.nome);
        System.out.println(produto1.valor);
        System.out.println(produto1.estoque);

        Produto produto2 = new Produto("Feijão", 8.30, 100);
        System.out.println();
        System.out.println(produto2.nome);
        System.out.println(produto2.valor);
        System.out.println(produto2.estoque);

        Produto produto3 = new Produto();
        System.out.println();
        System.out.println(produto3.nome);
        System.out.println(produto3.valor);
        System.out.println(produto3.estoque);

        Produto produto4 = new Produto();
        System.out.println();
        System.out.println(produto4.nome);
        System.out.println(produto4.valor);
        System.out.println(produto4.estoque);


        //Métodos construtores;
        //Introdução ao encapsulamento
        //Métodos acessores

    }
}
class Produto{
    String nome;
    double valor;
    int estoque;

    public Produto() {
    }

    public Produto(String nome, double valor, int estoque) {
        this.nome = nome;
        this.valor = valor;
        this.estoque = estoque;
    }
}
