//referência: https://www.youtube.com/watch?v=YpEbYp-1Hpw&list=PLfDIQS3HDSglAa4I5Rab5GZVM5zJkuVBL&index=13
//referência: https://www.youtube.com/watch?v=gOa88DOzEfc&list=PLfDIQS3HDSglAa4I5Rab5GZVM5zJkuVBL&index=14
//referência: https://www.youtube.com/watch?v=eUhH-x_bGlY&list=PLfDIQS3HDSglAa4I5Rab5GZVM5zJkuVBL&index=15
package controller;
//model=package ; Produto = classe
import model.Produto;

public class ProdutoController {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 18.50, 100); //produto1 é umainstância da classe Produto (ou, simplesmente um objeto)
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.getEstoque());
        produto1.setEstoque(-100);
        System.out.println(produto1.getEstoque());


        Produto produto2 = new Produto("Feijão", 8.30, 100);
        System.out.println();
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.getEstoque());

        Produto produto3 = new Produto();
        System.out.println();
        System.out.println(produto3.getNome());
        System.out.println(produto3.getValor());
        System.out.println(produto3.getEstoque());

        Produto produto4 = new Produto();
        System.out.println();
        System.out.println(produto4.getNome());
        System.out.println(produto4.getValor());
        System.out.println(produto4.getEstoque());


       Produto produto5 = new Produto("Batata", 2.50, 60);
        System.out.println(produto5.toString());

    }
}

