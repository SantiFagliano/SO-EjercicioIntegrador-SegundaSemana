package PracticaSegundaSemana;

import java.util.ArrayList;
import java.util.List;

public class Variante {
    private Integer precioBasico;
    private String descripcion;
    private List<Opcional> opcionales;

    public Variante(Integer precioBasico, String descripcion) {
        this.precioBasico = precioBasico;
        this.descripcion = descripcion;
        this.opcionales = new ArrayList<>();
    }

    public void agregarOpcional(Opcional opcional) {
        if (opcional != null) {
            if (!opcionales.contains(opcional)) {
                opcionales.add(opcional);
            }
        }
    }

    public Integer getPrecioBasico() {
        return precioBasico;
    }

    public void setPrecioBasico(Integer precioBasico) {
        this.precioBasico = precioBasico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Opcional> getOpcionales() {
        return opcionales;
    }

    public void setOpcionales(List<Opcional> opcionales) {
        this.opcionales = opcionales;
    }
}
