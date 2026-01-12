package es.fplumara.dam1.restaurante;

public abstract class ProductoMenu {
    protected String id;
    protected String nombre;
    protected double precioBase;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    protected ProductoMenu(String id, String nombre, double precioBase) {
        if (id == null || id.isBlank() ) {
            throw new IllegalArgumentException("ID no válido");
        }
        if(nombre == null || nombre.isBlank()){
            throw new IllegalArgumentException("Nombre no válido");
        }
        if (precioBase < 0){
            throw new IllegalArgumentException("Precio no válido");
        }
        this.id = id;
        this.nombre = nombre;
        this.precioBase = precioBase;

    }
    // Le obligamos a implementar a los hijos estos métodos (cada uno a su manera)
    abstract double precioFinal();
    abstract String ticketLine();

}
