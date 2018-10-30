/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp3;

import java.time.LocalDate;

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
        String t= "Seminario: " + fechaExposicion + " Nota: " + this.notaap;
        t += (this.observaciones== null) ? "" : " "+this.observaciones;
        return t;
    }
    
    
}
