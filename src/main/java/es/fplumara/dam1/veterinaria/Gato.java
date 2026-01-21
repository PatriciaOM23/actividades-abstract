package es.fplumara.dam1.veterinaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Gato extends Animal implements ConHistorialClinico{

    private List<String> historial = new ArrayList<>();

    public Gato() {
    }

    @Override
    public String sonido() {
        return "miau";
    }

    @Override
    public String ficha() {
        return "Gatos:\n" +
                "- 4 patas, 2 orejas, tienen mondongo";
    }

    @Override
    public void anotarRevision(LocalDate fecha, String descripcion) {
        historial.add(fecha + " - " + descripcion);

    }
    @Override
    public int numeroRevisiones() {
        return historial.size();
    }
}
