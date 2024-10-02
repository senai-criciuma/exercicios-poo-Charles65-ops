package ContaBancaria;

public class ContaCorrente extends ContaBancaria{

    @Override
    public void consultarSaldo(){

    }
    public void cobrarTarifaMensal(){
        saldo = saldo - (10/100);

    }

    @Override
    public void depositar() {

    }

    @Override
    public void sacar() {

    }
}
