//  https://www.youtube.com/watch?v=Y-LGEgcIWJA&list=PLfDIQS3HDSglAa4I5Rab5GZVM5zJkuVBL&index=17
package controller;
//model=package ; Produto = classe
import model.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoController {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Arroz", 10.50, 100);
        Produto produto2 = new Produto("Feijão", 8.30, 100);
        Produto produto3 = new Produto("Café", 13.10, 100);
        Produto produto4 = new Produto("Açúcar", 2.20, 100);
        Produto produto5 = new Produto("Batata", 2.50, 60);

        //criando a coleção e add objetos na coleção
        List<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);
        produtos.add(produto5);
        System.out.println(produtos);

        }

    }


