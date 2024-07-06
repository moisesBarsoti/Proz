package pessoaGetSet;

public class testeDePessoa {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.setNome("Moisés");
        professor.setIdade(18);
        professor.setCpf("55233399900");
        professor.setSalario(3423);

        System.out.println(professor.imprimirDadosDaPessoa());

        Aluno aluno = new Aluno(); 
        aluno.setNome("ABc");
        aluno.setIdade(10);
        aluno.setCpf("55233399900");

        System.out.println(aluno.imprimirDadosDaPessoa());
    }
}