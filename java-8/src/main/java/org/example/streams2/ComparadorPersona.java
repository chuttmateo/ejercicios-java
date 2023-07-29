package org.example.streams2;

import org.example.streams2.utils.Persona;

import java.util.Comparator;

public class ComparadorPersona implements Comparator<Persona> {
    @Override
    public int compare(Persona persona1, Persona persona2) {
        int retorno = persona1.getEdad() - persona2.getEdad();
        if (retorno == 0){
            retorno = persona1.getNombre().compareTo(persona2.getNombre());
        }
        return retorno;
    }
}
