//referência: https://youtu.be/uGg-OU-ZsVo?list=PLfDIQS3HDSglAa4I5Rab5GZVM5zJkuVBL
package model;

public class ContaConjunta extends Conta{
    @Override
    public String toString() {
        return "ContaConjunta{" +
                "saldo=" + getSaldo() +
                '}';
    }
}
