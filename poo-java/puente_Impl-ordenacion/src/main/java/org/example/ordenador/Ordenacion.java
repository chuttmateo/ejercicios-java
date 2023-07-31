package org.example.ordenador;


import org.example.orden.Orden;

public abstract class Ordenacion<T> {
    protected Orden orden;

    public Ordenacion(Orden orden) {
        this.orden = orden;
    }
    public abstract T ordenar(T lista);
}
