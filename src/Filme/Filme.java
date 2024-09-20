package Filme;

import java.util.Scanner;

public class Filme {
    //Atributos da classe
    String nome;
    String classificacao;
    String genero;
    boolean incluidoNoPlano;
    int duracaoEmMinutos;

    //Métodos imprimir dados do filme sem retorno void
    public void imprimirDados(){
        System.out.println("Filme.Filme:"+nome);
        System.out.println("Duração do filme:"+duracaoEmMinutos);
        System.out.println("Gênero do filme:"+genero);
        System.out.println("Classificação do filme:"+classificacao);
        System.out.println("Incluso no Plano."+incluidoNoPlano);
    }
    public void lerDados(){
        Scanner ler = new Scanner(System.in);
        System.out.println("---------------------\n");
        System.out.println("Digite o nome do filme:");
        nome = ler.nextLine();
        System.out.println("Digite a duração:");
        duracaoEmMinutos = ler.nextInt();
        System.out.println("Digite a classificação do filme:");
        classificacao = ler.next();
        System.out.println("Digite o gênero do filme:");
        genero = ler.next();
        System.out.println("Filme.Filme incluido no Plano?");
        incluidoNoPlano = ler.nextBoolean();
    }

}