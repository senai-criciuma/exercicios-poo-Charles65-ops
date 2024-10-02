package IdadePessoa;

public class IdadePessoa {

    private int idade;
    private String nome;
    private int verificarIdade;


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setVerificarIdade(int verificarIdade) {
        if(idade >= 18){
            System.out.println("Maior de idade:");
        }else{
            System.out.println("Menor de idad:");
        }
    }
}
