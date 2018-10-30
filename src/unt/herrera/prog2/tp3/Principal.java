/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
        ArrayList<Area> listaAreas =new ArrayList<> ();
    
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
        
        //Areas
        Area area1= new Area("Software");
        Area area2=new Area("Hardware");
        Area area3=new Area("Sistemas Embebidos");
        Area area4=new Area("Redes");
        Area area5=new Area("Otra área");
        listaAreas.add(area1);
        listaAreas.add(area2);
        listaAreas.add(area3);
        listaAreas.add(area4);
        listaAreas.add(area5);
        
        List<Area> listaA1= new ArrayList<>();
        listaA1.add(listaAreas.get(0));
        List<Area> listaA2= new ArrayList<>();
        listaA2.add(listaAreas.get(0));
        listaA2.add(listaAreas.get(1));
        List<Area> listaA3= new ArrayList<>();
        listaA3.add(listaAreas.get(1));
        listaA3.add(listaAreas.get(3));
        
        LocalDate fecha1 = LocalDate.of(2017, 10, 2);
        LocalDate fecha2 = null; 
        LocalDate fecha3 = LocalDate.of(2017, 11, 2);
        LocalDate fecha4= LocalDate.of(2017, 8, 12);
        LocalDate fecha5= LocalDate.of(2017, 9, 12);
        LocalDate fecha6= LocalDate.of(2017, 10, 2);
        //TRABAJO
        //TRABAJO 1 Un trabajo Presentado sin aprobarse aun, con dos alumnos tutor y cotutor
        List<AlumnoEnTrabajo> listaAeT = new ArrayList<>();
        List<RolEnTrabajo> listaRT = new ArrayList<>();
        //Alumnos en el Trabajo
        AlumnoEnTrabajo aET11 = new AlumnoEnTrabajo(fecha1, listaAlumnos.get(0));
        AlumnoEnTrabajo aET12 = new AlumnoEnTrabajo(fecha1, listaAlumnos.get(1));
        listaAeT.add(aET11);
        listaAeT.add(aET12);
        //Profesores en el Trabajo
        RolEnTrabajo rt11= new RolEnTrabajo(fecha1, listaProfesores.get(0), Rol.TUTOR);
        listaRT.add(rt11);
        RolEnTrabajo rt12= new RolEnTrabajo(fecha1, listaProfesores.get(1), Rol.COTUTOR);
        listaRT.add(rt12);
        Trabajo trab1 = new Trabajo ("Protocolos de comunicación", listaA1,6, fecha1,fecha2, listaAeT, listaRT);
        listaTrabajos.add(trab1);
        
        
        //TRABAJO
        //TRABAJO 2 Un trabajo Presentado sin aprobarse aun, con dos Alumnos y un tutor
        List<AlumnoEnTrabajo> listaAeT2 = new ArrayList<>();
        List<RolEnTrabajo> listaRT2 = new ArrayList<>();
        //Alumnos en el Trabajo
        AlumnoEnTrabajo aET21 = new AlumnoEnTrabajo(fecha1, listaAlumnos.get(2));
        AlumnoEnTrabajo aET22 = new AlumnoEnTrabajo(fecha1, listaAlumnos.get(3));
        listaAeT2.add(aET21);
        listaAeT2.add(aET22);
        //Profesores en el Trabajo
        RolEnTrabajo rt21= new RolEnTrabajo(fecha1, listaProfesores.get(0), Rol.TUTOR);
        listaRT2.add(rt21);
        Trabajo trab2 = new Trabajo ("Gestión de Trabajos Finales", listaA2,8, fecha3,fecha2, listaAeT2, listaRT2);
        listaTrabajos.add(trab2);
        
        //TRABAJO
        //TRABAJO 3 Un trabajo Presentado sin aprobarse aun
        List<AlumnoEnTrabajo> listaAeT3 = new ArrayList<>();
        List<RolEnTrabajo> listaRT3 = new ArrayList<>();
        //Alumnos en el Trabajo
        AlumnoEnTrabajo aET31 = new AlumnoEnTrabajo(fecha4, listaAlumnos.get(0));
        listaAeT3.add(aET31);
        //Profesores en el Trabajo
        RolEnTrabajo rt31= new RolEnTrabajo(fecha1, listaProfesores.get(0), Rol.TUTOR);
        listaRT3.add(rt31);
        Trabajo trab3 = new Trabajo ("Este es el titulo del Trabajo", listaA3,8, fecha4,fecha2, listaAeT2, listaRT2);
        listaTrabajos.add(trab3);
        
//        Trabajo trab4 = new Trabajo ("Tema 4", ,6,  LocalDate.of(2017, 9, 12));
        //TRABAJO 3 Un trabajo Presentado sin aprobarse aun
        List<AlumnoEnTrabajo> listaAeT4 = new ArrayList<>();
        List<RolEnTrabajo> listaRT4 = new ArrayList<>();
        //Alumnos en el Trabajo
        AlumnoEnTrabajo aET41 = new AlumnoEnTrabajo(fecha4, listaAlumnos.get(1));
        AlumnoEnTrabajo aET42 = new AlumnoEnTrabajo(fecha4, listaAlumnos.get(4));
        listaAeT4.add(aET41);
        //Profesores en el Trabajo
        RolEnTrabajo rt41= new RolEnTrabajo(fecha1, listaProfesores.get(4), Rol.TUTOR);
        listaRT4.add(rt41);
        Trabajo trab4 = new Trabajo ("Tema 4", listaA1,5, fecha5,fecha2, listaAeT4, listaRT4);
        listaTrabajos.add(trab4);
        
//      
        //MOSTRAR
        System.out.println("\n*** Mostrando  *** \n ");
        System.out.println("\n*** Areas *** \n ");
        for (Area a :listaAreas)
            System.out.println(a);
       
        System.out.println("\n*** PROFESORES *** \n ");
        for(Profesor p: listaProfesores)
            System.out.println(p);
        
        
        System.out.println("\n*** ALUMNOS *** \n ");
        for(Alumno unAlumno : listaAlumnos)
            //unAlumno.mostrar();
            System.out.println(unAlumno);
        
        System.out.println("\n*** TRABAJOS *** \n ");
        for (Trabajo t : listaTrabajos)
            System.out.println(t);
        
        System.out.println("\n*** TRABAJOS CON MOSTRAR *** \n ");
        for (Trabajo t : listaTrabajos)
            t.mostrar();
        
        //AGREGAR JURADO, FECHA APROBACION
        RolEnTrabajo rt42= new RolEnTrabajo(fecha4, listaProfesores.get(3), Rol.JURADO);
        RolEnTrabajo rt43= new RolEnTrabajo(fecha4, listaProfesores.get(2), Rol.JURADO);
        RolEnTrabajo rt44= new RolEnTrabajo(fecha4, listaProfesores.get(1), Rol.JURADO);
        trab4.agregarProfesor(rt43);
        trab4.agregarProfesor(rt42);
        trab4.agregarProfesor(rt44);
        trab4.setFechaAprobacion(fecha4);
        
        System.out.println("\n*** TRABAJOS CON MOSTRAR *** \n ");
        for (Trabajo t : listaTrabajos)
            t.mostrar();
        
        //AGREGAR SEMINARIO
        
        Seminario unSeminario = new Seminario(fecha6, NotaAprobacion.APROBADO_SINOBS, null);
        listaTrabajos.get(3).agregarSeminario(unSeminario);
        
        System.out.println("\n*** TRABAJOS CON MOSTRAR *** \n ");
        for (Trabajo t : listaTrabajos)
            t.mostrar();
            

    
    }

    

    
        
   
}
