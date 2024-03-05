//  https://www.youtube.com/watch?v=vkPOMqzArYY&list=PLfDIQS3HDSglAa4I5Rab5GZVM5zJkuVBL&index=19
package controller;
//model=package ; Produto = classe
import model.Produto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ProdutoController {
    public static void main(String[] args) {

        //cada produto simula um registro em um banco de dados
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
        System.out.println("----- Lista Original -----");
        System.out.println(produtos);

        //ordenar a coleção pelo atributo 'nome' do produto
        //utilizando 'get'Nome para acessar nome que é private em Produto.java (encapsulado)
        produtos.sort(Comparator.comparing(Produto::getNome));
        System.out.println("----- Lista Ordenada -----");
        System.out.println(produtos);

        //pesquisa
        //pesquisa de FORÇA BRUTA
        System.out.println();
                                                                    //chave=açucar
        System.out.println("Localizando o produto pelo nome Açucar (pela chave, usando Força Bruta)...");
        produtos.forEach(p -> {
            if(p.getNome() .equals("Açúcar")){
                System.out.println(p);
            }
        });

        //pesquisando na coleção pelo método filter
        System.out.println();
        System.out.println("Localizando o produto pelo nome Açúcar (pela chave, usando o filter)...");
        Produto produtoFind = produtos.stream().filter(p -> p.getNome() .equals("Açúcar")).findAny().orElse(null);
        System.out.println(produtoFind);
    }

}


