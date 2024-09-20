package Exer04;

import java.util.Scanner;

public class Carro {

    String modelo;
    int anoFabricacao;
    String cor;
    int anoAtual;
    int resultado;

    public void exibirFichaTecnica(){

        System.out.println("Modelo:" + modelo);
        System.out.println("Ano:" + anoFabricacao);
        System.out.println("Cor:" + cor);
    }
    public void calcularIdadeDoCarro(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o ano atual:");
        anoAtual = ler.nextInt();
        resultado = anoAtual - anoFabricacao;
        System.out.println("Resultado:" + resultado);
    }

}
