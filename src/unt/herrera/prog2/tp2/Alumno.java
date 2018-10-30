/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp2;

/**
 *
 * @author mariana
 */
public class Alumno {
    //<editor-fold defaultstate="collapsed" desc="variables de instancia">
    private String libreta;
    private String apellido;
    private String nombre;
    private int dni;
    // </editor-fold>
    
    /**
     * Constructor 
     * @param libreta CX del Alumno
     * @param apellido apellido del Alumno
     * @param nombre nombre del Alumno
     * @param dni DNI del Alumno
    */      

    public Alumno( String apellido, String nombre, int dni, String libreta) {
        this.libreta = libreta;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
    }
    
     //<editor-fold defaultstate="collapsed" desc="métodos get y set">   
    
    public String getLibreta() {
        return libreta;
    }

    public void setLibreta(String libreta) {
        this.libreta = libreta;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Alumno{" + "libreta=" + libreta + ", apellido=" + apellido + ", nombre=" + nombre + ", dni=" + dni + '}';
    }

    public void mostrar(){
        System.out.print(this.apellido.toUpperCase() + ", " + this.nombre.toUpperCase());
        System.out.println(" " + this.dni + " "+ this.libreta );
    }
}
