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
}
