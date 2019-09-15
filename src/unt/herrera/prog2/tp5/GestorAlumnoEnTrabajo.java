/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp5;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author m
 */
public class GestorAlumnoEnTrabajo implements IGestorAlumnosEnTrabajos {
    private ArrayList<Area> listaAlumnoEnTrabajo = new ArrayList<>();//????
    private static GestorAlumnoEnTrabajo gestor;
    /**
     * Constructor
    */                                            
    private GestorAlumnoEnTrabajo() {    
    }
    
    /**
     * Método estático para crear una única instancia del gestor
     * @return GestorRolEnTrabajo
    */                                                            
    public static GestorAlumnoEnTrabajo instanciar() {
        if (gestor == null) 
            gestor = new GestorAlumnoEnTrabajo();            
        return gestor;
    } 
    
    public AlumnoEnTrabajo nuevoAlumnoEnTrabajo( LocalDate fechaDesde, Alumno unAlumno){
        AlumnoEnTrabajo aet =null;
        if(unAlumno !=null  && fechaDesde !=null)
            aet = new AlumnoEnTrabajo(fechaDesde,unAlumno);
        //y va a la lista??? puedo ver si asi no esta en otro trabajp?
        return aet;
    }
        
}
