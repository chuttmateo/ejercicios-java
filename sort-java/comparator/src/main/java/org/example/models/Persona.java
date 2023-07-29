package org.example.models;

import org.example.enums.EstadoCivil;

public class Persona{
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

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getEstaturaEnM() {
        return estaturaEnM;
    }

    public void setEstaturaEnM(double estaturaEnM) {
        this.estaturaEnM = estaturaEnM;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
