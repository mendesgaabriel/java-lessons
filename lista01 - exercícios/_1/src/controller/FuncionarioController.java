package controller;

import model.Funcionario;

public class FuncionarioController {
    public static void main(String[] args) {

        //construindo duas instâncias da classe utilizando construtor padrão
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario();

        //construindo duas instâncias da classe utilizando construtor parametrizado, que contém TODOS atributos como parâmetro
        Funcionario f3 = new Funcionario("Gabriel", 700);
        Funcionario f4 = new Funcionario("Vinicius", 1500);

        //constrói duas instâncias da classe utilizando o construtor parametrizado, que contém UM atributo como parâmetro
        Funcionario f5 = new Funcionario("Lucas");
        Funcionario f6 = new Funcionario("Paulo");

        //imprimindo todas as instâncias (todos objetos)
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
        System.out.println(f5);
        System.out.println(f6);

        //alterando o estado dos objetos na classe, utilizando os SETTERS
        f1.setNome("Ricardo");
        f1.setSalario(2000);

        f2.setNome("Luis");
        f2.setSalario(2000);

        f3.setNome("Nicole");
        f3.setSalario(3000);

        f4.setNome("Gabriel");
        f4.setSalario(10000);

        f5.setNome("Martina");
        f5.setSalario(5000);

        f6.setNome("Wellington");
        f6.setSalario(2000);

        //imprimindo todos os objetos, dessa vez com o método get (getters)
        System.out.println(f1.getNome());
        System.out.println(f1.getSalario());

        System.out.println(f2.getNome());
        System.out.println(f2.getSalario());

        System.out.println(f3.getNome());
        System.out.println(f3.getSalario());

        System.out.println(f4.getNome());
        System.out.println(f4.getSalario());

        System.out.println(f5.getNome());
        System.out.println(f5.getSalario());

        System.out.println(f6.getNome());
        System.out.println(f6.getSalario());


    }
}
