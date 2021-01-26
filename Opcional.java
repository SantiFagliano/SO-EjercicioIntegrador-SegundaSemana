package PracticaSegundaSemana;

public class Opcional {
    private Integer precio;
    private String descripcion;

    public Opcional(Integer precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
