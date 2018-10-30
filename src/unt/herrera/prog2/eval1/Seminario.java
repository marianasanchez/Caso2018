/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.eval1;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 *
 * @author p2
 */
public class Seminario {
    private LocalDate fechaExposicion;
    private NotaAprobacion notaap;
    private String observaciones;

    public Seminario(LocalDate fechaExposicion, NotaAprobacion notaap, String observaciones) {
        this.fechaExposicion = fechaExposicion;
        this.notaap = notaap;
        this.observaciones = observaciones;
    }
    //<editor-fold defaultstate="collapsed"  desc="get y set">
    public NotaAprobacion getNotaap() {
        return notaap;
    }

    public void setNotaap(NotaAprobacion notaap) {
        this.notaap = notaap;
    }

    public LocalDate getFechaExposicion() {
        return fechaExposicion;
    }

    public void setFechaExposicion(LocalDate fechaExposicion) {
        this.fechaExposicion = fechaExposicion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    //</editor-fold>
    @Override
    public String toString() {
        String t= "Seminario: " + fechaConFormato(fechaExposicion) + " Nota: " + this.notaap;
        t += (this.observaciones== null) ? "" : " "+this.observaciones;
        return t;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.fechaExposicion);
        return hash;
    }
    /**
     * Compara si dos objetos son iguales según fecha de Exposición
     * @param obj
     * @return 
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Seminario other = (Seminario) obj;
        if (!Objects.equals(this.fechaExposicion, other.fechaExposicion)) {
            return false;
        }
        return true;
    }
    
    public String fechaConFormato(LocalDate fecha){
       String patron = "dd/MM/yyyy";
       String fechaFormateada = fecha==null? " - " : fecha.format(DateTimeFormatter.ofPattern(patron)); 
       return fechaFormateada;
    }
}
