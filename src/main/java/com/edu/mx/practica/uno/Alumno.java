package com.edu.mx.practica.uno;

import lombok.Data;
@Data
public class Alumno {
    String nombre;
    String apellido;
    String edad;
    String carrera;


    public Alumno(String nom, String ap, String ed, String carr) {
        this.nombre = nom;
        this.apellido = ap;
        this.edad = ed;
        this.carrera = carr;
    }
}
