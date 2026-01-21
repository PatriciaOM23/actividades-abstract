package es.fplumara.dam1.cursos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main (String [] args ){
    List<ContenidoCurso> contenidos = new ArrayList<>();

contenidos.add(new VideoLeccion("CU-001", "POO en Java", "Iván", 45, "1080p", 350.5));
contenidos.add(new VideoLeccion("CU-002", "Interfaces y Polimorfismo", "Iván", 30, "720p", 220.0));

contenidos.add(new Articulo("CU-010", "Resumen de UML", "Ana", 15, 6));
contenidos.add(new Articulo("CU-011", "Buenas prácticas", "Luis", 10, 4));

contenidos.add(new Quiz("CU-100", "Quiz POO básico", "Iván", 12, 10, 100));
contenidos.add(new Quiz("CU-101", "Quiz Interfaces", "Iván", 10, 8, 80));

    int minutosTotales = contenidos.stream()
            .mapToInt(ContenidoCurso :: getDuracionMinutos )
            .sum();
        long contadorDescargables = contenidos.stream()
                .filter(e -> e instanceof Descargable)
                .count();

        int puntuacionTotalSimulada = contenidos.stream()
                .filter(e -> e instanceof Evaluable)
                .map(e -> (Evaluable) e)
                .mapToInt(ev -> ev.corregir(4))
                .sum();

    List soloEvaluables = contenidos.stream()
            .filter(e -> e instanceof Evaluable)
            .toList();

    for (Object ev : soloEvaluables){
        System.out.println(ev);
    }

        List<ContenidoCurso> ordenados = contenidos.stream()
                .sorted(Comparator.comparingInt(ContenidoCurso::getDuracionMinutos))
                .toList();

        ordenados.forEach(System.out::println);

        ordenados.removeIf(e -> e instanceof Articulo );

    }


}