/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.eval1;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author prog2
 */
public class PrincipalEval1 {
    public static void main (String Args[] ) { 
        ArrayList<Trabajo> listaTrabajos = new ArrayList<>();
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        ArrayList<Area> listaAreas =new ArrayList<> ();
        //***************************AREAS**********************************
        //<editor-fold defaultstate="collapsed"  desc="AREAS">
        Area area1= new Area("Software");
        Area area2=new Area("Hardware");
        Area area3=new Area("Sistemas Embebidos");
        Area area4=new Area("Redes");
        Area area5=new Area("Redes");
        if(!listaAreas.contains(area1))
            listaAreas.add(area1);
        if(!listaAreas.contains(area2))
            listaAreas.add(area2);
        if(!listaAreas.contains(area3))
            listaAreas.add(area3);
        if(!listaAreas.contains(area4))
            listaAreas.add(area4);
        if(!listaAreas.contains(area5))  // NO la debería agregar
            listaAreas.add(area5);
        //Listas de Áreas para crear Trabajos
        ArrayList<Area> listaA1= new ArrayList<>();
        listaA1.add(listaAreas.get(0)); //Software
        ArrayList<Area> listaA2= new ArrayList<>();
        listaA2.add(listaAreas.get(0));//Software y Hardware
        listaA2.add(listaAreas.get(1));
        ArrayList<Area> listaA3= new ArrayList<>();
        listaA3.add(listaAreas.get(1));//Hardware y Redes
        listaA3.add(listaAreas.get(3));
        ArrayList<Area> listaA4= new ArrayList<>();
        listaA4.add(listaAreas.get(3));//Redes
        
        System.out.println("\n***Lista de Areas *** \n ");
        for (Area a :listaAreas)
            System.out.println(a);
        //</editor-fold>
        //***************************PERSONAS**********************************
        //<editor-fold defaultstate="collapsed"  desc="PROFESOR">        
        Persona prof1= new Profesor("Juarez", "Juan José", 1, Cargo.ASOCIADO);
        Persona prof2= new Profesor("Diaz", "Juan Pablo", 2, Cargo.JTP);
        Persona prof3= new Profesor("Juarez", "Ana María", 3, Cargo.ADJUNTO);
        Persona prof4= new Profesor("San Martin","Jose Manuel", 4, Cargo.ADG); 
        Persona prof5= new Profesor("Ortega", "Laura", 5, Cargo.ASOCIADO);
        Persona prof6= new Profesor("Rodriguez","Juliana", 4, Cargo.TITULAR); 
        
        System.out.println("Agregar Profesores");
        if(!listaPersonas.contains(prof1)){
            listaPersonas.add(prof1);
            System.out.println("Se agregó el prof 1");
        }//lo agrega
        else
            System.out.println("NO se agregó el prof 1");
        
        if(!listaPersonas.contains(prof2)) {
            listaPersonas.add(prof2);
            System.out.println("Se agregó el prof 2");
        }//lo agrega
        else
            System.out.println("NO se agregó el prof 2");
        if(!listaPersonas.contains(prof3)) {
            listaPersonas.add(prof3);
            System.out.println("Se agregó el prof 3");
        }//lo agrega
        else
            System.out.println("NO se agregó el prof 3");
        if(!listaPersonas.contains(prof4)) {
            listaPersonas.add(prof4);
            System.out.println("Se agregó el prof 4");
        } //lo agrega
        else
            System.out.println("NO se agregó el prof 4");
        if(!listaPersonas.contains(prof5)) {
            listaPersonas.add(prof5);
            System.out.println("Se agregó el prof 5");
        }//lo agrega
        else
            System.out.println("NO se agregó el prof 5");
        if(!listaPersonas.contains(prof6)) {
            listaPersonas.add(prof6);
            System.out.println("Se agregó el prof 6");
        }// NO debería poder agregarlo
        else
            System.out.println("NO se agregó el prof 6");
        //</editor-fold>     
        //<editor-fold defaultstate="collapsed"  desc="ALUMNO">  
        Persona al1= new Alumno("Musa", "Ezequiel", 6, "A1");
        Persona al2= new Alumno("Martinez", "Ricardo Juan", 7, "A9");
        Persona al3= new Alumno("Gimenez", "María José", 8, "A2");
        Persona al4= new Alumno("Flores", "Mauricio José", 6, "A3");
        Persona al5= new Alumno("Campos", "Juan Pablo", 9, "A4");
        Persona al6= new Alumno("Campos", "Augusto", 4, "A6");
        Persona al7= new Alumno("Rodriguez", "Miguel Angel", 10, "A5");
        Persona al8= new Alumno("Alvarez", "Ezequiel", 11, "A1");
        Persona al9= new Alumno("Aguero", "Luciana", 12, "A7");
        Persona al10= new Alumno("Campos Figueroa", "Juana", 13, "A1");
        Persona al11= new Alumno("Apud", "Josefina", 14, "A8");
        
        System.out.println("Agregar Alumnos");
        if(!listaPersonas.contains(al1)) {
            listaPersonas.add(al1);
            System.out.println("Se agregó el alumno 1");
        }//lo agrega
        else
            System.out.println("NO se agregó el alumno 1");
        
        if(!listaPersonas.contains(al2)){
            listaPersonas.add(al2);
            System.out.println("Se agregó el alumno 2");
        }//lo agrega
        else
            System.out.println("NO se agregó el alumno 2");
        
        if(!listaPersonas.contains(al3)){
            listaPersonas.add(al3);
            System.out.println("Se agregó el alumno 3");
        }//lo agrega
        else
            System.out.println("NO se agregó el alumno 3");
        
        if(!listaPersonas.contains(al4)) {
            listaPersonas.add(al4);
            System.out.println("Se agregó el alumno 4");
        }//No debería poder agregarlo
        else
            System.out.println("NO se agregó el alumno 4");
        
        if(!listaPersonas.contains(al5)) {
            listaPersonas.add(al5);
            System.out.println("Se agregó el alumno 5");
        }//lo agrega
        else
            System.out.println("NO se agregó el alumno 5");
        
        if(!listaPersonas.contains(al6)) {
            listaPersonas.add(al6);
            System.out.println("Se agregó el alumno 6");
        }//no deberia poder agregarlo
        else
            System.out.println("NO se agregó el alumno 6");
        
        if(!listaPersonas.contains(al7)) {
            listaPersonas.add(al7);
            System.out.println("Se agregó el alumno 7");
        }//lo agrega
        else
            System.out.println("NO se agregó el alumno 7");
        
        if(!listaPersonas.contains(al8)) {
            listaPersonas.add(al8);
            System.out.println("Se agregó el alumno 8");
        }//no lo agrega
        else
            System.out.println("NO se agregó el alumno 8");
        
        if(!listaPersonas.contains(al9)) {
            listaPersonas.add(al9);
            System.out.println("Se agregó el alumno 9");
        }//no lo agrega
        else
            System.out.println("NO se agregó el alumno 9");
        
        if(!listaPersonas.contains(al10)){
            listaPersonas.add(al10);
            System.out.println("Se agregó el alumno 10");
        }//lo agrega
        else
            System.out.println("NO se agregó el alumno 10");
        
        if(!listaPersonas.contains(al11)){
            listaPersonas.add(al11);
            System.out.println("Se agregó el alumno 11");
        }//lo agrega 
        else
            System.out.println("NO se agregó el alumno 11");
        
        System.out.println("\n*** Lista de Personas *** \n ");
        for(Persona p: listaPersonas)
            System.out.println(p);
//        
        System.out.println("\n*** Lista de Profesores *** \n ");
        for(Persona p: listaPersonas)
            if(p instanceof Profesor)
                System.out.println(p);
        
        System.out.println("\n*** Lista de Alumnos *** \n ");
        for(Persona p: listaPersonas)
            if(p instanceof Alumno)
                System.out.println(p);
        System.out.println("\n\n");
        
        //FECHAS para crear los trabajos y otros
        LocalDate fecha1 = LocalDate.of(2017, 10, 2);
        LocalDate fechaVacia = null; 
        LocalDate fecha3 = LocalDate.of(2017, 11, 2);
        LocalDate fecha4= LocalDate.of(2017, 8, 12);
        LocalDate fecha5= LocalDate.of(2017, 9, 12);
        LocalDate fecha6= LocalDate.of(2017, 10, 2);
        //</editor-fold> 
        //***************************TRABAJOS**********************************
        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 1">  
        System.out.println("\n*** Trabajo 1 *** \n ");
        ArrayList<AlumnoEnTrabajo> listaAeT = new ArrayList<>();
        ArrayList<RolEnTrabajo> listaRT = new ArrayList<>();
        //Alumnos en el Trabajo
        AlumnoEnTrabajo aET11 = new AlumnoEnTrabajo(fecha1, (Alumno)listaPersonas.get(7));
        AlumnoEnTrabajo aET12 = new AlumnoEnTrabajo(fecha1, (Alumno)listaPersonas.get(8));
        listaAeT.add(aET11);
        listaAeT.add(aET12);
        //Profesores como Tutores en el Trabajo
        RolEnTrabajo rt11= new RolEnTrabajo(fecha1, (Profesor)listaPersonas.get(0), Rol.TUTOR);
        listaRT.add(rt11);
        RolEnTrabajo rt12= new RolEnTrabajo(fecha1, (Profesor)listaPersonas.get(1), Rol.COTUTOR);
        listaRT.add(rt12);
        //Trabajo trab1 = new Trabajo ("Protocolos de comunicación", listaA1,6, fecha1, listaAeT, listaRT);
        Trabajo trab1= nuevoTrabajo("Protocolos de comunicación", listaA1,6, fecha1,fechaVacia, listaAeT, listaRT);
        if(trab1!= null){
            if(!listaTrabajos.contains(trab1)) {
                listaTrabajos.add(trab1);
                System.out.println("Se agregó el trabajo 1");
            }
            else
                System.out.println("No se agregó el trabajo 1");
        }   
        else
            System.out.println("No se creó el trabajo 1");
        //</editor-fold> 
        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 2">  
        System.out.println("\n*** Trabajo 2 *** \n ");
        //TRABAJO 2 
        ArrayList<AlumnoEnTrabajo> listaAeT2 = new ArrayList<>();
        ArrayList<RolEnTrabajo> listaRT2 = new ArrayList<>();
        //Alumnos en el Trabajo    
        AlumnoEnTrabajo aET21 = new AlumnoEnTrabajo(fecha1, (Alumno)listaPersonas.get(6));
        AlumnoEnTrabajo aET22 = new AlumnoEnTrabajo(fecha1, (Alumno)listaPersonas.get(8));
        listaAeT2.add(aET21);
        listaAeT2.add(aET22);
        //Profesores en el Trabajo
        RolEnTrabajo rt21= new RolEnTrabajo(fecha1, (Profesor)listaPersonas.get(3), Rol.TUTOR);
        listaRT2.add(rt21);
        //Trabajo trab2 = new Trabajo ("Gestión de Trabajos Finales", listaA2,8, fecha1, listaAeT2, listaRT2);
        Trabajo trab2= nuevoTrabajo("Gestión de Trabajos Finales", listaA2,8, fecha1,fechaVacia, listaAeT2, listaRT2);
        if(trab2!= null){
            if(!listaTrabajos.contains(trab2)) {
                listaTrabajos.add(trab2);
                System.out.println("Se agregó el trabajo 2");
            }
            else
                System.out.println("No se agregó el trabajo 2");
        }   
        else
            System.out.println("No se creó el trabajo 2");
        //</editor-fold> 
        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 3">  
       //TRABAJO 3 
        System.out.println("\n*** Trabajo 3 *** \n ");
        ArrayList<AlumnoEnTrabajo> listaAeT3 = new ArrayList<>();
        ArrayList<RolEnTrabajo> listaRT3 = new ArrayList<>();
        //Alumnos en el Trabajo
        AlumnoEnTrabajo aET31 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(10));
        listaAeT3.add(aET31);
        //Profesores en el Trabajo
        RolEnTrabajo rt31= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(0), Rol.TUTOR);
        listaRT3.add(rt31);
        //Trabajo trab3 = new Trabajo ("Este es el titulo del Trabajo", listaA3,4, fecha4, listaAeT3, listaRT3);
        Trabajo trab3= nuevoTrabajo("Este es el titulo del Trabajo", listaA3,4, fecha4,fechaVacia, listaAeT3, listaRT3);;
        if(trab2!= null){
            if(!listaTrabajos.contains(trab3)) {
                listaTrabajos.add(trab3);
                System.out.println("Se agregó el trabajo 3");
            }
            else
                System.out.println("No se agregó el trabajo 3");
        }   
        else
            System.out.println("No se creó el trabajo 3");
//        
        //</editor-fold> 
        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 4">  
        //TRABAJO 4  NO LO AGREGA
        System.out.println("\n*** Trabajo 4 *** \n ");
        ArrayList<AlumnoEnTrabajo> listaAeT4 = new ArrayList<>();
        ArrayList<RolEnTrabajo> listaRT4 = new ArrayList<>();
        //Alumnos en el Trabajo
        AlumnoEnTrabajo aET41 = new AlumnoEnTrabajo(fecha5, (Alumno)listaPersonas.get(9));
        AlumnoEnTrabajo aET42 = new AlumnoEnTrabajo(fecha5,(Alumno)listaPersonas.get(6));
        listaAeT4.add(aET41);
        //Profesores en el Trabajo
        RolEnTrabajo rt41= new RolEnTrabajo(fecha5,(Profesor)listaPersonas.get(4), Rol.TUTOR);
        listaRT4.add(rt41);
        //Trabajo trab4 = new Trabajo ("Este es el titulo del Trabajo", listaA1,5, fecha5, listaAeT4, listaRT4);
         Trabajo trab4= nuevoTrabajo("Este es el titulo del Trabajo", listaA1,5, fecha5,fechaVacia, listaAeT4, listaRT4);;
        if(trab2!= null){
            if(!listaTrabajos.contains(trab4)) {
                listaTrabajos.add(trab4);
                System.out.println("Se agregó el trabajo 4");
            }
            else
                System.out.println("No se agregó el trabajo 4");
        }   
        else
            System.out.println("No se creó el trabajo 4");
        //*****************************TRABAJOS***********************************
       //</editor-fold> 
        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 5">  
        //*************************
        // TRABAJO 5 NO SE AGREGA PORQUE TIENE IGUAL TITULO
        System.out.println("\n*** Trabajo 5 *** \n ");
        ArrayList<AlumnoEnTrabajo> listaAl5 = new ArrayList<>();
        ArrayList<RolEnTrabajo> listaR5 = new ArrayList<>();
        //Alumnos en el Trabajo    
        AlumnoEnTrabajo a51 = new AlumnoEnTrabajo(fecha1, (Alumno)listaPersonas.get(6));
        AlumnoEnTrabajo a52 = new AlumnoEnTrabajo(fecha1, (Alumno)listaPersonas.get(8));
        listaAl5.add(a51);
        listaAl5.add(a52);
        //Profesores en el Trabajo
        RolEnTrabajo rt51= new RolEnTrabajo(fecha1, (Profesor)listaPersonas.get(3), Rol.TUTOR);
        listaR5.add(rt51);
        LocalDate fechaAp= null;
        //Trabajo trab2 = new Trabajo ("Gestión de Trabajos Finales", listaA2,8, fecha1, listaAeT2, listaRT2);
        Trabajo t5= nuevoTrabajo("Gestión de Trabajos Finales", listaA2,8, fecha1, fechaAp, listaAl5, listaR5);
        if (t5!=null){
            if(!listaTrabajos.contains(t5)) {
                listaTrabajos.add(t5);
                System.out.println("Se agregó el trabajo 5");
            }
            else
                System.out.println("No se agregó el trabajo 5");
        }
        //</editor-fold> 
        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 6">  
        System.out.println("\n*** Trabajo 6 *** \n ");
        // TRABAJO 6 NO SE AGREGA PORQUE NO SE PUEDE CREAR, TITULO VACIO
        ArrayList<AlumnoEnTrabajo> listaAl6 = new ArrayList<>();
        ArrayList<RolEnTrabajo> listaR6 = new ArrayList<>();
        //Alumnos en el Trabajo    
        AlumnoEnTrabajo a61 = new AlumnoEnTrabajo(fecha1, (Alumno)listaPersonas.get(6));
        AlumnoEnTrabajo a62 = new AlumnoEnTrabajo(fecha1, (Alumno)listaPersonas.get(8));
        AlumnoEnTrabajo a63 = new AlumnoEnTrabajo(fecha1, (Alumno)listaPersonas.get(9));
        
        listaAl6.add(a61);
        listaAl6.add(a62);
        listaAl6.add(a63);
        //Profesores en el Trabajo
        RolEnTrabajo rt61= new RolEnTrabajo(fecha1, (Profesor)listaPersonas.get(3), Rol.TUTOR);
        listaR6.add(rt61);
        LocalDate fechaAp6= null;
        //Trabajo trab2 = new Trabajo ("Gestión de Trabajos Finales", listaA2,8, fecha1, listaAeT2, listaRT2);
        Trabajo t6= nuevoTrabajo("", listaA2,5, fecha1, fechaAp6, listaAl6, listaR6);
        if (t6!=null){
            if(!listaTrabajos.contains(t6)) {
                listaTrabajos.add(t6);
                System.out.println("Se agregó el trabajo 6");
            }
            else
                System.out.println("No se agregó el trabajo 6");
        }
        //</editor-fold> 
        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 7">  
        System.out.println("\n*** Trabajo 7 *** \n ");
        // TRABAJO 7, duracion negativa
        ArrayList<AlumnoEnTrabajo> listaAl7 = new ArrayList<>();
        ArrayList<RolEnTrabajo> listaR7 = new ArrayList<>();
        //Alumnos en el Trabajo    
        AlumnoEnTrabajo a71 = new AlumnoEnTrabajo(fecha1, (Alumno)listaPersonas.get(5));
        
        listaAl7.add(a71);
        //Profesores en el Trabajo
        RolEnTrabajo rt71= new RolEnTrabajo(fecha1, (Profesor)listaPersonas.get(3), Rol.TUTOR);
        listaR7.add(rt71);
        
        Trabajo t7= nuevoTrabajo("Segurida en Redes", listaA4,-5, fecha3, fechaAp6, listaAl7, listaR7);
        if (t7!=null){
            if(!listaTrabajos.contains(t7)) {
                listaTrabajos.add(t7);
                System.out.println("Se agregó el trabajo 7");
            }
            else
                System.out.println("No se agregó el trabajo 7");
        }
        //</editor-fold> 
        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 8">  
        System.out.println("\n*** Trabajo 8 *** \n ");
        // TRABAJO 8
        ArrayList<AlumnoEnTrabajo> listaAl8 = new ArrayList<>();
        ArrayList<RolEnTrabajo> listaR8 = new ArrayList<>();
        //Alumnos en el Trabajo    
        AlumnoEnTrabajo a81 = new AlumnoEnTrabajo(fecha1, (Alumno)listaPersonas.get(5));
        
        listaAl8.add(a81);
        //Profesores en el Trabajo
        RolEnTrabajo rt81= new RolEnTrabajo(fecha1, (Profesor)listaPersonas.get(3), Rol.TUTOR);
        listaR8.add(rt81);
        
        Trabajo t8= nuevoTrabajo("Seguridad en Redes", listaA3,7, fecha3, fecha1, listaAl8, listaR8);
        if (t8!=null){
            if(!listaTrabajos.contains(t8)) {
                listaTrabajos.add(t8);
                System.out.println("Se agregó el trabajo 8");
            }
            else
                System.out.println("No se agregó el trabajo 8");
        }
        //</editor-fold> 
        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 9">  
        System.out.println("\n*** Trabajo 9 *** \n ");
        // TRABAJO 9 
        ArrayList<AlumnoEnTrabajo> listaAl9 = new ArrayList<>();
        ArrayList<RolEnTrabajo> listaR9 = new ArrayList<>();
        //Alumnos en el Trabajo    
        AlumnoEnTrabajo a91 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(5));
        AlumnoEnTrabajo a92 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(8));
        
        listaAl9.add(a91);
        //Profesores en el Trabajo
        RolEnTrabajo rt91= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(3), Rol.TUTOR);
        RolEnTrabajo rt92= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(4), Rol.COTUTOR);
        listaR9.add(rt91);
        listaR9.add(rt92);
        
        Trabajo t9= nuevoTrabajo("Sistema de Gestión", listaA1,7, fecha4, fecha1, listaAl9, listaR9);
        if (t9!=null){
            if(!listaTrabajos.contains(t9)) {
                listaTrabajos.add(t9);
                System.out.println("Se agregó el trabajo 9");
            }
            else
                System.out.println("No se agregó el trabajo 9");
        }
    //</editor-fold> 
        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 10">  
        System.out.println("\n*** Trabajo 10 *** \n ");
        // TRABAJO 10
        ArrayList<AlumnoEnTrabajo> listaAl10 = new ArrayList<>();
        ArrayList<RolEnTrabajo> listaR10 = new ArrayList<>();
        //Alumnos en el Trabajo    
        AlumnoEnTrabajo a101 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(10));
        AlumnoEnTrabajo a102 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(9));
        listaAl10.add(a101);
        listaAl10.add(a102);
        //Profesores en el Trabajo
        RolEnTrabajo rt101= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(3), Rol.TUTOR);
        RolEnTrabajo rt102= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(4), Rol.COTUTOR);
        listaR10.add(rt101);
        listaR10.add(rt102);
        
        Trabajo t10= nuevoTrabajo("Sistema de Gestión 2", listaA1,4, fecha4, fecha1, listaAl10, listaR10);
        if (t10!=null){
            if(!listaTrabajos.contains(t10)) {
                listaTrabajos.add(t10);
                System.out.println("Se agregó el trabajo 10");
            }
            else
                System.out.println("No se agregó el trabajo 10");
        }
    //</editor-fold> 
        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 11">  
        System.out.println("\n*** Trabajo 11 *** \n ");
        // TRABAJO 10
        ArrayList<AlumnoEnTrabajo> listaAl11 = new ArrayList<>();
        ArrayList<RolEnTrabajo> listaR11 = new ArrayList<>();
        //Alumnos en el Trabajo    
        AlumnoEnTrabajo a111 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(10));
        AlumnoEnTrabajo a112 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(10));
        listaAl11.add(a111);
        listaAl11.add(a112);
        //Profesores en el Trabajo
        RolEnTrabajo rt111= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(3), Rol.TUTOR);
        RolEnTrabajo rt112= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(4), Rol.COTUTOR);
        RolEnTrabajo rt113= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(0), Rol.JURADO);
        RolEnTrabajo rt114= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(1), Rol.JURADO);
        RolEnTrabajo rt115= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(2), Rol.JURADO);
        listaR11.add(rt111);
        listaR11.add(rt112);
        listaR11.add(rt113);
        listaR11.add(rt114);
        listaR11.add(rt115);
        
        Trabajo t11= nuevoTrabajo("Sistema de Gestión 2", listaA1,4, fecha4, fecha1, listaAl11, listaR11);
        if (t11!=null){
            if(!listaTrabajos.contains(t11)) {
                listaTrabajos.add(t11);
                System.out.println("Se agregó el trabajo 11");
            }
            else
                System.out.println("No se agregó el trabajo 11");
        }
    //</editor-fold> 
        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 12">  
        System.out.println("\n*** Trabajo 12 *** \n ");
        // TRABAJO 12
        ArrayList<AlumnoEnTrabajo> listaAl12 = new ArrayList<>();
        ArrayList<RolEnTrabajo> listaR12 = new ArrayList<>();
        //Alumnos en el Trabajo    
        AlumnoEnTrabajo a121 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(10));
        AlumnoEnTrabajo a122 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(7));
        listaAl12.add(a121);
        listaAl12.add(a122);
        //Profesores en el Trabajo
        RolEnTrabajo rt121= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(3), Rol.TUTOR);
        RolEnTrabajo rt123= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(0), Rol.JURADO);
        RolEnTrabajo rt124= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(1), Rol.JURADO);
        RolEnTrabajo rt125= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(2), Rol.JURADO);
        listaR12.add(rt121);
        listaR12.add(rt123);
        listaR12.add(rt124);
        listaR12.add(rt125);
        
        Trabajo t12= nuevoTrabajo("Sistema de Gestión Nuevo", listaA1,4, fecha4, fecha1, listaAl12, listaR12);
        if (t12!=null){
            if(!listaTrabajos.contains(t12)) {
                listaTrabajos.add(t12);
                System.out.println("Se agregó el trabajo 12");
            }
            else
                System.out.println("No se agregó el trabajo 12");
        }
    //</editor-fold> 
        System.out.println("\n*** LISTA DE TRABAJOS *** \n ");
        for (Trabajo t : listaTrabajos)
            t.mostrar();
        
        
    } 
    public static Trabajo nuevoTrabajo(String titulo, ArrayList<Area> areas,int duracion,
            LocalDate fechaPresentacion,LocalDate fechaAprobacion ,
            ArrayList<AlumnoEnTrabajo> listaAlumnoEnT, ArrayList<RolEnTrabajo> listaRolEnT){
        
        Trabajo t=null;
        String mensaje="";
        boolean tieneTituloYDuracion;
        boolean tieneAreas;
        boolean tieneFechasValidas;
        boolean tieneAlumnosValidos, tieneTutoresValidos, tieneJuradosValidos;
        //controlo los datos principales
        tieneTituloYDuracion=controlarTituloYDuracion(titulo, duracion);
        tieneAreas=controlarAreas(areas);
        tieneFechasValidas= controlarFechas(fechaPresentacion, fechaAprobacion);
        //control de alumnos
        tieneAlumnosValidos= controlarAlumnos(listaAlumnoEnT);
        //control tutores
        tieneTutoresValidos= controlarTutores(listaRolEnT);
        //control jurados
        tieneJuradosValidos= controlarJurados(listaRolEnT);
        
        boolean datosValidos = tieneTituloYDuracion && tieneAreas && tieneFechasValidas;
        datosValidos = datosValidos && tieneAlumnosValidos && tieneTutoresValidos && tieneJuradosValidos;
        
        if(datosValidos){
            if(fechaAprobacion ==null ) {
                t=new Trabajo(titulo, areas, duracion,fechaPresentacion, listaAlumnoEnT , listaRolEnT);
                System.out.println("Se creo el trabajo (constructor 1)");
                }
            else {
                t=new Trabajo(titulo, areas, duracion,fechaPresentacion, fechaAprobacion, listaAlumnoEnT , listaRolEnT);
                System.out.println("Se creo el trabajo (constructor 2)");
            }
        }
        else
            mensaje = "No se creo el trabajo: " + mensaje;
    System.out.println(mensaje);
    return t;
    }
    
    private static boolean controlarTituloYDuracion(String titulo, int duracion){
        if(titulo.isEmpty() || titulo== null || duracion <=0 )
            return false;
        return true;
    }
    private static boolean controlarAreas(ArrayList<Area> areas){
        if(areas.isEmpty()|| areas ==null)
            return false;
        return true;
    }
    private static boolean controlarFechas(LocalDate fechaPresentacion, LocalDate fechaAprobacion){
        if(fechaPresentacion ==null)
            return false;
        else
            if(fechaAprobacion==null) //fechaPresentacion no es vacia
                return true;
            else 
                return (fechaAprobacion.isAfter(fechaPresentacion)|| fechaAprobacion.equals(fechaPresentacion));
    }
    private static boolean controlarAlumnos (ArrayList<AlumnoEnTrabajo> listaA){
        if(!listaA.isEmpty()&& listaA != null){
            for(int i = 0; i < listaA.size() - 1; i++) { 
                    Alumno a1 = listaA.get(i).getUnAlumno();
                    for(int j = i + 1; j < listaA.size(); j++) {
                        Alumno a2 = listaA.get(j).getUnAlumno();
                            if (a1.equals(a2))
                                return false;
                    }
            }
        }
        return true;
    }
    private static boolean controlarTutores (ArrayList<RolEnTrabajo> listaR){
        int cantTutor=0, cantCotutor=0;
        Profesor t=null, c=null;
        //que la lista tenga datos
        if(listaR.isEmpty()|| listaR == null)
            return false;
        else
        {
            for(RolEnTrabajo rt : listaR){
                if(rt.getUnRol()== Rol.TUTOR){
                    cantTutor++;
                    t= rt.getUnProfesor();
                }
                if(rt.getUnRol()== Rol.COTUTOR){
                    cantTutor++;
                    c=rt.getUnProfesor();
                }
                
            }
            //que haya las cantidades que requiere
            if(cantTutor ==0 || cantTutor >1)
                return false;
            if(cantCotutor>1)
                return false;
            //que no sean iguales
            if(cantCotutor==1 && c.equals(t))
                return false;                    
        }
        return true;
    }
    private static boolean controlarJurados (ArrayList<RolEnTrabajo> listaR){
        Profesor tutor=null, coTutor=null;
        Profesor p1=null, p2=null, p3=null;
        ArrayList<Profesor> listaJurado = new ArrayList<>();
        //que la lista tenga datos
        if(listaR.isEmpty()|| listaR == null) // la lista es vacia
            return false;
        else
        {
            for(RolEnTrabajo rt : listaR){
                if(rt.getUnRol()== Rol.JURADO){
                    listaJurado.add(rt.getUnProfesor());
                }
            }    
            if(listaJurado.size()==3)
            {
                //tomo tutor cotutor y externo
                for(RolEnTrabajo rt : listaR){
                    if(rt.getUnRol()== Rol.TUTOR)
                        tutor= rt.getUnProfesor();
                    if(rt.getUnRol()== Rol.COTUTOR)
                        coTutor=rt.getUnProfesor();
                }

                //que no sean iguales con los tutores y cotutores
                if(listaJurado.contains(tutor))
                    return false;
                if(coTutor !=null)
                    if(listaJurado.contains(coTutor) )
                        return false;
                
                //que no sean iguales entre si
                p1 = listaJurado.get(0);
                p2 = listaJurado.get(1);
                p3 = listaJurado.get(2);
                if (p1.equals(p2) && p1.equals(p3) && p2.equals(p3))
                    return false;
            }
        }
        
        return true;
    }
}
