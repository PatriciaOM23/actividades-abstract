package es.fplumara.dam1.cursos;

public class Quiz extends ContenidoCurso implements Evaluable {

    private int numeroPreguntas;
    private int puntuacionMaxima;

    public Quiz(String id, String titulo, String autor, int duracionMinutos, int numeroPreguntas, int puntuacionMaxima) {
        super(id, titulo, autor, duracionMinutos);
        this.numeroPreguntas = numeroPreguntas;
        this.puntuacionMaxima = puntuacionMaxima;

    }

    public int getNumeroPreguntas() {
        return numeroPreguntas;
    }

    public void setNumeroPreguntas(int numeroPreguntas) {
        this.numeroPreguntas = numeroPreguntas;
    }

    public int getPuntuacionMaxima() {
        return puntuacionMaxima;
    }

    public void setPuntuacionMaxima(int puntuacionMaxima) {
        this.puntuacionMaxima = puntuacionMaxima;
    }


    @Override
    public int corregir(int aciertos) {
        return (aciertos * puntuacionMaxima) / numeroPreguntas;
    }

}
