package proz.POO;

public class UsarLivro {
    public static void main(String[] args) {
        Livro l;
        l = new Livro();

        l.titulo = "Assim falou Zaratustra";
        l.autor = "Friedrich Wilhelm Nietzsche";
        l.genero = "Filosofia";
        l.paginas = 208;
        l.capa = "Comum";
        l.anoPublicado = 2023;
        l.idioma = "Português";
        l.editora = "Camelot";
        l.isbn = "978-6587817699";
        l.preco = 29.90F;

        System.out.println("  ");
        System.out.println("Livro 1 ");
        System.out.println("  ");

        System.out.println("Nome do livro é: " + l.titulo);
        System.out.println("Nome do autor é: " + l.autor);
        System.out.println("O gênero do livro é: " + l.genero);
        System.out.println("Quantidade de páginas: " + l.paginas);
        System.out.println("O tipo de capa: " + l.capa);
        System.out.println("Foi lançado no ano: " + l.anoPublicado);
        System.out.println("O idioma do livro é em: " + l.idioma);
        System.out.println("A editora do livro é: " + l.editora);
        System.out.println("O ISBN do livro é: " + l.isbn);
        System.out.println("O preço do livro é: " + l.preco);

        System.out.println("  ");
        System.out.println("Livro 2 ");
        System.out.println("  ");

        Livro l2;
        l2 = new Livro();

        l2.titulo = "A Arte da Guerra";
        l2.autor = "Sun Tzu";
        l2.genero = "Filosofia Militar";
        l2.paginas = 157;
        l2.capa = "Dura";
        l2.anoPublicado = 500;
        l2.idioma = "Português";
        l2.editora = "Edipro";
        l2.isbn = "978-6556600499";
        l2.preco = 43.42F;

        System.out.println("Nome do livro é: " + l2.titulo);
        System.out.println("Nome do autor é: " + l2.autor);
        System.out.println("O gênero do livro é: " + l2.genero);
        System.out.println("Quantidade de páginas: " + l2.paginas);
        System.out.println("O tipo de capa: " + l2.capa);
        System.out.println("Foi lançado no ano: " + l2.anoPublicado + " a.C.");
        System.out.println("O idioma do livro é em: " + l2.idioma);
        System.out.println("A editora do livro é: " + l2.editora);
        System.out.println("O ISBN do livro é: " + l2.isbn);
        System.out.println("O preço do livro é: " + l2.preco);

        Livro l3;
        l3 = new Livro();

        l3.titulo = "Filho do Fogo";
        l3.autor = "Eduardo Daniel Mastral";
        l3.genero = "Religião";
        l3.paginas = 319;
        l3.capa = "Comum";
        l3.anoPublicado = 2014;
        l3.idioma = "Português";
        l3.editora = "Naos";
        l3.isbn = "85-88606011";
        l3.preco = 40.90F;

        System.out.println("  ");
        System.out.println("Livro 3 ");
        System.out.println("  ");

        System.out.println("Nome do livro é: " + l3.titulo);
        System.out.println("Nome do autor é: " + l3.autor);
        System.out.println("O gênero do livro é: " + l3.genero);
        System.out.println("Quantidade de páginas: " + l3.paginas);
        System.out.println("O tipo de capa: " + l3.capa);
        System.out.println("Foi lançado no ano: " + l3.anoPublicado);
        System.out.println("O idioma do livro é em: " + l3.idioma);
        System.out.println("A editora do livro é: " + l3.editora);
        System.out.println("O ISBN do livro é: " + l3.isbn);
        System.out.println("O preço do livro é: " + l3.preco);
    }
}
