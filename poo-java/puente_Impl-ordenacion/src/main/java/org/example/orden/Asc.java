package org.example.orden;

public class Asc implements Orden {
    @Override
    public boolean comparar(Integer a, Integer b) {
        return a > b;
    }
}
