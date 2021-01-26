package PracticaSegundaSemana;

public class Auto {
    public Variante variante;

    public Auto(Variante variante) {
        this.variante = variante;
    }

    public Integer calcularCostoFinal() {
        Integer costoFinal = 0;
        if (this.variante.getOpcionales() != null) {
            if (this.variante.getOpcionales().size() >= 1) {
                for (Opcional opcional : this.variante.getOpcionales()) {
                    costoFinal += opcional.getPrecio();
                }
            }
        }
        costoFinal += this.variante.getPrecioBasico();
        return costoFinal;
    }

    public Variante getVariante() {
        return variante;
    }

    public void setVariante(Variante variante) {
        this.variante = variante;
    }


}
