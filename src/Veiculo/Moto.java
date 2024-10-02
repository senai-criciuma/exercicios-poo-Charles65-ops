package Veiculo;

import javax.sound.midi.Soundbank;

public class Moto extends Veiculo{
    @Override
    public void ligar(){
        System.out.println("Ligando Moto.");
    }

    @Override
    public void desligar(){
        System.out.println("Desligando Moto.");
    }
}