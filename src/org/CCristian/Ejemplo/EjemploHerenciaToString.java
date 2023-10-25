package org.CCristian.Ejemplo;

import org.CCristian.POOHerencia.Alumno;
import org.CCristian.POOHerencia.AlumnoInternacional;
import org.CCristian.POOHerencia.Persona;
import org.CCristian.POOHerencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Cristian","Cristaldo",30,"UTN");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("CristianC@correo.electronico");

        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter","Gosling","Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("AlumnoInternacional@correo.electronico");

        Profesor profesor = new Profesor("Fefe","Torres","Matemáticas");
        profesor.setEdad(33);
        profesor.setEmail("FEFE@correo.electronico");

        Imprimir(alumno);
        Imprimir(alumnoInt);
        Imprimir(profesor);

    }
    public static void Imprimir(Persona persona){
        System.out.println("\n==========================================================\n");
        System.out.println(persona);
    }

}
