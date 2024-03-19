//referência: https://youtu.be/e9cGm9MstfA?list=PLfDIQS3HDSglAa4I5Rab5GZVM5zJkuVBL
package model;

public class ContaCorrente extends Conta {
    public void saca(double valor){
        double saldoAtual = saldo - valor; //usando get para acessar saldo que é private
        if(saldoAtual >= -200){
            saldo -= valor;
        }
        else{
            System.out.println("Não foi possível realizar o saque");
        }
    }




    @Override
    public String toString() {
        return "ContaCorrente{" +
                "saldo=" + getSaldo() +
                '}';

    }
}
