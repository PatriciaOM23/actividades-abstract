package es.fplumara.dam1.cursos;

public class VideoLeccion extends ContenidoCurso implements Descargable {
    private String calidad;
    private double tamanoMB;

    public VideoLeccion(String id, String titulo, String autor, int duracionMinutos, String calidad, double tamanoMB) {
        super(id, titulo, autor, duracionMinutos);
        this.calidad = calidad;
        this.tamanoMB = tamanoMB;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    public double getTamanoMB() {
        return tamanoMB;
    }

    public void setTamanoMB(double tamanoMB) {
        this.tamanoMB = tamanoMB;
    }


    @Override
    public String generarEnlaceDescarga() {
        return "";
    }
}
