/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp4;


/**
 *
 * @author mariana
 */
public class Profesor extends Persona{
   //<editor-fold defaultstate="collapsed" desc="variables de instancia">
    private Cargo cargo;
//    private String apellido;
//    private String nombre;
//    private int dni;
    // </editor-fold>
    
   /**
    * Constructor
    * @param cargo
    * @param apellido
    * @param nombre
    * @param dni 
    */
    public Profesor(String apellido, String nombre, int dni, Cargo cargo) {
        super(apellido, nombre, dni);
        this.cargo = cargo;
    }
    
   //<editor-fold  defaultstate="collapsed" desc="get y set">
    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
//    }
//
//    public String getApellido() {
//        return apellido;
//    }
//
//    public void setApellido(String apellido) {
//        this.apellido = apellido;
//    }
//
//    public int getDni() {
//        return dni;
//    }
//
//    public void setDni(int dni) {
//        this.dni = dni;
//    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Profesor: [" + this.getDni() + "] " + this.getApellido() + ", " + this.getNombre() + " - Cargo: " + cargo  ;
    }
    
    public void mostrar(){
       // System.out.print(this.apellido.toUpperCase() + ", " + this.nombre.toUpperCase());
        super.mostrar();
        System.out.println("("+ this.cargo + ")");
    }

//    @Override
//    public int hashCode() {
//        int hash = 5;
//        hash = 79 * hash + this.dni;
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final Profesor other = (Profesor) obj;
//        if (this.dni != other.dni) {
//            return false;
//        }
//        return true;
//    }
//    
    
}
