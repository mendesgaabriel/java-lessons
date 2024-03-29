package controller;

import java.time.LocalDateTime;
import java.util.*;

import model.Locacao;

public class LocacaoController {
    public static void main(String[] args) {
        //1c-i
        //constrói duas instâncias da classe utilizando o construtor padrão
        Locacao locacao1 = new Locacao(); //utilizando o construtor padrão
        Locacao locacao2 = new Locacao();

        //1c-ii
        //constrói duas instâncias da classe utilizando o construtor parametrizado que contém todos os atributos como parâmetro
        Locacao locacao3 = new Locacao(3, LocalDateTime.of(2021, 2, 10, 10, 0), LocalDateTime.of(2021, 2, 15, 10, 0), 200, 30.00, 30.00, false); //utilizando o construtor parametrizado
        Locacao locacao4 = new Locacao(4, LocalDateTime.of(2023, 2, 10, 10, 0), LocalDateTime.of(2023, 2, 15, 10, 0), 200, 40.00, 40.00, false); //utilizando o construtor parametrizado

        //1c-iii
        //constrói duas instâncias da classe utilizando o construtor parametrizado que contém três parâmetros, uma variação dos construtores acima
        Locacao locacao5 = new Locacao(5, false);
        Locacao locacao6 = new Locacao(6, false);

        //1c-iv
        //imprime todas instâncias (todos os objetos)
        System.out.println(locacao1);
        System.out.println(locacao2);
        System.out.println(locacao3);
        System.out.println(locacao4);
        System.out.println(locacao5);
        System.out.println(locacao6);

        //1c-v
        //alterando o estado dos objetos na memória RAM utilizando setters
        locacao1.setId(1);
        locacao1.setDataLocacao(LocalDateTime.of(2021, 1, 10, 10, 0));
        locacao1.setDataDevolucao(LocalDateTime.of(2021, 1, 11, 11, 0));
        locacao1.setQuilometragem(100);
        locacao1.setValorCalcao(100);
        locacao1.setValorLocacao(100);
        locacao1.setDevolvido(true);

        locacao2.setId(1);
        locacao2.setDataLocacao(LocalDateTime.of(2022, 2, 12, 10, 0));
        locacao2.setDataDevolucao(LocalDateTime.of(2022, 1, 13, 11, 0));
        locacao2.setQuilometragem(200);
        locacao2.setValorCalcao(200);
        locacao2.setValorLocacao(200);
        locacao2.setDevolvido(true);

        locacao3.setId(3);
        locacao3.setDataLocacao(LocalDateTime.of(2023, 3, 13, 10, 0));
        locacao3.setDataDevolucao(LocalDateTime.of(2021, 3, 14, 11, 0));
        locacao3.setQuilometragem(300);
        locacao3.setValorCalcao(300);
        locacao3.setValorLocacao(300);
        locacao3.setDevolvido(true);

        locacao4.setId(4);
        locacao4.setDataLocacao(LocalDateTime.of(2024, 4, 14, 10, 0));
        locacao4.setDataDevolucao(LocalDateTime.of(2024, 4, 15, 11, 0));
        locacao4.setQuilometragem(400);
        locacao4.setValorCalcao(400);
        locacao4.setValorLocacao(400);
        locacao4.setDevolvido(true);

        /* Note que, mesmo tendo construído com apenas três argumento estes objetos, é possível usar o setter para alterar todos os atributos dos objetos. */
        locacao5.setId(1);
        locacao5.setDataLocacao(LocalDateTime.of(2015, 5, 15, 10, 0));
        locacao5.setDataDevolucao(LocalDateTime.of(2015, 5, 16, 11, 0));
        locacao5.setQuilometragem(500);
        locacao5.setValorCalcao(500);
        locacao5.setValorLocacao(500);
        locacao5.setDevolvido(true);

        locacao6.setId(6);
        locacao6.setDataLocacao(LocalDateTime.of(2016, 6, 16, 10, 0));
        locacao6.setDataDevolucao(LocalDateTime.of(2016, 6, 17, 11, 0));
        locacao6.setQuilometragem(600);
        locacao6.setValorCalcao(600);
        locacao6.setValorLocacao(600);
        locacao6.setDevolvido(true);

        //1c-vi
        System.out.println(locacao1.getId());
        System.out.println(locacao1.getDataLocacao());
        System.out.println(locacao1.getDataDevolucao());
        System.out.println(locacao1.getQuilometragem());
        System.out.println(locacao1.getValorCalcao());
        System.out.println(locacao1.getValorLocacao());
        System.out.println(locacao1.isDevolvido());

        System.out.println(locacao2.getId());
        System.out.println(locacao2.getDataLocacao());
        System.out.println(locacao2.getDataDevolucao());
        System.out.println(locacao2.getQuilometragem());
        System.out.println(locacao2.getValorCalcao());
        System.out.println(locacao2.getValorLocacao());
        System.out.println(locacao2.isDevolvido());

        System.out.println(locacao3.getId());
        System.out.println(locacao3.getDataLocacao());
        System.out.println(locacao3.getDataDevolucao());
        System.out.println(locacao3.getQuilometragem());
        System.out.println(locacao3.getValorCalcao());
        System.out.println(locacao3.getValorLocacao());
        System.out.println(locacao3.isDevolvido());

        System.out.println(locacao4.getId());
        System.out.println(locacao4.getDataLocacao());
        System.out.println(locacao4.getDataDevolucao());
        System.out.println(locacao4.getQuilometragem());
        System.out.println(locacao4.getValorCalcao());
        System.out.println(locacao4.getValorLocacao());
        System.out.println(locacao4.isDevolvido());

        System.out.println(locacao5.getId());
        System.out.println(locacao5.getDataLocacao());
        System.out.println(locacao5.getDataDevolucao());
        System.out.println(locacao5.getQuilometragem());
        System.out.println(locacao5.getValorCalcao());
        System.out.println(locacao5.getValorLocacao());
        System.out.println(locacao5.isDevolvido());

        System.out.println(locacao6.getId());
        System.out.println(locacao6.getDataLocacao());
        System.out.println(locacao6.getDataDevolucao());
        System.out.println(locacao6.getQuilometragem());
        System.out.println(locacao6.getValorCalcao());
        System.out.println(locacao6.getValorLocacao());
        System.out.println(locacao6.isDevolvido());

    }

}