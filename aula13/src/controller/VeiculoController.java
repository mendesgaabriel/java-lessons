//referência: https://youtu.be/zco5HYeXKkk?list=PLfDIQS3HDSglAa4I5Rab5GZVM5zJkuVBL
package controller;

import model.Veiculo;

import java.util.*;

public class VeiculoController {
    public static void main(String[] args) {
        /*cada veiculo simula um registro em uma tabela de um
        banco de dados relaciona */

        Veiculo veiculo1 = new Veiculo("12345", "III1234", "Branco", 4, "gasolina/alcool", 10000, "ABC12345", 110.00);
        Veiculo veiculo2 = new Veiculo("53132", "IIT5432", "Branco", 4, "gasolina/alcool", 10000, "ABC15325", 90.00);
        Veiculo veiculo3 = new Veiculo("18845", "IJL1234", "Branco", 4, "gasolina/alcool", 10000, "ABC54321", 65.00);
        Veiculo veiculo4 = new Veiculo("12045", "IOP1234", "Branco", 4, "gasolina/alcool", 10000, "ABC12348", 70.00);
        Veiculo veiculo5 = new Veiculo("12322", "ITF1234", "Branco", 4, "gasolina/alcool", 10000, "ABC88888", 98.00);

        //cria coleção do tipo list e add objetos nela
        List<Veiculo> veiculos = new ArrayList<>();
        veiculos.add(veiculo1);
        veiculos.add(veiculo2);
        veiculos.add(veiculo3);
        veiculos.add(veiculo4);
        veiculos.add(veiculo5);
        System.out.println("Coleção do tipo List original\n");
        System.out.println(veiculos);

        //ordenação da coleção do tipo List
        veiculos.sort(Comparator.comparing(Veiculo::getPlaca));
        System.out.println("\n\nColeção do tipo List ordenada");
        System.out.println(veiculos);

        //pesquisa na coleção do tipo List //retornando objeto específico "IIT5432"
        //v recebe placa
        Veiculo veiculoFind = veiculos.stream().filter(v -> v.getPlaca().equals("IIT5432")).findAny().orElse(null);
        System.out.println("\n\nLocalizando veículo na coleção do tipo List");
        System.out.println(veiculoFind);

        //cria a coleção do tipo Map e add objetos nela
        Map<String, Veiculo> veiculosMap = new HashMap<>();
        veiculosMap.put(veiculo1.getRenavan(), veiculo1);
        veiculosMap.put(veiculo2.getRenavan(), veiculo2);
        veiculosMap.put(veiculo3.getRenavan(), veiculo3);
        veiculosMap.put(veiculo4.getRenavan(), veiculo4);
        veiculosMap.put(veiculo5.getRenavan(), veiculo5);
        System.out.println("\n\nColeção do tipo Map\n");
        System.out.println(veiculosMap);

        //ordenação da coleção do tipo Map (***É PROÍBIDA***)

        //pesquisa na coleção do tipo Map
        System.out.print("\n\nLocalizando veículo na coleção do tipo Map");
        System.out.println(veiculosMap.get(veiculo3.getRenavan()));

    }
}
