package org.CCristian.POOHerencia;

public class Alumno extends Persona{
    /*----------ATRIBUTOS----------*/
        private String institucion;
        private double NotaMatematica;
        private double NotaCastellano;
        private double NotaHistoria;
    /*----------ATRIBUTOS----------*/


    /*----------GETTER-SETTER----------*/
    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public double getNotaMatematica() {
        return NotaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        NotaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return NotaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        NotaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return NotaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        NotaHistoria = notaHistoria;
    }
    /*----------GETTER-SETTER----------*/


    /*----------CONSTRUCTOR----------*/
    public Alumno() {
        System.out.println("Alumno : Inicializando constructor ...");
    }

    public Alumno(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public  Alumno(String nombre, String apellido, int edad, String institución){
        super(nombre, apellido, edad);
        this.institucion = institución;
    }

    public Alumno(String nombre, String apellido, int edad, String institución,
                  double notaMatematica, double notaCastellano, double notaHistoria){
        this(nombre, apellido, edad, institución);
        this.NotaMatematica = notaMatematica;
        this.NotaCastellano = notaCastellano;
        this.NotaHistoria = notaHistoria;
    }
    /*----------CONSTRUCTOR----------*/
}
