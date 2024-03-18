package model;

public abstract class Conta {
    private double saldo;
    public double getSaldo(){ //get devolve o saldo
        return saldo; //devolvendo saldo
    }
    public void deposita(double valor){
        this.saldo += valor;//this para especificar o "protected double", para não haver conflito de nomes.
        //this não é essencial, funciona igual. usar THIS é um bom hábito para não haver conflito de nomes.
    }
    public void saca(double valor){
        double saldoAtual = this.saldo - valor;
        if(saldoAtual > 0 ){
        this.saldo -= valor;
        }
        else{
            System.out.println("Não foi possível realiar o saque.");
        }
    }
    public void atualiza(double taxa){ //taxa ficcional, pois não foi informada no diagrama.
        if(taxa > 0 ){
        this.saldo += this.saldo * (taxa/100); // taxa de 10%
        }
        else{
            System.out.println("A taxa deve ser maior que ZERO.");
        }
    }

}
