package Conta;

public class Conta {

    private double saldo;

    public void sacar (double valor){

        if(saldo >= valor){
            this.saldo = this.saldo - valor;
        }else{
            System.out.println("Saldo insuficiente.");
        }


    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
