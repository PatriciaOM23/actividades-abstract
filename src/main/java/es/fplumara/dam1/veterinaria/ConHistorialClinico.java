package es.fplumara.dam1.veterinaria;

import java.time.LocalDate;


public interface ConHistorialClinico {
    public void anotarRevision(LocalDate fecha, String descripcion);
    public int numeroRevisiones();
}
