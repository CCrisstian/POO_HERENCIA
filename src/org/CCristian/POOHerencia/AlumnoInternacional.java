package org.CCristian.POOHerencia;

public class AlumnoInternacional extends Alumno{
    /*----------ATRIBUTOS----------*/
        private String pais;
        private double notaIdiomas;
    /*----------ATRIBUTOS----------*/


    /*----------GETTER-SETTER----------*/
    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public double getNotaIdiomas() {
        return notaIdiomas;
    }

    public void setNotaIdiomas(double notaIdiomas) {
        this.notaIdiomas = notaIdiomas;
    }
    /*----------GETTER-SETTER----------*/

    /*----------CONSTRUCTOR----------*/
    public AlumnoInternacional() {
        System.out.println("AlumnoInternacional : Inicializando constructor ...");
    }

    public  AlumnoInternacional(String nombre, String apellido){
        super(nombre, apellido);
    }

    public AlumnoInternacional(String nombre, String apellido, String pais){
        super(nombre, apellido);
        this.pais = pais;
    }
    /*----------CONSTRUCTOR----------*/

}
