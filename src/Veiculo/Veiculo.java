package Veiculo;

public abstract class Veiculo {
    public abstract void ligar();
    public abstract void desligar();
    public void mover(){
        System.out.println("O veiculo está se movendo.");
    }

}
