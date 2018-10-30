/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp4;

/**
 *
 * @author p2
 */
public class Persona {
    //<editor-fold defaultstate="collapsed" desc="variables de instancia">
    
    private String apellido;
    private String nombre;
    private int dni;
    // </editor-fold>

    public Persona(String apellido, String nombre, int dni) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.dni = dni;
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
    
    @Override
    public String toString() {
        return " [" + dni + "] " + apellido + ", " + nombre ;
    }
    
    public void mostrar(){
        System.out.print(" [" + dni + "] "+this.apellido.toUpperCase() + ", " + this.nombre.toUpperCase());
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + this.dni;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass().getSuperclass() != obj.getClass().getSuperclass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (this.dni != other.dni) {
            return false;
        }
        return true;
    }
    
    
}
