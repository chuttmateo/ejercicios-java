package org.example.Factory;

import org.example.Producto.PickUp;
import org.example.Producto.Sedan;

public abstract class FabricaAbstracta {
     public abstract Sedan construirSedan();
     public abstract PickUp construirPickup();

}
