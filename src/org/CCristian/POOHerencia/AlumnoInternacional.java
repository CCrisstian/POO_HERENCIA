package org.CCristian.POOHerencia;

public final class AlumnoInternacional extends Alumno{
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


    /*----------MÉTODO----------*/
    @Override
    public String Saludar() {
        return super.Saludar()+", soy extranjero y vengo de "+getPais();
    }

    @Override
    public double CalcularPromedio() {
        System.out.println(AlumnoInternacional.class.getCanonicalName());
        return ((super.CalcularPromedio())*3 + notaIdiomas) / 4;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPais = "+pais+
                "\nnotaIdiomas = "+notaIdiomas;
    }

    /*----------MÉTODO----------*/

}
