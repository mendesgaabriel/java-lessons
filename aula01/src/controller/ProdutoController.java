// https://youtu.be/KPv53bxCHXc?list=PLfDIQS3HDSglAa4I5Rab5GZVM5zJkuVBL
package controller;

public class ProdutoController {
    public static void main(String[] args) {


        Produto produto1 = new Produto();
        System.out.println(produto1.nome);
        System.out.println(produto1.valor);
        System.out.println(produto1.estoque);

    }
}
class Produto {
    String nome;
    double valor;
    int estoque;
}
