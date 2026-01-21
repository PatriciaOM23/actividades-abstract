package es.fplumara.dam1.cursos;

public abstract class ContenidoCurso {
    private String id;
    private String titulo;
    private String autor;
    private int duracionMinutos;

    protected ContenidoCurso(String id, String titulo, String autor, int duracionMinutos) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.duracionMinutos = duracionMinutos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }
}
