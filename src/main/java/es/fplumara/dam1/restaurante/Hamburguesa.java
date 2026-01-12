package es.fplumara.dam1.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Hamburguesa extends ProductoMenu implements Personalizable{
    private String tipoCarne;
    private Extras extras = new Extras();


    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public Hamburguesa(String id, String nombre, double precioBase, String tipoCarne) {
        super(id, nombre, precioBase);
        if (tipoCarne == null || tipoCarne.isBlank()){
            throw new IllegalArgumentException();
        }
        this.tipoCarne = tipoCarne;
    }



    @Override
    double precioFinal() {
        return getPrecioBase() + extras.calcularPrecioExtras();
        }

    @Override
    String ticketLine() {
        return String.format(
                "[HAMBURGUESA] %s (carne: <%s>) | base: <%.2f>€ | extras: <%s> | total: <%.2f>€\n",
                getNombre(),
                this.tipoCarne,
                getPrecioBase(),
                extras.extrasMostrar(),
                precioFinal()
        );
    }

    @Override
    public void anadirExtra(String nombreExtra, int coste) {
        this.extras.anadirExtra(nombreExtra, coste);
    }

}
