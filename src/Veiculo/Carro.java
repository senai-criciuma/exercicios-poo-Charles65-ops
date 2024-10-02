package Veiculo;

public class Carro extends Veiculo{
    @Override
    public void ligar(){
        System.out.println("Ligando carro.");

    }

    @Override
    public void desligar(){
        System.out.println("Carro Desligando.");
    }
}
