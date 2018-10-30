/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp3;

import unt.herrera.prog2.tp2.*;

/**
 *
 * @author mariana
 */
public class Profesor {
   //<editor-fold defaultstate="collapsed" desc="variables de instancia">
    private String cargo;
    private String apellido;
    private String nombre;
    private int dni;
    // </editor-fold>
    
   /**
    * Constructor
    * @param cargo
    * @param apellido
    * @param nombre
    * @param dni 
    */
    public Profesor( String apellido, String nombre, int dni, String cargo) {
        this.cargo = cargo;
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
    }
    
   //<editor-fold  defaultstate="collapsed" desc="get y set">
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Profesor: [" + dni + "] " + apellido + ", " + nombre + " - Cargo: " + cargo  ;
    }
    
    public void mostrar(){
        System.out.print(this.apellido.toUpperCase() + ", " + this.nombre.toUpperCase());
        System.out.println("("+ this.cargo + ")");
    }
}
