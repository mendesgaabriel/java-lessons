//referência: https://youtu.be/e9cGm9MstfA?list=PLfDIQS3HDSglAa4I5Rab5GZVM5zJkuVBL
package controller;

import model.*;


public class ContaController {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente();
        ContaPoupanca cp1 = new ContaPoupanca();
        ContaConjunta cj1 = new ContaConjunta();
        ContaPoupancaSalario cps1 = new ContaPoupancaSalario();

        cc1.deposita(1000);
        //System.out.println("\nSaldo em Conta Corrente =" + cc1.getSaldo());
        System.out.println(cc1);

        cc1.saca(1100.00);
        System.out.println(cc1);

        //cc1.atualiza(10);
        //System.out.println(cc1);

        cp1.deposita(2000);
        System.out.println("\n" + cp1);
        cp1.saca(500.00);
        //System.out.println("\nSaldo em Conta Poupança =" + cp1.getSaldo());
        System.out.println(cp1);

        cj1.deposita(5000);
        System.out.println("\nSaldo em Conta Conjunta =" + cj1.getSaldo());
        System.out.println(cj1);

        cps1.deposita(7000);
        System.out.println("\nSaldo em Conta Poupança Salário=" + cps1.getSaldo());
        System.out.println(cps1);

    }
}
