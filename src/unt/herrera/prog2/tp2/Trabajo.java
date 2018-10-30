/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp2;

import java.time.LocalDate;

/**
 *
 * @author mariana
 */
public class Trabajo {
    //<editor-fold defaultstate="collapsed"  desc="variables de instancia">
    String titulo;
    String area;
    int duracion;
    LocalDate fechaPresentacion; //en la Comisión Académica
    LocalDate fechaAprobacion; // por la Com. Académica
    LocalDate fechaFinalización; // Presentación final del trabajo   
    //</editor-fold>

    /**
     * Constructor
     * @param titulo
     * @param area
     * @param duracion
     * @param fechaPresentacion 
     */
    public Trabajo(String titulo, String area, int duracion, LocalDate fechaPresentacion) {
        this.titulo = titulo;
        this.area = area;
        this.duracion = duracion;
        this.fechaPresentacion = fechaPresentacion;
    }
    /**
    * Constructor 
    * @param titulo
    * @param area
    * @param fechaPresentacion
    * @param duracion
    * @param fechaAprobacion 
    */
    public Trabajo(String titulo, String area,int duracion,  LocalDate fechaPresentacion, LocalDate fechaAprobacion) {
        this(titulo, area,duracion, fechaPresentacion);
        this.fechaAprobacion = fechaAprobacion;
    }
    
    /**
    * Constructor 
    * @param titulo
    * @param area
    * @param duracion
    * @param fechaPresentacion
    * @param fechaAprobacion 
    */
   
    //Métodos Get y Set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public LocalDate getFechaPresentacion() {
        return fechaPresentacion;
    }

    public void setFechaPresentacion(LocalDate fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }

    public LocalDate getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(LocalDate fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public LocalDate getFechaFinalización() {
        return fechaFinalización;
    }

    public void setFechaFinalización(LocalDate fechaFinalización) {
        this.fechaFinalización = fechaFinalización;
    }    

    @Override
    public String toString() {
        return "Trabajo{" + "titulo=" + titulo + ", area=" + area + ", duracion=" + duracion + '}';
    }
    
    
}
