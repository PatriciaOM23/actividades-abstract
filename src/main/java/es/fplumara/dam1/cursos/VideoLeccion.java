package es.fplumara.dam1.cursos;

public class VideoLeccion extends ContenidoCurso {
    private String calidad;
    private double tamanoMB;

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


}
