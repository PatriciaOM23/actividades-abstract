package es.fplumara.dam1.restaurante;

public interface AptoPara {

    default boolean esApto(String restricciones){

        if(restricciones.equalsIgnoreCase("vegetariano") || restricciones.equalsIgnoreCase("vegano")) {
                return true;
        }
        throw new IllegalArgumentException("No es apto");
    }
}
