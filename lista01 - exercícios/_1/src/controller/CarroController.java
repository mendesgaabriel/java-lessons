package controller;

import model.Carro;

public class CarroController {
    public static void main(String[] args) {

        //construindo duas instâncias da classe utilizando o construtor padrão
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        //construindo duas instâncias da classe utilizando o construtor parametrizado que contém todos os atributos como parâmetro
        Carro carro3 = new Carro("Chevrolet", "Cruze", 2012);
        Carro carro4 = new Carro("Chevrolet", "Montana", 2010);

        //construindo duas instâncias da classe utilizando o construtor parametrizado que contém dois parãmetros
        Carro carro5 = new Carro("Fiat", "Uno");
        Carro carro6 = new Carro("Honda", "Civi SI");

        //imprime todas instâncias (todos objetos)
        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);
        System.out.println(carro4);
        System.out.println(carro5);
        System.out.println(carro6);

        //alterando o estado dos objetos na memória RAM utilizando setters
        carro1.setMarca("Volkswagen");
        carro1.setModelo("Gol");
        carro1.setAnoFabricacao(2000);

        carro2.setMarca("Chevrolet");
        carro2.setModelo("Vectra");
        carro2.setAnoFabricacao(2009);

        carro3.setMarca("Renault");
        carro3.setModelo("Kwid");
        carro3.setAnoFabricacao(2000);

        carro4.setMarca("Chevrolet");
        carro4.setModelo("Cruze");
        carro4.setAnoFabricacao(2012);

        carro5.setMarca("Honda");
        carro5.setModelo("Civic SI");
        carro5.setAnoFabricacao(2008);

        carro6.setMarca("Fiat");
        carro6.setModelo("Uno");
        carro6.setAnoFabricacao(2004);

        //imprimindo todos os objetos novamente, porém com o método getters
        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAnoFabricacao());

        System.out.println(carro2.getMarca());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getAnoFabricacao());

        System.out.println(carro3.getMarca());
        System.out.println(carro3.getModelo());
        System.out.println(carro3.getAnoFabricacao());

        System.out.println(carro4.getMarca());
        System.out.println(carro4.getModelo());
        System.out.println(carro4.getAnoFabricacao());

        System.out.println(carro5.getMarca());
        System.out.println(carro5.getModelo());
        System.out.println(carro5.getAnoFabricacao());

        System.out.println(carro6.getMarca());
        System.out.println(carro6.getModelo());
        System.out.println(carro6.getAnoFabricacao());
    }
}
