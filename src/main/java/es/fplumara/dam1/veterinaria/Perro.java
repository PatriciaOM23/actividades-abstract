package es.fplumara.dam1.veterinaria;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Perro extends Animal implements  ConHistorialClinico, Domesticable{

    private List<String> historial = new ArrayList<>();
    @Override
    public String sonido() {
        return "guau";
    }

    public Perro() {
    }

    @Override
    public String ficha() {
        return "Perros:\n" +
                "- 4 patas, 2 orejas ";
    }

    @Override
    public void anotarRevision(LocalDate fecha, String descripcion) {
        historial.add(fecha + " - " + descripcion);

    }
    @Override
    public int numeroRevisiones() {
        return historial.size();
    }

    @Override
    public boolean responderOrden(String orden) {
        return false;
    }

    @Override
    public int nivelDomesticacion() {
        return 0;
    }
}
