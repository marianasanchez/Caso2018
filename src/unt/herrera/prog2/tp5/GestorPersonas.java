/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp5;

import java.util.ArrayList;

/**
 *
 * @author MARIANA
 */
public class GestorPersonas implements IGestorPersonas{
    
    private ArrayList<Persona> listaPersonas = new ArrayList<>();
    private static GestorPersonas gestor;
    /**
     * Constructor
    */                                            
    private GestorPersonas() {    
    }
    
    /**
     * Método estático para crear una única instancia de GestorAreas
     * @return GestorAreas
    */                                                            
    public static GestorPersonas instanciar() {
        if (gestor == null) 
            gestor = new GestorPersonas();            
        return gestor;
    } 
    
    public String nuevoProfesor(String apellidos, String nombres, int dni, Cargo cargo){
        if ((apellidos != null) && (!apellidos.trim().isEmpty()) && 
                (nombres != null) && (!nombres.trim().isEmpty()) && //VER LO DE NULL y EMPTY
                (dni > 0) && (cargo != null))  { //apellidos, nombres, dni y cargo correctos
            Persona profesor = new Profesor(apellidos, nombres, dni, cargo);
            if (!this.listaPersonas.contains(profesor)) { //no existe este profesor
                this.listaPersonas.add(profesor);
                return EXITO_PROFESORES;
            }
            else //ya existe un profesor con este documento
                return PROFESORES_DUPLICADOS;
        }
        else  //apellidos y/o nombres y/o dni y/o cargo incorrectos
           return ERROR_PROFESORES;
    }                                                                   
    public String nuevoAlumno(String apellidos, String nombres, int dni, String cx){
        if ((apellidos != null) && (!apellidos.trim().isEmpty()) &&
                (nombres != null) && (!nombres.trim().isEmpty()) && 
                (dni > 0) && (cx != null) && (!cx.trim().isEmpty()))  { //apellidos, nombres, dni y cx correctos
            Persona alumno = new Alumno(apellidos, nombres, dni, cx);
            if (!this.listaPersonas.contains(alumno)) { //no existe este alumno
                this.listaPersonas.add(alumno);
                return EXITO_ALUMNOS;
            }
            else //ya existe un alumno con este documento
                return ALUMNOS_DUPLICADOS;
        }
        else  //apellidos y/o nombre y/o dni y/o CX incorrectos
           return ERROR_ALUMNOS;
    }
                                                                         
    public ArrayList<Profesor> buscarProfesores(String apellidos){
        ArrayList<Profesor> profesoresBuscados = new ArrayList<>();
        for(Persona persona : this.listaPersonas) {
            if (persona instanceof Profesor) {
                if (apellidos != null) { //OJO!
                    if (persona.getApellido().toLowerCase().contains(apellidos.toLowerCase()))
                        profesoresBuscados.add((Profesor)persona);
                }
                else  //todos los profesores
                    profesoresBuscados.add((Profesor)persona);            
            }
        }
        return profesoresBuscados;
    }
    
    public ArrayList<Alumno> buscarAlumnos(String apellidos){
        ArrayList<Alumno> alumnosBuscados = new ArrayList<>();
        for(Persona persona : this.listaPersonas) {
            if (persona instanceof Alumno) {
                if (apellidos != null) {
                    if (persona.getApellido().toLowerCase().contains(apellidos.toLowerCase()))
                        alumnosBuscados.add((Alumno)persona);
                }
                else { //todos los alumnos
                    alumnosBuscados.add((Alumno)persona);
                }                
            }
        }
        return alumnosBuscados;
    }
                 
    public Profesor dameProfesor(int documento){
        for(Persona persona : this.listaPersonas) {
            if ((persona instanceof Profesor) && (persona.getDni() == documento))
                return (Profesor)persona;
        }
        return null; 
    }
    
    public Alumno dameAlumno(String cx){
        for(Persona persona : this.listaPersonas) {
            if ((persona instanceof Alumno) && (((Alumno)persona).getCx().equals(cx)))
                return (Alumno)persona;
        }
        return null; 
    }  

    @Override
    public void mostrarPersonas() {
        for(Persona p: this.listaPersonas)
            p.mostrar();
    }

    @Override
    public void mostrarAlumnos() {
        for(Persona p: this.listaPersonas)
            if(p instanceof Alumno)
                p.mostrar();
    }

    @Override
    public void mostrarProfesores() {
        for(Persona p: this.listaPersonas)
            if(p instanceof Profesor)
                p.mostrar();
    }
    
    
}
