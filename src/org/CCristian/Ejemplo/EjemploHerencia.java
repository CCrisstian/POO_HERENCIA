package org.CCristian.Ejemplo;

import org.CCristian.POOHerencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Cristian");
        alumno.setApellido("Cristaldo");
        alumno.setInstitucion("UTN");

        Profesor profesor = new Profesor();
        profesor.setNombre("Fefe");
        profesor.setApellido("Torres");
        profesor.setAsignatura("Lengua");

        System.out.println("Institución "+alumno.getInstitucion()+" : "+alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor "+profesor.getAsignatura() + " : " +profesor.getNombre() + " " + profesor.getApellido());
    }
}
