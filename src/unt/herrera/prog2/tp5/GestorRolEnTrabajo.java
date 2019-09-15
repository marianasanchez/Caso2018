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
public class GestorRolEnTrabajo implements IGestorRolesEnTrabajos {
    private ArrayList<Area> listaRolEnTrabajo = new ArrayList<>();//????
    private static GestorRolEnTrabajo gestor;
    /**
     * Constructor
    */                                            
    private GestorRolEnTrabajo() {    
    }
    
    /**
     * Método estático para crear una única instancia del gestor
     * @return GestorRolEnTrabajo
    */                                                            
    public static GestorRolEnTrabajo instanciar() {
        if (gestor == null) 
            gestor = new GestorRolEnTrabajo();            
        return gestor;
    } 
    
    public RolEnTrabajo nuevoRolEnTrabajo(Profesor unProfesor, Rol unRol, LocalDate fechaDesde){
        RolEnTrabajo r =null;
        if(unProfesor !=null && unRol!= null && fechaDesde !=null)
            r = new RolEnTrabajo(fechaDesde,unProfesor, unRol);
        return r;
    }
        
}
