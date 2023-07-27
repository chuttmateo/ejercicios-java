package org.example;

import org.example.Factory.FabricaAbstracta;
import org.example.Factory.FabricaFordConcreta;
import org.example.Factory.FabricaToyotaConcreta;
import org.example.enums.TipoFabrica;

public class Main {
    public static void main(String[] args) {
        FabricaAbstracta fabrica = null;

        TipoFabrica tipoFabrica = TipoFabrica.FORD;

        switch (tipoFabrica) {
            case TOYOTA -> fabrica = new FabricaToyotaConcreta();
            case FORD -> fabrica = new FabricaFordConcreta();
            default -> {
                System.out.println("Imposible Crear esa fábrica");
            }
        }
        fabrica.construirPickup().conducirPickup();
        fabrica.construirSedan().conducir();
    }
}