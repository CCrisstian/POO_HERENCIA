package org.CCristian.Ejemplo;

import org.CCristian.POOHerencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {
        System.out.println("==================Creando la instancia de la clase Alumno==================");
        Alumno alumno = new Alumno();
        alumno.setNombre("Cristian");
        alumno.setApellido("Cristaldo");
        alumno.setInstitucion("UTN");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);

        System.out.println("\n==================Creando la instancia de la clase Alumno Internacional==================");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);

        System.out.println("\n==================Creando la instancia de la clase Profesor==================");
        Profesor profesor = new Profesor();
        profesor.setNombre("Fefe");
        profesor.setApellido("Torres");
        profesor.setAsignatura("Lengua");

        System.out.println("\nInstitución "+alumno.getInstitucion()+" : "+alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Institución "+alumnoInt.getInstitucion()+" : "+alumnoInt.getNombre() + " " + alumnoInt.getApellido() +"; País: " + alumnoInt.getPais());
        System.out.println("Profesor "+profesor.getAsignatura() + " : " +profesor.getNombre() + " " + profesor.getApellido() + "\n");

        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija +" es una clase hija de la clase padre "+ padre);
            clase = clase.getSuperclass();
        }
    }
}
