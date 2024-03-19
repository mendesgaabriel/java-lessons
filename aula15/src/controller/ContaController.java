//referência: https://youtu.be/uGg-OU-ZsVo?list=PLfDIQS3HDSglAa4I5Rab5GZVM5zJkuVBL
package controller;

import model.Conta;
import model.ContaConjunta;
import model.ContaCorrente;
import model.ContaPoupanca;


public class ContaController {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente();
        ContaPoupanca cp1 = new ContaPoupanca();
        ContaConjunta cj1 = new ContaConjunta();

        cc1.deposita(1000);
        System.out.println("\nSaldo em Conta Corrente =" + cc1.getSaldo());
        System.out.println(cc1);

        cp1.deposita(2000);
        System.out.println("\nSaldo em Conta Poupança =" + cp1.getSaldo());
        System.out.println(cp1);

        cj1.deposita(5000);
        System.out.println("\nSaldo em Conta Conjunta =" + cj1.getSaldo());
        System.out.println(cj1);

    }
}
