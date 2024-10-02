package Produto;

public class Produto {

    private String nome;
    private double preco;
    private double aplicarDesconto;
    private double percentual;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setAplicarDesconto(double percentual) {
        preco = preco - percentual/100 * preco;
    }
}
