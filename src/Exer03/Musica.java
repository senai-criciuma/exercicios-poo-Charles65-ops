package Exer03;

import java.util.Scanner;

public class Musica {

     String titulo;
     String artista;
     int anoLancamento;
     double avaliacao;
     int numAvaliacoes;
     double somatorioAvalicoes;
     double mediaAvaliacoes;

    public void exibirFichaTecnica() {
        System.out.println("Titulo:" + titulo);
        System.out.println("Artista:" + artista);
        System.out.println("Ano de Lançamento:" + anoLancamento);
        System.out.println("Avaliacao:" + avaliacao);
        System.out.println("Número Avaliacoes:" + numAvaliacoes);
    }
    public void lerDadosDaMusica(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o Titulo:" + titulo);
        titulo = ler.nextLine();
        System.out.println("Informe o Artista:" + artista);
        artista = ler.nextLine();
        System.out.println("Informe o ano de Lançamento:" + anoLancamento);
        anoLancamento = ler.nextInt();
        System.out.println("Avaliacao:" + avaliacao);
        avaliacao = ler.nextDouble();

        atualizaMedia(avaliacao);
    }
    public void atualizaMedia(double avaliacao){
        numAvaliacoes++;
        somatorioAvalicoes = somatorioAvalicoes + avaliacao;
        mediaAvaliacoes = somatorioAvalicoes / numAvaliacoes
        ;


    }

}
