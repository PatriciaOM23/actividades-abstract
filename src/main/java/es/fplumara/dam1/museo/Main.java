package es.fplumara.dam1.museo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static double recaudacionTotal(List<Entrada> entradas) {
        return entradas.stream()
                .mapToDouble(Entrada::getPrecioBase)
                .sum();
    }

    public static double recaudacionConDescuento(List<Entrada> entradas) {
        // AHORA CALCULAMOS EN BASE A PRECIO FINAL
        return entradas.stream()
                .mapToDouble(Entrada::precioFinal)
                .sum();
    }

    public static long contadorAccesoRapido (List <Entrada> entradas){
        return entradas.stream()
                .filter(entrada -> entrada instanceof ConAccesoRapido)
                .count();
    }

    public static void soloDescontables(List <Entrada> entradas) {

        List<Entrada> entradasDescontables = entradas.stream()
                .filter(entradaDescontable -> entradaDescontable instanceof Descontable)
                .toList();

    }

    public static double entradaMasCara(List <Entrada> entradas){
        return entradas.stream()
                .mapToDouble(Entrada::precioFinal)
                .max()
                .orElse(0);
    }

    public static void main(String[] args) {
        List<Entrada> entradas = new ArrayList<>();

        entradas.add(new EntradaGeneral("E-001", 12.0, LocalDate.of(2026, 1, 10)));
        entradas.add(new EntradaGeneral("E-002", 12.0, LocalDate.of(2026, 1, 10)));

        entradas.add(new EntradaEstudiante("E-010", 10.0, LocalDate.of(2026, 1, 11), "IES Laguna"));
        entradas.add(new EntradaEstudiante("E-011", 10.0, LocalDate.of(2026, 1, 11), "IES Lagomar"));

        entradas.add(new EntradaVIP("E-100", 20.0, LocalDate.of(2026, 1, 12), "Sala Impresionistas", 3));
        entradas.add(new EntradaVIP("E-101", 25.0, LocalDate.of(2026, 1, 12), "Backstage exposición", 5));
        double recaudacionTotal = recaudacionTotal(entradas);
        double recaudacionConDescuento = recaudacionConDescuento(entradas);
        long contadorAccesoRapido = contadorAccesoRapido(entradas);
        double entradaMasCara = entradaMasCara(entradas);
        System.out.println("Recaudación total: " + recaudacionTotal);
        System.out.println("Recaudación con descuento: " +recaudacionConDescuento);
        System.out.println("Cuantos hay con acceso rápido: " + contadorAccesoRapido);
        System.out.println("Entrada más cara: " + entradaMasCara);
        entradas.removeIf(e -> e instanceof EntradaGeneral );
        System.out.println("-----------------\n LISTA FINAL\n-----------------");
        entradas.forEach(System.out::println);

        }
}
