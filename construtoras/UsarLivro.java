package proz.construtoras;

public class UsarLivro {
    public static void main(String[] args) {
        Livro livro1;
        livro1 = new Livro(
            "Assim falou Zaratustra", 
            "Friedrich Wilhelm Nietzsche", 
            "Filosofia", 
            208, 
            "Comum", 
            2023, 
            "Português", 
            "Camelot", 
            "978-6587817699", 
            29.90F);

            System.out.println("Nome do livro é: " + livro1.titulo);
            System.out.println("Nome do autor é: " + livro1.autor);
            System.out.println("O gênero do livro é: " + livro1.genero);
            System.out.println("Quantidade de páginas: " + livro1.paginas);
            System.out.println("O tipo de capa: " + livro1.capa);
            System.out.println("Foi lançado no ano: " + livro1.anoPublicado);
            System.out.println("O idioma do livro é em: " + livro1.idioma);
            System.out.println("A editora do livro é: " + livro1.editora);
            System.out.println("O ISBN do livro é: " + livro1.isbn);
            System.out.println("O preço do livro é: " + livro1.preco);
    }
}