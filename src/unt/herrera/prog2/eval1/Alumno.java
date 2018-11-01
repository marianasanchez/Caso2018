/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.eval1;


import java.util.Objects;



/**
 *
 * @author mariana
 */
public class Alumno extends Persona {
    //<editor-fold defaultstate="collapsed" desc="variables de instancia">
    private String cx;
//    private String apellido;
//    private String nombre;
//    private int dni;
    // </editor-fold>
    
    /**
     * Constructor 
     * @param cx CX del Alumno
     * @param apellido apellido del Alumno
     * @param nombre nombre del Alumno
     * @param dni DNI del Alumno
    */      

    public Alumno( String apellido, String nombre, int dni, String cx) {
        super(apellido, nombre,dni);
        this.cx = cx;
//        this.apellido = apellido;
//        this.nombre = nombre;
//        this.dni = dni;
    }
    
     //<editor-fold defaultstate="collapsed" desc="métodos get y set">   
    
    public String getCx() {
        return cx;
    }

    public void setCx(String libreta) {
        this.cx = libreta;
    }

//    public String getApellido() {
//        return apellido;
//    }
//
//    public void setApellido(String apellido) {
//        this.apellido = apellido;
//    }
//
//    public String getNombre() {
//        return nombre;
//    }
//
//    public void setNombre(String nombre) {
//        this.nombre = nombre;
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
        return "Alumno: [" + this.getDni() +"] " + this.getApellido() + ", " + this.getNombre() + " - CX: " + this.cx;
    }

    public void mostrar(){
        super.mostrar();
        System.out.println("  CX: " +this.getCx());//() +  " - " + this.getApellido().toUpperCase() + ", " + this.getNombre().toUpperCase());
    }




//PARA la PRIMERA PARTE
//    @Override
//    public int hashCode() {
//        int hash = 3;
//        hash = 97 * hash + this.dni;
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
//        final Alumno other = (Alumno) obj;
//        if (this.dni != other.dni) {
//            return false;
//        }
//        return true;
//    }
//    

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + super.hashCode() + Objects.hashCode(this.cx);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
       if(!super.equals(obj)){
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Alumno other = (Alumno) obj;
            if (!Objects.equals(this.cx, other.cx)) {
                return false;
            }
        }
        return true;
    }
    
}
