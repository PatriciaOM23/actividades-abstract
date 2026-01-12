package es.fplumara.dam1.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Ensalada extends ProductoMenu implements Personalizable, AptoPara {
    private List<Extra> extras = new ArrayList<Extra>();
    private String tamano;

    public Ensalada(String id, String nombre, double precioBase, List<Extra> extras, String tamano) {
        super(id, nombre, precioBase);
        this.extras = extras;
        this.tamano = tamano;
    }

    @Override
    double precioFinal() {
        int incrementoTamano;
        if (tamano.equalsIgnoreCase("grande"){
            incrementoTamano = 2;
        }else{
            incrementoTamano = 0;
        }
        double precioFinal = getPrecioBase() + incrementoTamano; // +costesExtras; QUEDA CALCULAR COSTESEXTRAS
        return precioFinal;

    }

    @Override
    String ticketLine() {
        return "";
    }

    @Override
    public boolean esApto(String restricciones) {
        boolean apto = restricciones.equalsIgnoreCase("vegetariano") || restricciones.equalsIgnoreCase("vegano");
        if(!apto){
            throw new IllegalArgumentException("No es apto.");
        }

        return restricciones.equalsIgnoreCase("vegetariano") || (restricciones.equalsIgnoreCase("vegano") && !extras.isEmpty());

    }

    @Override
    public void anadirExtra(String nombreExtra, int coste) {
        Personalizable.super.anadirExtra(nombreExtra, coste);
    }
}
