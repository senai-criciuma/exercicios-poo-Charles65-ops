import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int nemuro = 10;
        Filme meuFilme = new Filme();
        meuFilme.lerDados();
        meuFilme.imprimirDados();
    }
}