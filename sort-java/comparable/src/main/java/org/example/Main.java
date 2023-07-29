package org.example;

import org.example.enums.EstadoCivil;
import org.example.models.Persona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(9999, "Mateo", "Chutt", 1.75, EstadoCivil.SOLTERO));
        personas.add(new Persona(1111, "Bautista", "Audisio", 1.85, EstadoCivil.VIUDO));
        personas.add(new Persona(2222, "Alejandro", "Main", 1.65, EstadoCivil.DIVORCIADO));
        personas.add(new Persona(5555, "Carlos", "Rodiguez", 1.95, EstadoCivil.CASADO));

        //personas.sort(Persona::compareTo);
        Collections.sort(personas);
        personas.forEach(System.out::println);

    }
}