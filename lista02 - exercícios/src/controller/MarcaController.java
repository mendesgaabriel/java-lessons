package controller;

import java.util.*;

import model.Marca;

public class MarcaController {
    public static void main(String[] args) {
        //1c-i
        //constrói duas instâncias da classe utilizando o construtor padrão
        Marca marca1 = new Marca(); //utilizando o construtor padrão
        Marca marca2 = new Marca();

        //1c-ii
        //constrói duas instâncias da classe utilizando o construtor parametrizado que contém todos os atributos como parâmetro
        Marca marca3 = new Marca(3, "Fiat branco 4p");
        Marca marca4 = new Marca(4, "Fiat azul 4p");

        //1c-iii
        //constrói duas instâncias da classe utilizando o construtor parametrizado que contém três parâmetros, uma variação dos construtores acima
        Marca marca5 = new Marca("Ford preto 4p");
        Marca marca6 = new Marca("Ford branco 4p");

        //1c-iv
        //imprime todas instâncias (todos os objetos)
        System.out.println(marca1);
        System.out.println(marca2);
        System.out.println(marca3);
        System.out.println(marca4);
        System.out.println(marca5);
        System.out.println(marca6);

        //1c-v
        //alterando o estado dos objetos na memória RAM utilizando setters
        marca1.setId(1);
        marca1.setDescricao("Volksvagen preto 4p");
        marca2.setId(2);
        marca2.setDescricao("Volksvagen branco 4p");

        marca3.setId(3);
        marca3.setDescricao("Citroen preto 4p");
        marca4.setId(4);
        marca4.setDescricao("Citroen branco 4p");

        marca5.setId(5);
        marca5.setDescricao("Peugeot preto 4p");
        marca5.setId(6);
        marca5.setDescricao("Peugeot branco 4p");

        //1c-vi
        System.out.println(marca3.getId());
        System.out.println(marca3.getDescricao());

        System.out.println(marca4.getId());
        System.out.println(marca4.getDescricao());

        System.out.println(marca5.getId());
        System.out.println(marca5.getDescricao());

        System.out.println(marca6.getId());
        System.out.println(marca6.getDescricao());


    }

}