package Livro;

public class Livro {
    private String titulo;
    private String autor;
    private String exibirDetalhes;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void ExibirDetalhes() {
        System.out.println("-- Detalhes do Livro--");
        System.out.println("Titulo:"+titulo);
        System.out.println("Autor:"+autor);
    }
}
