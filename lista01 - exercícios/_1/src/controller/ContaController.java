package controller;

import java.util.*;

import model.Conta;

public class ContaController {

    public static void main(String[] args) {
        //constrói duas instâncias da classe utilizando o construtor padrão
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();


        Conta conta3 = new Conta(3, 3000.00);
        Conta conta4 = new Conta(4, 4000.00);

        //constrói duas instâncias da classe utilizando o construtor parametrizado que contém três parâmetros, uma variação dos construtores acima
        Conta conta5 = new Conta(5000.00);
        Conta conta6 = new Conta(6000.00);

        //imprime todas instâncias (todos os objetos)
        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);
        System.out.println(conta4);
        System.out.println(conta5);
        System.out.println(conta6);


        //alterando o estado dos objetos na memória RAM utilizando setters
        conta1.setId(1);
        conta1.deposita(2000.00);
        conta2.setId(2);
        conta2.deposita(4000.00);

        conta3.setId(3);
        conta3.deposita(5000.00);
        conta4.setId(4);
        conta4.deposita(8000.00);

        conta5.setId(6);
        conta5.deposita(10000.00);
        conta6.setId(6);
        conta6.deposita(12000.00);

        System.out.println(conta1.getId());
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getId());
        System.out.println(conta2.getSaldo());

        System.out.println(conta3.getId());
        System.out.println(conta3.getSaldo());
        System.out.println(conta4.getId());
        System.out.println(conta4.getSaldo());

        System.out.println(conta5.getId());
        System.out.println(conta5.getSaldo());
        System.out.println(conta6.getId());
        System.out.println(conta6.getSaldo());

    }

}