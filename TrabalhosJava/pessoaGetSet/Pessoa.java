package pessoaGetSet;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    // CPF

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Nome

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Idade

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    String imprimirDadosDaPessoa() {
       return "O nome da pessoa é " + nome + " e a sua idade é: " + idade + " e o seu documento é: " + cpf;
    }
}