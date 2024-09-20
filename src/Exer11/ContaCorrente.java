package Exer11;

public class ContaCorrente {

    private double saldo;
    private String titular;
    private double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }

    public boolean sacar(double valor) {
        if (valor <= saldo && valor <= limite) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}