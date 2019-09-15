/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp5;



import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author p2
 */
public class AlumnoEnTrabajo {
    private LocalDate fechaDesde;
    private LocalDate fechaHasta =null; //valor por defecto
    private String razon = null; //valor por defecto
    private Alumno unAlumno ;

   //<editor-fold defaultstate="collapsed" desc="Constructores">
   /**
    * Constructor
    * @param fechaDesde fecha desde la que el Alumno esta en el trabajo
    * @param unAlumno Alumno que participa de un trabajo
    */
    public AlumnoEnTrabajo(LocalDate fechaDesde, Alumno unAlumno) {
        this.fechaDesde = fechaDesde;
        this.unAlumno = unAlumno;
    }
    //</editor-fold>
   
    //<editor-fold defaultstate="collapsed" desc="get y set">
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

    public Alumno getUnAlumno() {
        return unAlumno;
    }

    public void setUnAlumno(Alumno unAlumno) {
        this.unAlumno = unAlumno;
    }
//</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Métodos">
    @Override
    public String toString() {
        return "AlumnoEnTrabajo{" + "fechaDesde=" + fechaDesde + ", fechaHasta=" + fechaHasta + ", razon=" + razon + ", unAlumno=" + unAlumno + '}';
    }
    
    
    //</editor-fold>

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.unAlumno);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AlumnoEnTrabajo other = (AlumnoEnTrabajo) obj;
        if (!Objects.equals(this.unAlumno, other.unAlumno)) {
            return false;
        }
        return true;
    }
    
    
}
