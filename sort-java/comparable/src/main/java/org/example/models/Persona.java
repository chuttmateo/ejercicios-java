package org.example.models;

import org.example.enums.EstadoCivil;

public class Persona implements Comparable<Persona>{
    private int DNI;
    private String nombre;
    private String apellido;
    private double estaturaEnM;
    private EstadoCivil estadoCivil;

    public Persona(int DNI, String nombre, String apellido, double estaturaEnM, EstadoCivil estadoCivil) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estaturaEnM = estaturaEnM;
        this.estadoCivil = estadoCivil;
    }

    public String nombreCompleto(){
        return this.nombre + " " + this.apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "DNI=" + DNI +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", estaturaEnM=" + estaturaEnM +
                ", estadoCivil=" + estadoCivil +
                '}';
    }

    /*
    @Override
    public int compareTo(Persona o) {
        //si YO vengo antes que la OTRA, retorno un NEGATIVO
        //si YO voy después que la OTRA, retorno un POSITIVO
        //si somos iguales, retorno un cero
        if (this.DNI < o.DNI) return -1; //por considerarla del mismo tipo java nos permite acceder al dni de la otra persona si usar un getter.
        if (this.DNI > o.DNI) return 1;
        return 0;

        //return this.DNI - o.DNI; o puedo usar una resta.
        //para hacerlo desc tengo que implementar el método al revés
    }*/

    /*
    @Override
    public int compareTo(Persona o) {
        //si YO vengo antes que la OTRA, retorno un NEGATIVO
        //si YO voy después que la OTRA, retorno un POSITIVO
        //si somos iguales, retorno un cero
        return this.nombre.compareTo(o.nombre);
    }*/

    /*@Override
    public int compareTo(Persona o) {
        //si YO vengo antes que la OTRA, retorno un NEGATIVO
        //si YO voy después que la OTRA, retorno un POSITIVO
        //si somos iguales, retorno un cero
        //return ((Double) this.estaturaEnM).compareTo(o.estaturaEnM);
        int retorno=0;
        if (this.estaturaEnM < o.estaturaEnM) retorno = -1;
        if (this.estaturaEnM > o.estaturaEnM) retorno = 1;
        return retorno;
    }*/
    @Override
    public int compareTo(Persona o) {
        //si YO vengo antes que la OTRA, retorno un NEGATIVO
        //si YO voy después que la OTRA, retorno un POSITIVO
        //si somos iguales, retorno un cero
        //return ((Double) this.estaturaEnM).compareTo(o.estaturaEnM);
        //return this.estadoCivil.ordinal() - o.estadoCivil.ordinal(); //por orden en el enum
        return this.estadoCivil.toString().compareTo(o.estadoCivil.toString());
    }
}
