package org.example.Factory;

import org.example.Producto.*;

public class FabricaToyotaConcreta extends FabricaAbstracta{
    @Override
    public Sedan construirSedan() {
        return new Corrolla();
    }

    @Override
    public PickUp construirPickup() {
        return new Hilux();
    }
}
