package org.example;

import org.example.enums.EstadoCivil;
import org.example.models.Persona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(1);
        numeros.add(4);
        numeros.add(2);

        Collections.sort(numeros, new ComparadorDeEnteros());
        numeros.forEach(System.out::println);

        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona(9999, "Mateo", "Chutt", 1.75, EstadoCivil.SOLTERO));
        personas.add(new Persona(1111, "Bautista", "Audisio", 1.85, EstadoCivil.VIUDO));
        personas.add(new Persona(2222, "Alejandro", "Main", 1.65, EstadoCivil.DIVORCIADO));
        personas.add(new Persona(5555, "Carlos", "Rodiguez", 1.95, EstadoCivil.CASADO));

        Collections.sort(personas, new ComparadorPersonasAltura(false));

        //Collections.sort(personas);
        personas.forEach(System.out::println);

    }
}