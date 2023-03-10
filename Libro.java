package ico.fes;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    int pagSig;
    int leyendo;
    int pagAnt;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

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

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                '}';
    }
    public void leer(){
        System.out.println("Continuar leyendo.."+titulo+ autor);
    }
    public void porleer(){
        int leyendo = pagSig - 1;
        int pagSig = pagAnt+ 1;
        System.out.println("pagina anterior " + pagAnt+" <= pagina actual " + leyendo + " => pagina siguiente " + pagSig);
    }
}
