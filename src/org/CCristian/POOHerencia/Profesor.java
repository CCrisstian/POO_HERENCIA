package org.CCristian.POOHerencia;

public class Profesor extends Persona{
    /*----------ATRIBUTOS----------*/
        private String asignatura;
    /*----------ATRIBUTOS----------*/


    /*----------GETTER-SETTER----------*/
    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }
    /*----------GETTER-SETTER----------*/


    /*----------CONSTRUCTOR----------*/
    public Profesor() {
        System.out.println("Profesor : Inicializando constructor ...");
    }

    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura){
        super(nombre, apellido);
        this.asignatura = asignatura;
    }
    /*----------CONSTRUCTOR----------*/

}
