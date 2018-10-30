/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.eval1;



import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author p2
 */
public class RolEnTrabajo {
    private LocalDate fechaDesde;
    private LocalDate fechaHasta;
    private String razon ;
    private Profesor unProfesor;
    private Rol unRol;

    /**
     * Constructor
     * @param fechaDesde fecha desde la que le profesor participa en el trabajo
     * @param unProfesor profesor que participa en el trabajo
     * @param unRol rol que desempeña unProfesor en el trabajo
     */
    
    public RolEnTrabajo(LocalDate fechaDesde, Profesor unProfesor, Rol unRol) {
        this.fechaDesde = fechaDesde;
        this.unProfesor = unProfesor;
        this.unRol = unRol;
    }

    //<editor-fold defaultstate="collapsed" desc="get y set">
    public Rol getUnRol() {
        return unRol;
    }

    public void setUnRol(Rol unRol) {
        this.unRol = unRol;
    }

    public LocalDate getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(LocalDate fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public LocalDate getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(LocalDate fechaHasta) {
        this.fechaHasta = fechaHasta;
    }

    public String getRazon() {
        return razon;
    }

    public void setRazon(String razon) {
        this.razon = razon;
    }

    public Profesor getUnProfesor() {
        return unProfesor;
    }

    public void setUnProfesor(Profesor unProfesor) {
        this.unProfesor = unProfesor;
    }
    
    //</editor-fold>

    @Override
    public String toString() {
        return "Profesor:"  + unProfesor + " como " + unRol ;
    }
    /**
     * Retorna el hashcode 
     * @return 
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.unProfesor);
        return hash;
    }
    /** 
     * COmpara si dos objetos son iguales de acuerdo al Profesor
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
        final RolEnTrabajo other = (RolEnTrabajo) obj;
        if (!Objects.equals(this.unProfesor, other.unProfesor)) {
            return false;
        }
        return true;
    }
    
    
}
