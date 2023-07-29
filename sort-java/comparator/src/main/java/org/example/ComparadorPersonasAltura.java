package org.example;

import org.example.models.Persona;

import java.util.Comparator;

public class ComparadorPersonasAltura implements Comparator<Persona> {
    private final int multiplicador;
    public ComparadorPersonasAltura(boolean ascendente) {
        if (ascendente) {
            multiplicador = 1;
        }else {
            multiplicador = -1;
        }
    }

    @Override
    public int compare(Persona persona1, Persona persona2) {
        return multiplicador * (Double
                .compare(persona1.getEstaturaEnM(), persona2.getEstaturaEnM()));
    }
}
