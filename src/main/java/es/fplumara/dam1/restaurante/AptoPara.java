package es.fplumara.dam1.restaurante;

public interface AptoPara {

    // REVISAMOS SI UN PRODUCTO ES APTO O NO
    default boolean esApto(String restricciones){

        if(restricciones.equalsIgnoreCase("vegetariano") || restricciones.equalsIgnoreCase("vegano")) {
                return true;
        }
        throw new IllegalArgumentException("No es apto");
    }
}
