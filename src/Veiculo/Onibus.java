package Veiculo;

public class Onibus extends Veiculo{

    @Override
    public void ligar(){
        System.out.println("Ligando o busao.");
    }

    @Override
    public void desligar(){
        System.out.println("Desligando o busao.");
    }
}
