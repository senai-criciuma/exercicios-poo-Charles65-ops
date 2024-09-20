package Exer06;

    public class Cachorro {

        private String raca;
        private String nome;
        private int idade;

        public Cachorro(String raca, String nome, int idade) {
            this.raca = raca;
            this.nome = nome;
            this.idade = idade;
        }

        public void latir() {
            System.out.println("Au au!");
        }

        public void mostrarInformacoes() {
            System.out.println("Raça: " + raca);
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade + " anos");
        }

        public String getRaca() {
            return raca;
        }

        public void setRaca(String raca) {
            this.raca = raca;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public int getIdade() {
            return idade;
        }

        public void setIdade(int idade) {
            this.idade = idade;
        }
    }