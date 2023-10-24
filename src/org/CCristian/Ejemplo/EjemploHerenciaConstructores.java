package org.CCristian.Ejemplo;

import org.CCristian.POOHerencia.*;

public class EjemploHerenciaConstructores {
    public static void main(String[] args) {
        System.out.println("==================Creando la instancia de la clase Alumno==================");
        Alumno alumno = new Alumno("Cristian","Cristaldo",30,"UTN");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("CristianC@correo.electronico");

        System.out.println("\n==================Creando la instancia de la clase Alumno Internacional==================");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter","Gosling","Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("AlumnoInternacional@correo.electronico");


        System.out.println("\n==================Creando la instancia de la clase Profesor==================");
        Profesor profesor = new Profesor("Fefe","Torres","Matemáticas");
        profesor.setEdad(33);
        profesor.setEmail("FEFE@correo.electronico");

        Imprimir(alumno);
        System.out.println("\n==========================================================\n");
        Imprimir(alumnoInt);
        System.out.println("\n==========================================================");
        Imprimir(profesor);

    }
    /*----------------Control de tipos----------------*/
    public static void Imprimir(Persona persona){
        System.out.println("Imprimiendo datos en común de la clase Persona"+
                            "\nNombre: "+persona.getNombre()+
                            "\nApellido: "+persona.getApellido()+
                            "\nEdad: "+persona.getEdad()+
                            "\nEmail: "+persona.getEmail());

        if (persona instanceof Alumno){
            System.out.println("\nImprimiendo datos de la clase Alumno");
            System.out.println("\nInstitución: "+((Alumno) persona).getInstitucion());
            System.out.println("\nNota Castellano: "+ ((Alumno) persona).getNotaCastellano());
            System.out.println("\nNota Historia: "+ ((Alumno) persona).getNotaHistoria());
            System.out.println("\nNota Matemática: "+((Alumno) persona).getNotaMatematica());

            if (persona instanceof AlumnoInternacional){
                System.out.println("\nImprimiendo datos de la clase Alumno Internacional");
                System.out.println("\nNota Idiomas: "+((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("\nPaís: "+((AlumnoInternacional) persona).getPais());
            }
        }

        if (persona instanceof Profesor){
            System.out.println("\nImprimiendo datos de la clase Profesor");
            System.out.println("\nAsignatura: "+((Profesor) persona).getAsignatura());
        }
    }
    /*----------------Control de tipos----------------*/
}
