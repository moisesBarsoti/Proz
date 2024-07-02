package proz.construtoras;

public class Livro {
    String titulo;
    String autor;
    String genero;
    int paginas;
    String capa;
    int anoPublicado;
    String idioma;
    String editora;
    String isbn;
    float preco;

    Livro(
    // Parametros 
    String tituloP,
    String autorP,
    String generoP, 
    int paginasP,
    String capaP,     
    int anoPublicadoP,
    String idiomaP,
    String editoraP,
    String isbnP,
    float precoP
    ) {
    // Valores que serão atribuidos ao objeto através dos parametros
        titulo = tituloP;
        autor = autorP;
        genero = generoP;
        paginas = paginasP;
        capa = capaP;
        anoPublicado = anoPublicadoP;
        idioma = idiomaP;
        editora = editoraP;
        isbn = isbnP;
        preco = precoP;
    }
}