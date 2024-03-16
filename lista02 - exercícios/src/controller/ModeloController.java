package controller;

import java.util.*;

import model.Modelo;

public class ModeloController {
    public static void main(String[] args) {
        //1c-i
        //constrói duas instâncias da classe utilizando o construtor padrão
        Modelo modelo1 = new Modelo(); //utilizando o construtor padrão
        Modelo modelo2 = new Modelo();

        //1c-ii
        //constrói duas instâncias da classe utilizando o construtor parametrizado que contém todos os atributos como parâmetro
        Modelo modelo3 = new Modelo(3, "Uno branco 4p"); //utilizando o construtor parametrizado
        Modelo modelo4 = new Modelo(4, "Uno azul 4p"); //utilizando o construtor parametrizado

        //1c-iii
        //constrói duas instâncias da classe utilizando o construtor parametrizado que contém três parâmetros, uma variação dos construtores acima
        Modelo modelo5 = new Modelo("Ka preto 4p");
        Modelo modelo6 = new Modelo("Ka branco 4p");

        //1c-iv
        //imprime todas instâncias (todos os objetos)
        System.out.println(modelo1);
        System.out.println(modelo2);
        System.out.println(modelo3);
        System.out.println(modelo4);
        System.out.println(modelo5);
        System.out.println(modelo6);

        //1c-v
        //alterando o estado dos objetos na memória RAM utilizando setters
        modelo1.setId(1);
        modelo1.setDescricao("Fox preto 4p");
        modelo2.setId(2);
        modelo2.setDescricao("Fox branco 4p");

        modelo3.setId(3);
        modelo3.setDescricao("C3 preto 4p");
        modelo4.setId(4);
        modelo4.setDescricao("C3 branco 4p");

        modelo5.setId(5);
        modelo5.setDescricao("208 preto 4p");
        modelo5.setId(6);
        modelo5.setDescricao("208 branco 4p");

        //1c-vi
        System.out.println(modelo3.getId());
        System.out.println(modelo3.getDescricao());

        System.out.println(modelo4.getId());
        System.out.println(modelo4.getDescricao());

        System.out.println(modelo5.getId());
        System.out.println(modelo5.getDescricao());

        System.out.println(modelo6.getId());
        System.out.println(modelo6.getDescricao());

    }

}