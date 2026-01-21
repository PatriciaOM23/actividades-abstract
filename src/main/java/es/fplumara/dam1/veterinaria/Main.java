package es.fplumara.dam1.veterinaria;

import es.fplumara.dam1.cursos.Evaluable;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args){
        Perro perro = new Perro();
        Gato gato = new Gato();
        Tortuga tortuga = new Tortuga();
        Leon leon = new Leon();

        List<Animal> animales = new ArrayList<>();
        animales.add(perro);
        animales.add(gato);
        animales.add(tortuga);
        animales.add(leon);

        animales.stream()
                .forEach(a -> {
                    System.out.println(a.ficha());
                    System.out.println(a.sonido());
                });

        animales.stream()
                .filter(a -> a instanceof ConHistorialClinico conHC){
                conHC.
        }


    }
}
