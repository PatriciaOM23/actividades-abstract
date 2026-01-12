package es.fplumara.dam1.restaurante;

import java.util.ArrayList;
import java.util.List;

public class Hamburguesa extends ProductoMenu implements Personalizable{
    private String tipoCarne;
    private List<Extra> extras = new ArrayList<Extra>();


    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    public Hamburguesa(String id, String nombre, double precioBase, String tipoCarne) {
        super(id, nombre, precioBase);
        this.tipoCarne = tipoCarne;
    }

    public Hamburguesa(String id, String nombre, double precioBase, String tipoCarne, List<Extra> extras) {
        super(id, nombre, precioBase);
        if (tipoCarne == null || tipoCarne.isBlank()){
            throw new IllegalArgumentException();
        }
        this.tipoCarne = tipoCarne;
        this.extras = extras;
    }

    @Override
    double precioFinal() {
        double precioFinal = getPrecioBase();
        return precioFinal;
        }

    @Override
    String ticketLine() {
        //CREAR STREAM PARA QUE extras SE VEA
      //  String extrasFormateado = extras.stream();

        return String.format("```\n" +
                "[HAMBURGUESA] %s (carne: <%s>) | base: <%.2f>€ | extras: <%s> | total: <%d>€\n" +
                "```",
                nombre,
                tipoCarne,
                getPrecioBase(),
                //extrasFormateado,
                precioFinal()
        );
    }

    @Override
    public void anadirExtra(String nombreExtra, int coste) {
        Personalizable.super.anadirExtra(nombreExtra, coste);
    }

}
