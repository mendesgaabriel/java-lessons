//referência: https://youtu.be/wODi42qBniw?list=PLfDIQS3HDSglAa4I5Rab5GZVM5zJkuVBL
package model;

public class ContaCorrente extends Conta {
    @Override
    public String toString() {
        return "ContaCorrente{" +
                "saldo=" + getSaldo() +
                '}';
    }
}
