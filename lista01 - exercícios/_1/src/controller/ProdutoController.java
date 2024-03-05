package controller;


import model.Produto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProdutoController {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        Produto produto3 = new Produto("Batata", "Batata branca", 20.90, 2000);
        Produto produto4 = new Produto("Leite", "Leite latvida", 3.50, 2000);

        Produto produto5 = new Produto("Agua", "Agua da pedra");
        Produto produto6 = new Produto("Coca-cola", "Coca-cola diet");

        System.out.println("Produtos criados com os contrutores padrão e parametrizado");
        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        System.out.println(produto4);
        System.out.println(produto5);
        System.out.println(produto6);

        produto1.setNome("Feijao");
        produto1.setDescricao("Feijao tordilho");
        produto1.setValor(8.90);
        produto1.setEstoque(2000);

        produto2.setNome("Feijao");
        produto2.setDescricao("Feijao branco");
        produto2.setValor(7.90);
        produto2.setEstoque(2000);

        produto3.setNome("Batata");
        produto3.setDescricao("Batata branca");
        produto3.setValor(20.90);
        produto3.setEstoque(2000);

        produto4.setNome("Leite");
        produto4.setDescricao("Leite latvida");
        produto4.setValor(3.50);
        produto4.setEstoque(2000);

        produto5.setNome("Agua");
        produto5.setDescricao("Agua da pedra");
        produto5.setValor(1.90);
        produto5.setEstoque(2000);

        produto6.setNome("Coca-cola");
        produto6.setDescricao("Coca-cola diet");
        produto6.setValor(7.90);
        produto6.setEstoque(2000);

        System.out.println(produto1.getNome());
        System.out.println(produto1.getDescricao());
        System.out.println(produto1.getValor());
        System.out.println(produto1.getEstoque());

        System.out.println(produto2.getNome());
        System.out.println(produto2.getDescricao());
        System.out.println(produto2.getValor());
        System.out.println(produto2.getEstoque());

        System.out.println(produto3.getNome());
        System.out.println(produto3.getDescricao());
        System.out.println(produto3.getValor());
        System.out.println(produto3.getEstoque());

        System.out.println(produto4.getNome());
        System.out.println(produto4.getDescricao());
        System.out.println(produto4.getValor());
        System.out.println(produto4.getEstoque());

        System.out.println(produto5.getNome());
        System.out.println(produto5.getDescricao());
        System.out.println(produto5.getValor());
        System.out.println(produto5.getEstoque());

        System.out.println(produto6.getNome());
        System.out.println(produto6.getDescricao());
        System.out.println(produto6.getValor());
        System.out.println(produto6.getEstoque());

    }
}
