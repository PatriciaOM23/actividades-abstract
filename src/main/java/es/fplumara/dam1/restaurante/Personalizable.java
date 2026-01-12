package es.fplumara.dam1.restaurante;

import java.util.ArrayList;
import java.util.List;

public interface Personalizable {
    protected List<Extra> extras = new ArrayList<Extra>();

    default void anadirExtra(String nombreExtra, int coste){
        if ( nombreExtra == null || nombreExtra.isBlank()){
            throw new IllegalArgumentException("Nombre no válido");
        }
        if(coste < 0) {
            throw new IllegalArgumentException("Precio no válido");
        }
    }

}
