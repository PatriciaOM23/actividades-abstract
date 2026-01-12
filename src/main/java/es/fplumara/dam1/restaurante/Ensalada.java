package es.fplumara.dam1.restaurante;

import java.util.ArrayList;

public class Ensalada extends ProductoMenu implements Personalizable, AptoPara {
    private Extras extras = new Extras();
    private String tamano;

    public Ensalada(String id, String nombre, double precioBase, String tamano) {
        super(id, nombre, precioBase);
        this.tamano = tamano;
    }

    @Override
    double precioFinal() {
        int incrementoTamano;
        if (tamano.equalsIgnoreCase("grande")){
            incrementoTamano = 2;
        } else{
            incrementoTamano = 0;
        }

        double precioFinal = getPrecioBase() + incrementoTamano + extras.calcularPrecioExtras();
        return precioFinal;

    }

    @Override
    String ticketLine() {
        int incrementoTamano;
        if (tamano.equalsIgnoreCase("grande")){
            incrementoTamano = 2;
        } else{
            incrementoTamano = 0;
        }
        return String.format("[ENSALADA] <%s> (tamano: <%s>) | base: <%.2f>€ | incTam: <%d>€ | extras: <%s> | total: <%.2f>€\n",
                getNombre(),
                this.tamano,
                getPrecioBase(),
                incrementoTamano,
                extras.extrasMostrar(),
                precioFinal()

        );
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
        this.extras.anadirExtra(nombreExtra,coste);
    }
}
