//referência: https://youtu.be/tGK7RDBSyAs?list=PLfDIQS3HDSglAa4I5Rab5GZVM5zJkuVBL
package model;

public class ContaPoupanca extends Conta{
    @Override
    public String toString() {
        return "ContaPoupanca{" +
                "saldo=" + getSaldo() +
                '}';
    }
}
