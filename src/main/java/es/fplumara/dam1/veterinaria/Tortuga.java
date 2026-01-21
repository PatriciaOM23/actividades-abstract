package es.fplumara.dam1.veterinaria;

import java.util.ArrayList;
import java.util.List;

public class Tortuga extends Animal implements  Domesticable{

    private List<String> historial = new ArrayList<>();

    public Tortuga() {
    }

    @Override
    public String sonido() {
        return "aaaaj";
    }

    @Override
    public String ficha() {
        return "Tortuga:\n" +
                "- 4 patas, 1 caparazón ";
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

