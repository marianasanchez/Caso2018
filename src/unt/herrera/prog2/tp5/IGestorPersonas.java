/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mariana
 */
public interface IGestorPersonas {
//Constantes para el ABM de profesores y alumnos    
    public static final String EXITO_PROFESORES = "Profesor creado con éxito";
    public static final String ERROR_PROFESORES = "Los apellidos y/o nombres y/o DNI y/o cargo del profesor son incorrectos";
    public static final String PROFESORES_DUPLICADOS = "Ya existe un profesor/alumno con ese documento";
        
    public static final String EXITO_ALUMNOS = "Alumno creado con éxito";
    public static final String ERROR_ALUMNOS = "Los apellidos y/o nombres y/o DNI y/o CX del alumno no pueden son incorrectos";
    public static final String ALUMNOS_DUPLICADOS = "Ya existe un profesor/alumno con ese documento o un alumno con ese CX";
               
    /**
     * Crea un nuevo profesor
     * @param apellidos apellidos del profesor
     * @param nombres nombres del profesor
     * @param dni documento del profesor
     * @param cargo cargo del profesor
     * @return cadena con el resultado de la operación
    */                                                                    
    public String nuevoProfesor(String apellidos, String nombres, int dni, Cargo cargo);
    
    /**
     * Crea un nuevo alumno
     * @param apellidos apellidos del alumno
     * @param nombres nombres del alumno
     * @param dni documento del profesor
     * @param cx cx del alumno
     * @return cadena con el resultado de la operación
    */                                                                    
    public String nuevoAlumno(String apellidos, String nombres, int dni, String cx);
                                                                         
    public ArrayList<Profesor> buscarProfesores(String apellidos);
    
    /**
     * Busca si existe uno o mas alumnos con el apellido especificado (total o parcialmente)
     * Si no se especifica un apellido, devuelve todos los alumnos
     * Este método es usado por las clases ModeloTablaAlumnos y ModeloListaAlumnos
     * @param apellidos apellidos del alumno a buscar
     * @return List<Alumno>  - lista de alumnos, ordenados por apellidos y nombres, cuyos apellidos coincidan con el especificado
    */                                                                            
    public ArrayList<Alumno> buscarAlumnos(String apellidos);    
                 
    /**
     * Busca si existe un profesor cuyo documento coincida con el especificado
     * Si existe un profesor con el documento especificado, lo devuelve
     * Si no hay un profesor con el documento especicado, devuelve null
     * A este método lo usa la clase GestorTrabajos
     * @param documento documento del profesor a buscar
     * @return Profesor  - objeto Profesor cuyo documento coincida con el especificado, o null
     */
    public Profesor dameProfesor(int documento);        
    
    /**
     * Busca si existe un alumno cuyo cx coincida con el especificado
     * Si existe un alumno con el cx especificado, lo devuelve
     * Si no hay un alumno con el cx especicado, devuelve null
     * A este método lo usa la clase GestorTrabajos
     * @param cx cx del alumno a buscar
     * @return Alumno  - objeto Alumno cuyo cx coincida con el especificado, o null
     */
    public Alumno dameAlumno(String cx);            
    public void mostrarPersonas();
    public void mostrarAlumnos();
    public void mostrarProfesores();
}
