package es.fplumara.dam1.cursos;

public class Articulo extends ContenidoCurso{
    private int numPaginas;

    public Articulo(String id, String titulo, String autor, int duracionMinutos, int numPaginas) {
        super(id, titulo, autor, duracionMinutos);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
}
