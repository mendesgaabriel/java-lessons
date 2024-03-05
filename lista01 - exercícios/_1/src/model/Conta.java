package model;

public class Conta {
    //Atributos
    private int id;
    private double saldo;

    //métodos construtores
    public Conta() {
        super();
    }

    public Conta(int id, double saldo) {
        super();
        this.id = id;
        this.saldo = saldo;
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    //métodos acessores
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposita(double saldo) {
        this.saldo = saldo;
    }

    public void saca(double valor) {
        double valorTemp = this.saldo - valor;
        if(valorTemp < 0) {
            System.out.println("Saldo insuficiente." + this.saldo);
            return;
        }
        this.saldo -= valor;
        System.out.println("\nSaque efetuado com êxito." + this.saldo);
    }

    public void atualiza(double taxa) {
        this.saldo += this.saldo * (taxa/100);
//		this.saldo = this.saldo + this.saldo * (taxa/100);
        System.out.println("Saldo atualizado." + this.saldo);
    }

    //convertendo objeto em String
    @Override
    public String toString() {
        return "\nConta [id=" + id + ", saldo=" + saldo + "]";
    }

}