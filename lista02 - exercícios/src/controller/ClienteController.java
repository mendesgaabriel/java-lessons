package controller;

import java.util.*;

import model.Cliente;

public class ClienteController {

    public static void main(String[] args) {
        //1c-i
        //constrói duas instâncias da classe utilizando o construtor padrão
        Cliente cliente1 = new Cliente(); //utilizando o construtor padrão
        Cliente cliente2 = new Cliente();

        //1c-ii
        //constrói duas instâncias da classe utilizando o construtor parametrizado que contém todos os atributos como parâmetro
        Cliente cliente3 = new Cliente(3, "123.445.667-21","Ana", "Silva", "Rua das Flores, 10", "96000-000", "5355551234", "email@mail.com"); //utilizando o construtor parametrizado
        Cliente cliente4 = new Cliente(4, "432.765.321-89","Rafael", "Torres", "Rua das Estrelas, 43", "96000-222", "5355559876", "email@mail.com"); //utilizando o construtor parametrizado

        //1c-iii
        //constrói duas instâncias da classe utilizando o construtor parametrizado que contém três parâmetros, uma variação dos construtores acima
        Cliente cliente5 = new Cliente("734.754.123-56", "Maria", "Santos");
        Cliente cliente6 = new Cliente("321.567.333-55", "João", "Ferreira");

        //1c-iv
        //imprime todas instâncias (todos os objetos)
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(cliente5);
        System.out.println(cliente6);

        //1c-v
        //alterando o estado dos objetos na memória RAM utilizando setters
        cliente1.setId(1);
        cliente1.setCpf("111.111.111-11");
        cliente1.setNome("Anita");
        cliente1.setSobrenome("da Silva");
        cliente1.setEndereco("Rua das Flores, 110");
        cliente1.setCep("96000-000");
        cliente1.setTelefone("5355558888");
        cliente1.setEmail("email@dominio.com");

        cliente2.setId(2);
        cliente2.setCpf("111.111.111-11");
        cliente2.setNome("Anita");
        cliente2.setSobrenome("da Silva");
        cliente2.setEndereco("Rua das Flores, 110");
        cliente2.setCep("96000-000");
        cliente2.setTelefone("5355558888");
        cliente2.setEmail("email@dominio.com");

        cliente3.setId(3);
        cliente3.setCpf("111.111.111-11");
        cliente3.setNome("Anita");
        cliente3.setSobrenome("da Silva");
        cliente3.setEndereco("Rua das Flores, 110");
        cliente3.setCep("96000-000");
        cliente3.setTelefone("5355558888");
        cliente3.setEmail("email@dominio.com");

        cliente4.setId(4);
        cliente4.setCpf("111.111.111-11");
        cliente4.setNome("Anita");
        cliente4.setSobrenome("da Silva");
        cliente4.setEndereco("Rua das Flores, 110");
        cliente4.setCep("96000-000");
        cliente4.setTelefone("5355558888");
        cliente4.setEmail("email@dominio.com");

        cliente5.setId(5);
        cliente5.setCpf("111.111.111-11");
        cliente5.setNome("Mariazinha");
        cliente5.setSobrenome("dos Santos");
        cliente5.setEndereco("Rua das Estrelas, 110");
        cliente5.setCep("96000-000");
        cliente5.setTelefone("5355558888");
        cliente5.setEmail("email@dominio.com");

        cliente6.setId(6);
        cliente6.setCpf("111.111.111-11");
        cliente6.setNome("Mariazinha");
        cliente6.setSobrenome("dos Santos");
        cliente6.setEndereco("Rua das Estrelas, 110");
        cliente6.setCep("96000-000");
        cliente6.setTelefone("5355558888");
        cliente6.setEmail("email@dominio.com");

        //1c-vi
        System.out.println(cliente1.getId());
        System.out.println(cliente1.getCpf());
        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getSobrenome());
        System.out.println(cliente1.getEndereco());
        System.out.println(cliente1.getCep());
        System.out.println(cliente1.getEmail());
        System.out.println(cliente1.getTelefone());

        System.out.println(cliente2.getId());
        System.out.println(cliente2.getCpf());
        System.out.println(cliente2.getNome());
        System.out.println(cliente2.getSobrenome());
        System.out.println(cliente2.getEndereco());
        System.out.println(cliente2.getCep());
        System.out.println(cliente2.getEmail());
        System.out.println(cliente2.getTelefone());


        System.out.println(cliente3.getId());
        System.out.println(cliente3.getCpf());
        System.out.println(cliente3.getNome());
        System.out.println(cliente3.getSobrenome());
        System.out.println(cliente3.getEndereco());
        System.out.println(cliente3.getCep());
        System.out.println(cliente3.getEmail());
        System.out.println(cliente3.getTelefone());

        System.out.println(cliente4.getId());
        System.out.println(cliente4.getCpf());
        System.out.println(cliente4.getNome());
        System.out.println(cliente4.getSobrenome());
        System.out.println(cliente4.getEndereco());
        System.out.println(cliente4.getCep());
        System.out.println(cliente4.getEmail());
        System.out.println(cliente4.getTelefone());

        System.out.println(cliente5.getId());
        System.out.println(cliente5.getCpf());
        System.out.println(cliente5.getNome());
        System.out.println(cliente5.getSobrenome());
        System.out.println(cliente5.getEndereco());
        System.out.println(cliente5.getCep());
        System.out.println(cliente5.getEmail());
        System.out.println(cliente5.getTelefone());

        System.out.println(cliente6.getId());
        System.out.println(cliente6.getCpf());
        System.out.println(cliente6.getNome());
        System.out.println(cliente6.getSobrenome());
        System.out.println(cliente6.getEndereco());
        System.out.println(cliente6.getCep());
        System.out.println(cliente6.getEmail());
        System.out.println(cliente6.getTelefone());

    }

}