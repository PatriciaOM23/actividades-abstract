package es.fplumara.dam1.restaurante;


import java.util.ArrayList;
import java.util.List;
public class Extras extends ArrayList<Extra> implements  List<Extra> {
    // TOTAL EXTRAS
    public double calcularPrecioExtras(){
        return this.stream().mapToDouble(Extra::precio).sum();
    }

    // PARA EL TICKET
    public String extrasMostrar (){
        StringBuilder sb = new StringBuilder();
        for(Extra extra : this){
            sb.append(extra.nombre());

        }
        return sb.toString();
    }
    // - aplicar validaciones de Personalizable
    //- guardar el extra en las listas internas
    // - No lo hacemos desde hamburguesa o ensalada
    public void anadirExtra(String nombre, double coste){
        if ( nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("Nombre no válido");
        }
        if(coste < 0) {
            throw new IllegalArgumentException("Precio no válido");
        }
        this.add(new Extra(nombre,coste));

    }
}
