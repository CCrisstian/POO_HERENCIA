package org.CCristian.POOHerencia;

public class Persona {
    /*----------ATRIBUTOS----------*/
    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    /*----------ATRIBUTOS----------*/

    /*----------GETTER-SETTER----------*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    /*----------GETTER-SETTER----------*/


    /*----------CONSTRUCTOR----------*/
    public Persona() {
        System.out.println("Persona : Inicializando constructor ...");
    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public  Persona(String nombre, String apellido, int edad){
        this(nombre, apellido);
        this.edad = edad;
    }
    /*----------CONSTRUCTOR----------*/

    /*----------MÉTODO----------*/
        public String Saludar(){
            return "Hola, que tal!";
        }

    @Override
    public String toString() {
        return Saludar() +
                "\nNombre = " +nombre+
                "\nApellido = "+apellido+
                "\nEdad = "+edad+
                "\nEmail = "+email;
    }

    /*----------MÉTODO----------*/


}
