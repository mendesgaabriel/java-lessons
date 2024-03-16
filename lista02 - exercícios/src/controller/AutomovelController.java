package controller;

import model.Automovel;

public class AutomovelController {
    public static void main(String[] args) {

        //ic-i
        //construindo duas instâncias da classe utilizando o construtor padrão
        Automovel automovel1 = new Automovel();
        Automovel automovel2 = new Automovel();

        //ic-ii
        /* construindo duas instâncias da classe utilizando construtor parametrizado que contém
        todos os atributos como parâmetro. */
        Automovel automovel3 = new Automovel("3", "ITF-8888", "branco", 4, "flex", 3000, "chassi-abc333", 30.00);
        Automovel automovel4 = new Automovel("4", "ILV-4444", "vermelho", 4, "flex", 4000, "chassi-abc2333", 40.00);

        //ic-iii
        /*construindo duas instâncias da classe utilizando construtor parametrizado que contém três parâmetros
        variação dos construtores acima. */
        Automovel automovel5 = new Automovel("MAX-9999", "branco");
        Automovel automovel6 = new Automovel("IOP-9832", "preto");

        //ic-iv
        //imprimindo todas instâncias (todos os objetos)
        System.out.println(automovel1);
        System.out.println(automovel2);
        System.out.println(automovel3);
        System.out.println(automovel4);
        System.out.println(automovel5);
        System.out.println(automovel6);

        //ic-v
        //alterando o estado dos objetos na memória RAM utilizando setters
        automovel1.setRenavan("1");
        automovel1.setPlaca("IMG-9231");
        automovel1.setCor("Azul");
        automovel1.setNum_rodas(4);
        automovel1.setCombustivel("flex");
        automovel1.setQuilometragem(92300);
        automovel1.setChassi("chassi-abc2311");
        automovel1.setValor_locacao(10.00);

        automovel2.setRenavan("2");
        automovel2.setPlaca("IMG-9191");
        automovel2.setCor("Azul");
        automovel2.setNum_rodas(4);
        automovel2.setCombustivel("flex");
        automovel2.setQuilometragem(92000);
        automovel2.setChassi("chassi-abc2322");
        automovel2.setValor_locacao(10.00);

        automovel3.setRenavan("3");
        automovel3.setPlaca("ITF-8888");
        automovel3.setCor("branco");
        automovel3.setNum_rodas(4);
        automovel3.setCombustivel("flex");
        automovel3.setQuilometragem(3000);
        automovel3.setChassi("chassi-abc333");
        automovel3.setValor_locacao(30.00);

        automovel4.setRenavan("4");
        automovel4.setPlaca("ILV-4444");
        automovel4.setCor("vermelho");
        automovel4.setNum_rodas(4);
        automovel4.setCombustivel("flex");
        automovel4.setQuilometragem(4000);
        automovel4.setChassi("chassi-abc2333");
        automovel4.setValor_locacao(40.00);

        automovel5.setRenavan("5");
        automovel5.setPlaca("MAX-9999");
        automovel5.setCor("branco");
        automovel5.setNum_rodas(4);
        automovel5.setCombustivel("flex");
        automovel5.setQuilometragem(5000);
        automovel5.setChassi("chassi-abc1333");
        automovel5.setValor_locacao(40.00);

        automovel6.setRenavan("6");
        automovel6.setPlaca("MAX-8888");
        automovel6.setCor("branco");
        automovel6.setNum_rodas(4);
        automovel6.setCombustivel("flex");
        automovel6.setQuilometragem(9000);
        automovel6.setChassi("chassi-abc1933");
        automovel6.setValor_locacao(40.00);

        //ic-iv
        //imprimindo todos os objetos com construtores utilizando método toString
        System.out.println(automovel1.getRenavan());
        System.out.println(automovel1.getPlaca());
        System.out.println(automovel1.getCor());
        System.out.println(automovel1.getNum_rodas());
        System.out.println(automovel1.getCombustivel());
        System.out.println(automovel1.getQuilometragem());
        System.out.println(automovel1.getChassi());

        System.out.println(automovel2.getValor_locacao());
        System.out.println(automovel2.getRenavan());
        System.out.println(automovel2.getPlaca());
        System.out.println(automovel2.getCor());
        System.out.println(automovel2.getNum_rodas());
        System.out.println(automovel2.getCombustivel());
        System.out.println(automovel2.getQuilometragem());
        System.out.println(automovel2.getChassi());
        System.out.println(automovel2.getValor_locacao());



        System.out.println(automovel3.getRenavan());
        System.out.println(automovel3.getPlaca());
        System.out.println(automovel3.getCor());
        System.out.println(automovel3.getNum_rodas());
        System.out.println(automovel3.getCombustivel());
        System.out.println(automovel3.getQuilometragem());
        System.out.println(automovel3.getChassi());
        System.out.println(automovel3.getValor_locacao());

        System.out.println(automovel4.getRenavan());
        System.out.println(automovel4.getPlaca());
        System.out.println(automovel4.getCor());
        System.out.println(automovel4.getNum_rodas());
        System.out.println(automovel4.getCombustivel());
        System.out.println(automovel4.getQuilometragem());
        System.out.println(automovel4.getChassi());
        System.out.println(automovel4.getValor_locacao());

        System.out.println(automovel5.getRenavan());
        System.out.println(automovel5.getPlaca());
        System.out.println(automovel5.getCor());
        System.out.println(automovel5.getNum_rodas());
        System.out.println(automovel5.getCombustivel());
        System.out.println(automovel5.getQuilometragem());
        System.out.println(automovel5.getChassi());
        System.out.println(automovel5.getValor_locacao());

        System.out.println(automovel6.getRenavan());
        System.out.println(automovel6.getPlaca());
        System.out.println(automovel6.getCor());
        System.out.println(automovel6.getNum_rodas());
        System.out.println(automovel6.getCombustivel());
        System.out.println(automovel6.getQuilometragem());
        System.out.println(automovel6.getChassi());
        System.out.println(automovel6.getValor_locacao());




    }
}
