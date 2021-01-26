package PracticaSegundaSemana;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Opcional TC = new Opcional(12000, "Techo Corredizo");
        Opcional AA = new Opcional(20000, "Aire Acondicionado");
        Opcional ABS = new Opcional(14000, "Sistema de frenos ABS");
        Opcional AB = new Opcional(7000, "Airbag");
        Opcional LL = new Opcional(12000, "Llantas de aleacion");

        Variante sedan = new Variante(230000, "SEDAN");
        Variante familiar = new Variante(245000, "FAMILIAR");
        Variante coupe = new Variante(270000, "COUPE");

        familiar.agregarOpcional(TC);
        familiar.agregarOpcional(AA);
        familiar.agregarOpcional(LL);

        sedan.agregarOpcional(ABS);
        sedan.agregarOpcional(AA);
        sedan.agregarOpcional(AB);

        /*
        coupe.agregarOpcional(TC);
        coupe.agregarOpcional(AB);
        coupe.agregarOpcional(LL);
        */
        Auto a1 = new Auto(sedan);
        Auto a2 = new Auto(familiar);
        Auto a3 = new Auto(coupe);

        List<Auto> listaAutos = new ArrayList<>();
        listaAutos.add(a1);
        listaAutos.add(a2);
        listaAutos.add(a3);

        System.out.println("*** Bienvenido a la consesionaria de autos ***");
        System.out.println("------------------------------------");
        for (Auto auto : listaAutos) {
            System.out.println("-El precio final de " + auto.getVariante().getDescripcion() + " es de " + auto.calcularCostoFinal()+".");
            if (auto.getVariante().getOpcionales() != null &&
                    auto.getVariante().getOpcionales().size() >= 1) {
                System.out.println("\nEste auto posee los siguientes opcionales: ");
                for (Opcional opcional : auto.getVariante().getOpcionales()) {
                    System.out.println("Tipo: " + opcional.getDescripcion() + ". Precio agregado: " + opcional.getPrecio()+".");
                }
            }else{
                System.out.println("*Este auto no posee ningun opcional.*");
            }
            System.out.println("------------------------------------");
        }
    }
}
