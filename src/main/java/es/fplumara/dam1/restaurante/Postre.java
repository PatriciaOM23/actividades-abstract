package es.fplumara.dam1.restaurante;

public class Postre extends ProductoMenu{
    private boolean esCasero;

    public boolean isEsCasero() {
        return esCasero;
    }

    public void setEsCasero(boolean esCasero) {
        this.esCasero = esCasero;
    }

    public Postre(String id, String nombre, double precioBase, boolean esCasero) {
        super(id, nombre, precioBase);
        this.esCasero = esCasero;
    }

    @Override
    double precioFinal() {
        double precioCasero;
        if(esCasero) {
            precioCasero = 1.5;
        } else {
            precioCasero = 0.0;
        }
        return getPrecioBase() + precioCasero;
    }

    @Override
    String ticketLine() {
        return String.format("[POSTRE] <%s> (casero: <%b>) | base: <%.2f>€ | total: <%.2f>€\n",
                getNombre(),
                this.esCasero,
                getPrecioBase(),
                precioFinal()
        );
    }
    }

