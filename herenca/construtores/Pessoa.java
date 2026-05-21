public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(){
        System.out.printf("Construindo uma pessoa");
        this.nome = nome;
        this.idade = idade;
    }

    public String toString(){
        return String.format("nome: %s, idade: %d", nome, idade);
    }
}
