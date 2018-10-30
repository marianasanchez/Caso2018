/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author mariana
 */
public class Principal {
    public static void main (String Args[] ) { 
        /*Definir un ArrayList para guardar objetos de cada una de las clases
        implementadas,  guardar 5 objetos en cada uno y recorrerlo para mostrarlos. 
        */

        ArrayList<Trabajo> listaTrabajos = new ArrayList<>();
        ArrayList<Profesor> listaProfesores = new ArrayList<>();
        ArrayList<Alumno> listaAlumnos = new ArrayList<>();
    
        //PROFESOR
        Profesor prof1= new Profesor("ApellidoProf1", "NombreProf1", 12345678, "Asociado");
        Profesor prof2= new Profesor("ApellidoProf2", "NombreProf2", 13345678, "JTP");
        Profesor prof3= new Profesor("ApellidoProf3", "NombreProf2", 14345678, "Adjunto");
        Profesor prof4= new Profesor("NombreProf4","ApellidoProf2", 15345678, "ADG"); 
        //CUIDADO! con el orden de los parámetros.
        Profesor prof5= new Profesor("Apellido DobleProf5", "NombreProf5", 16345678, "Asociado");
        
        listaProfesores.add(prof1);
        listaProfesores.add(prof2);
        listaProfesores.add(prof3);
        listaProfesores.add(prof4);
        listaProfesores.add(prof5);
        
        //ALUMNO
        Alumno al1= new Alumno("ApellAlumno1", "Nombre Alumno2", 34567890, "16345");
        Alumno al2= new Alumno("Apell Alumno2", "Nombre Alumno2", 34567891, "16343");
        Alumno al3= new Alumno("ApellAlumno3", "Nombre Alumno3", 34567892, "16344");
        Alumno al4= new Alumno("ApellAlumno4", "Nombre Alumno4", 34567890, "16543");
        Alumno al5= new Alumno("ApellAlumno5", "Nombre Alumno2", 34567895, "17345");
        
        listaAlumnos.add(al1);
        listaAlumnos.add(al2);
        listaAlumnos.add(al3);
        listaAlumnos.add(al4);
        listaAlumnos.add(al5);
        
        //TRABAJO
        Trabajo trab1 = new Trabajo ("Sobre redes", "Redes",6, LocalDate.of(2017, 10, 2));
        Trabajo trab2 = new Trabajo ("Gestión de Trabajos Finales", "Software",8 ,LocalDate.of(2017, 11, 2),  LocalDate.of(2017, 11, 20));
        Trabajo trab3 = new Trabajo ("Tema 3", "Redes", 7, LocalDate.of(2017, 8, 12));
        Trabajo trab4 = new Trabajo ("Tema 4", "Software",6,  LocalDate.of(2017, 9, 12));
        Trabajo trab5 = new Trabajo ("Tema 5", "Software y Hardware",6, LocalDate.of(2017, 10, 2));
        
        listaTrabajos.add(trab1);
        listaTrabajos.add(trab2);
        listaTrabajos.add(trab3);
        listaTrabajos.add(trab4);
        listaTrabajos.add(trab5);
        
        //MOSTRAR
        System.out.println("\n*** TRABAJOS *** \n ");
        for (Trabajo t : listaTrabajos)
            System.out.println(t);
        System.out.println("\n*** PROFESORES *** \n ");
        for(Profesor p: listaProfesores)
            p.mostrar();
        System.out.println("\n*** ALUMNOS *** \n ");
        for(Alumno unAlumno : listaAlumnos)
            unAlumno.mostrar();
        
        /*Intentar crear objetos vacíos, es decir, 
        sin que se especifiquen los valores de sus atributos,
        ¿qué sucede en este caso?*/
        //Trabajo unTrabajo =new Trabajo(); //no es el constructor adecuado
        System.out.println("\n\n");
        Trabajo unTrabajo =new Trabajo(null, null,5,null ); //no es el constructor adecuado
        System.out.println(unTrabajo);
        
        /* Modificar los atributos de algunos objetos accediendo directamente
        a los mismos, ¿se puede realizar esta acción?.*/
        //SE PUEDE --> NO SON PRIVADAS, en las otras clases NO se puede
        unTrabajo.duracion=6;
        al1.setApellido("Apellido 1 Modificado");
        al2.setNombre("Nombre del Alumno Modificado");
        System.out.println("\n*** ALUMNOS *** \n ");
        for(Alumno unAlumno : listaAlumnos)
            unAlumno.mostrar();
        /*Realizar algunas modificaciones a algunos de estos objetos,
        y volver a recorrer los ArrayLists verificando que se hicieron los cambios. */

    
    }

    

    
        
   
}
