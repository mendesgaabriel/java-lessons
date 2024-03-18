package controller;

import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;


public class ContaController {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente();
        ContaPoupanca cp1 = new ContaPoupanca();

        cc1.deposita(1000);
        System.out.println("\nSaldo em Conta Corrente =" + cc1.getSaldo());
        System.out.println(cc1.toString());

        cp1.deposita(2000);
        System.out.println("\nSaldo em Conta Poupança =" + cp1.getSaldo());
        System.out.println(cp1.toString());

    }
}
