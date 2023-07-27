package org.example.Factory;

import org.example.Producto.Focus;
import org.example.Producto.PickUp;
import org.example.Producto.Ranger;
import org.example.Producto.Sedan;

public class FabricaFordConcreta extends FabricaAbstracta{

    @Override
    public Sedan construirSedan() {
        return new Focus();
    }

    @Override
    public PickUp construirPickup() {
        return new Ranger();
    }

}
