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
 * @author prog2
 */
public class Principal {
    public static void main (String Args[] ) { 

        GestorAreas gsAreas = GestorAreas.instanciar();
        GestorPersonas gsPersonas = GestorPersonas.instanciar();
        GestorAlumnoEnTrabajo gsAET = GestorAlumnoEnTrabajo.instanciar();
        GestorRolEnTrabajo gsRET= GestorRolEnTrabajo.instanciar();
        GestorTrabajos gsTrabajos = GestorTrabajos.instanciar();
        
        ArrayList<Area> buscarArea = new ArrayList<>();
        //***************************AREAS**********************************
        //<editor-fold defaultstate="collapsed"  desc="AREAS">
        System.out.println(gsAreas.nuevaArea("Software"));
        System.out.println(gsAreas.nuevaArea("Hardware"));
        System.out.println(gsAreas.nuevaArea("Sistemas Embebidos"));
        System.out.println(gsAreas.nuevaArea("Redes"));
        System.out.println(gsAreas.nuevaArea("Redes"));
        System.out.println(gsAreas.nuevaArea("Sistemas Operativos"));
        System.out.println(gsAreas.nuevaArea(""));
        
        System.out.println("\n***Lista de Areas *** ");
        gsAreas.mostrarAreas();
        
        //BUSCAR AREAS
        System.out.println("\n***Buscar Areas con null (debe traer todas)*** ");
        buscarArea= gsAreas.buscarAreas(null);
        if(buscarArea == null)
            System.out.println("No encontró nada ");
        else
            for(Area a : buscarArea)
                System.out.println(a);
        
//        System.out.println("\n***Nombre*** ");
//        String nombre= "";
//        System.out.println(nombre!=null);
//        System.out.println(nombre.isEmpty());
        
        System.out.println("\n***Buscar Areas con vacio (trae todas, es OK?*** ");
        buscarArea= gsAreas.buscarAreas("");
        if(buscarArea == null)
            System.out.println("No encontró nada ");
        else
            for(Area a : buscarArea)
                System.out.println(a);
        
        System.out.println("\n***Buscar Areas *** ");
        buscarArea= gsAreas.buscarAreas("Sistema");
        if(buscarArea == null)
            System.out.println("No encontró nada ");
        else
            for(Area a : buscarArea)
                System.out.println(a);
        
        System.out.println("\n***Dame Area *** ");
        Area unArea = gsAreas.dameArea("");
        System.out.println("DameArea " + unArea);
        Area unArea2 = gsAreas.dameArea(null);
        System.out.println("DameArea " + unArea2);
        Area unArea3 = gsAreas.dameArea("Sistemas");
        System.out.println("DameArea " + unArea3);
        Area unArea4 = gsAreas.dameArea("Sistemas Operativos");
        System.out.println("DameArea " + unArea4);
        
        Area buscada = gsAreas.dameArea("artificial");
        System.out.println("Busco area con artificial " + buscada); // no está
        buscada = gsAreas.dameArea("soft");
        System.out.println("Busco area con soft " + buscada); // no está
        buscada = gsAreas.dameArea("software");
        System.out.println("Busco area con soft " + buscada);  // esta

//        Area a1= new Area("prueba");
//        System.out.println(a1.getNombre().equalsIgnoreCase("prueba"));
//        System.out.println(a1.getNombre().equalsIgnoreCase(""));
//        System.out.println(a1.getNombre().equalsIgnoreCase(null));
//        System.out.println(a1.getNombre().equalsIgnoreCase("pru"));
//        Area a2= new Area("");
//        System.out.println(a2.getNombre().isEmpty());
//       
//      //Listas de Áreas para crear Trabajos
        ArrayList<Area> listaA1= new ArrayList<>();
        listaA1.add(gsAreas.dameArea("Software")); //Software
        ArrayList<Area> listaA2= new ArrayList<>();
        
        //</editor-fold>
//      //***************************PERSONAS**********************************
        //      //<editor-fold defaultstate="collapsed"  desc="PROFESOR">        
        System.out.println("\n");
        System.out.println(gsPersonas.nuevoProfesor("Juarez", "Juan José", 1, Cargo.ASOCIADO));
        System.out.println(gsPersonas.nuevoProfesor("Diaz", "Juan Pablo", 2, Cargo.JTP));
        System.out.println(gsPersonas.nuevoProfesor("Juarez", "Ana María", 3, Cargo.ADJUNTO));
        System.out.println(gsPersonas.nuevoProfesor("San Martin","Jose Manuel", 4, Cargo.ADG)); 
        System.out.println(gsPersonas.nuevoProfesor("Ortega", "Laura", 5, Cargo.ASOCIADO));
        System.out.println(gsPersonas.nuevoProfesor("Rodriguez","Juliana", 4, Cargo.TITULAR)); 
        System.out.println(gsPersonas.nuevoProfesor("Andrada","Juliana", 6, Cargo.TITULAR)); 
        System.out.println(gsPersonas.nuevoProfesor("Andrada","Augusto", 7, Cargo.JTP)); 
        //Deberían fallar estos 
        System.out.println(gsPersonas.nuevoProfesor("","Augusto", 7, Cargo.JTP)); 
        System.out.println(gsPersonas.nuevoProfesor("Alvarez","", 7, Cargo.JTP)); 
        System.out.println(gsPersonas.nuevoProfesor("Alvarez","Augusto", -1, Cargo.JTP)); 
        System.out.println(gsPersonas.nuevoProfesor("Alvarez","Augusto", 8, null)); 
        
        System.out.println("\n");
        //</editor-fold>     
        //<editor-fold defaultstate="collapsed"  desc="ALUMNO">  
        System.out.println(gsPersonas.nuevoAlumno("Musa", "Ezequiel", 15, "A1"));
        System.out.println(gsPersonas.nuevoAlumno("Martinez", "Ricardo Juan", 16, "A9"));
        System.out.println(gsPersonas.nuevoAlumno("Gimenez", "María José", 17, "A2"));
        System.out.println(gsPersonas.nuevoAlumno("Flores", "Mauricio José", 15, "A3"));//mismo dni que un alumno
        System.out.println(gsPersonas.nuevoAlumno("Campos", "Juan Pablo", 9, "A4"));
        System.out.println(gsPersonas.nuevoAlumno("Campos", "Augusto", 4, "A6")); //mismo dni que un profesor
        System.out.println(gsPersonas.nuevoAlumno("Campos", "Miguel Angel", 10, "A5"));
        System.out.println(gsPersonas.nuevoAlumno("Alvarez", "Ezequiel", 11, "A1"));//mismo cx que un alumno
        System.out.println(gsPersonas.nuevoAlumno("Aguero", "Luciana", 12, "A7"));
        System.out.println(gsPersonas.nuevoAlumno("", "Juana", 13, "A1"));
        System.out.println(gsPersonas.nuevoAlumno("Apud", "", 14, "A8"));
        System.out.println(gsPersonas.nuevoAlumno("Apud", "Pedro", -5, ""));
//        
        System.out.println("\n*** Lista de Personas *** \n ");
        gsPersonas.mostrarPersonas();      
        System.out.println("\n*** Lista de Profesores *** \n ");
        gsPersonas.mostrarProfesores();
        System.out.println("\n*** Lista de Alumnos *** \n ");
        gsPersonas.mostrarAlumnos();
        System.out.println("\n\n");
        
        Profesor pBuscado = gsPersonas.dameProfesor(1);
        System.out.println("Buscar Prof "+ pBuscado);
        
        pBuscado = gsPersonas.dameProfesor(15);
        System.out.println("Buscar Prof "+ pBuscado); // es un alumno
        
        pBuscado = gsPersonas.dameProfesor(75);
        System.out.println("Buscar Prof "+ pBuscado);// no existe
        //</editor-fold> 
//        //***************************fechas**********************************
//        //FECHAS para crear los trabajos y otros
//        LocalDate fecha1 = LocalDate.of(2017, 10, 2);
//        LocalDate fechaVacia = null; 
//        LocalDate fecha3 = LocalDate.of(2017, 11, 2);
//        LocalDate fecha4= LocalDate.of(2017, 8, 12);
//        LocalDate fecha5= LocalDate.of(2017, 9, 12);
//        LocalDate fecha6= LocalDate.of(2017, 10, 2);
//        
//        //***************************TRABAJOS**********************************
//        
//
//        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 1">  
//        //TRABAJO 1 LO AGREGA
//        System.out.println("\n*** Trabajo 1 - debería agregarlo*** \n ");
//        ArrayList<AlumnoEnTrabajo> listaAeT = new ArrayList<>();
//        ArrayList<RolEnTrabajo> listaRT = new ArrayList<>();
//        //Alumnos en el Trabajo
//        AlumnoEnTrabajo aET11 = gsAET.nuevoAlumnoEnTrabajo(null, (Alumno)gsPersonas.dameAlumno("A2"));
//        if (aET11==null) System.out.println("\nNo se creo el AET");
//        else System.out.println("\nSe creo el AET");
//        
//        aET11 = gsAET.nuevoAlumnoEnTrabajo(fecha1, gsPersonas.dameAlumno("A25"));
//        if (aET11==null) System.out.println("\nNo se creo el AET");
//        else System.out.println("\nSe creo el AET");
//        
//        aET11 = gsAET.nuevoAlumnoEnTrabajo(fecha1, gsPersonas.dameAlumno("A2"));
//        if (aET11==null) System.out.println("\nNo se creo el AET");
//        else System.out.println("\nSe creo el AET");
//        
//        AlumnoEnTrabajo aET12 = gsAET.nuevoAlumnoEnTrabajo(fecha1, gsPersonas.dameAlumno("A4"));
//        listaAeT.add(aET11);
//        listaAeT.add(aET12);
//        
//        //Profesores como Tutores en el Trabajo
//        RolEnTrabajo rt11= gsRET.nuevoRolEnTrabajo(gsPersonas.dameProfesor(1), Rol.TUTOR, fecha1);
//        RolEnTrabajo rt12= gsRET.nuevoRolEnTrabajo(gsPersonas.dameProfesor(2), Rol.COTUTOR, fecha1);
//        listaRT.add(rt11);
//        listaRT.add(rt12);
//        System.out.println(gsTrabajos.nuevoTrabajo("Protocolos de comunicación",6, fecha1, fechaVacia, listaA1, listaRT, listaAeT));
//        //gsTrabajos.dameTrabajo("Protocolos de comunicación").mostrar();
//        //</editor-fold> 
//        /*
//        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 2">  
//        System.out.println("\n*** Trabajo 2  - Lo Agrega*** \n ");
//        //TRABAJO 2 - agrega
//        ArrayList<AlumnoEnTrabajo> listaAeT2 = new ArrayList<>();
//        ArrayList<RolEnTrabajo> listaRT2 = new ArrayList<>();
//        //Alumnos en el Trabajo    
//        AlumnoEnTrabajo aET21 = new AlumnoEnTrabajo(fecha1, (Alumno)listaPersonas.get(6));
//        AlumnoEnTrabajo aET22 = new AlumnoEnTrabajo(fecha1, (Alumno)listaPersonas.get(8));
//        listaAeT2.add(aET21);
//        listaAeT2.add(aET22);
//        //Profesores en el Trabajo
//        RolEnTrabajo rt21= new RolEnTrabajo(fecha1, (Profesor)listaPersonas.get(3), Rol.TUTOR);
//        listaRT2.add(rt21);
//        //Trabajo trab2 = new Trabajo ("Gestión de Trabajos Finales", listaA2,8, fecha1, listaAeT2, listaRT2);
//        Trabajo trab2= nuevoTrabajo("Gestión de Trabajos Finales", listaA2,8, fecha1,fechaVacia, listaAeT2, listaRT2);
//        if(trab2!= null){
//            if(!listaTrabajos.contains(trab2)) {
//                listaTrabajos.add(trab2);
//                System.out.println("Se agregó el trabajo 2");
//            }
//            else
//                System.out.println("No se agregó el trabajo 2");
//        }   
//        else
//            System.out.println("No se creó el trabajo 2");
//        //</editor-fold> 
//*/
//        /*        
////<editor-fold defaultstate="collapsed"  desc="TRABAJO 3">  
//       //TRABAJO 3 
//       //TRABAJO 3 LO AGREGA
//        System.out.println("\n*** Trabajo 3 - Lo agrega*** \n ");
//        ArrayList<AlumnoEnTrabajo> listaAeT3 = new ArrayList<>();
//        ArrayList<RolEnTrabajo> listaRT3 = new ArrayList<>();
//        //Alumnos en el Trabajo
//        AlumnoEnTrabajo aET31 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(10));
//        listaAeT3.add(aET31);
//        //Profesores en el Trabajo
//        RolEnTrabajo rt31= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(0), Rol.TUTOR);
//        listaRT3.add(rt31);
//        //Trabajo trab3 = new Trabajo ("Este es el titulo del Trabajo", listaA3,4, fecha4, listaAeT3, listaRT3);
//        Trabajo trab3= nuevoTrabajo("Este es el titulo del Trabajo", listaA3,4, fecha4,fechaVacia, listaAeT3, listaRT3);;
//        if(trab2!= null){
//            if(!listaTrabajos.contains(trab3)) {
//                listaTrabajos.add(trab3);
//                System.out.println("Se agregó el trabajo 3");
//            }
//            else
//                System.out.println("No se agregó el trabajo 3");
//        }   
//        else
//            System.out.println("No se creó el trabajo 3");
////        
//        //</editor-fold> 
//        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 4">  
//        //TRABAJO 4  NO LO AGREGA, trabajo repetido
//        System.out.println("\n*** Trabajo 4 - No debería agregar, trabajo repetido*** \n ");
//        ArrayList<AlumnoEnTrabajo> listaAeT4 = new ArrayList<>();
//        ArrayList<RolEnTrabajo> listaRT4 = new ArrayList<>();
//        //Alumnos en el Trabajo
//        AlumnoEnTrabajo aET41 = new AlumnoEnTrabajo(fecha5, (Alumno)listaPersonas.get(9));
//        AlumnoEnTrabajo aET42 = new AlumnoEnTrabajo(fecha5,(Alumno)listaPersonas.get(6));
//        listaAeT4.add(aET41);
//        //Profesores en el Trabajo
//        RolEnTrabajo rt41= new RolEnTrabajo(fecha5,(Profesor)listaPersonas.get(4), Rol.TUTOR);
//        listaRT4.add(rt41);
//        //Trabajo trab4 = new Trabajo ("Este es el titulo del Trabajo", listaA1,5, fecha5, listaAeT4, listaRT4);
//         Trabajo trab4= nuevoTrabajo("Este es el titulo del Trabajo", listaA1,5, fecha5,fechaVacia, listaAeT4, listaRT4);;
//        if(trab2!= null){
//            if(!listaTrabajos.contains(trab4)) {
//                listaTrabajos.add(trab4);
//                System.out.println("Se agregó el trabajo 4");
//            }
//            else
//                System.out.println("No se agregó el trabajo 4");
//        }   
//        else
//            System.out.println("No se creó el trabajo 4");
//        //*****************************TRABAJOS***********************************
//       //</editor-fold> 
//        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 5">  
//        //*************************
//        // TRABAJO 5 NO SE AGREGA PORQUE TIENE IGUAL TITULO
//        System.out.println("\n*** Trabajo 5 - No debería agregar, trabajo repetido *** \n ");
//        ArrayList<AlumnoEnTrabajo> listaAl5 = new ArrayList<>();
//        ArrayList<RolEnTrabajo> listaR5 = new ArrayList<>();
//        //Alumnos en el Trabajo    
//        AlumnoEnTrabajo a51 = new AlumnoEnTrabajo(fecha1, (Alumno)listaPersonas.get(6));
//        AlumnoEnTrabajo a52 = new AlumnoEnTrabajo(fecha1, (Alumno)listaPersonas.get(8));
//        listaAl5.add(a51);
//        listaAl5.add(a52);
//        //Profesores en el Trabajo
//        RolEnTrabajo rt51= new RolEnTrabajo(fecha1, (Profesor)listaPersonas.get(3), Rol.TUTOR);
//        listaR5.add(rt51);
//        LocalDate fechaAp= null;
//        //Trabajo trab2 = new Trabajo ("Gestión de Trabajos Finales", listaA2,8, fecha1, listaAeT2, listaRT2);
//        Trabajo t5= nuevoTrabajo("Gestión de Trabajos Finales", listaA2,8, fecha1, fechaAp, listaAl5, listaR5);
//        if (t5!=null){
//            if(!listaTrabajos.contains(t5)) {
//                listaTrabajos.add(t5);
//                System.out.println("Se agregó el trabajo 5");
//            }
//            else
//                System.out.println("No se agregó el trabajo 5");
//        }
//        else 
//             System.out.println("No se creó el trabajo 5");
//        //</editor-fold> 
//        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 6">  
//        System.out.println("\n*** Trabajo 6 - No debería agregar. título vacío *** \n ");
//        // TRABAJO 6 NO SE AGREGA PORQUE NO SE PUEDE CREAR, TITULO VACIO
//        ArrayList<AlumnoEnTrabajo> listaAl6 = new ArrayList<>();
//        ArrayList<RolEnTrabajo> listaR6 = new ArrayList<>();
//        //Alumnos en el Trabajo    
//        AlumnoEnTrabajo a61 = new AlumnoEnTrabajo(fecha1, (Alumno)listaPersonas.get(6));
//        AlumnoEnTrabajo a62 = new AlumnoEnTrabajo(fecha1, (Alumno)listaPersonas.get(8));
//        AlumnoEnTrabajo a63 = new AlumnoEnTrabajo(fecha1, (Alumno)listaPersonas.get(9));
//        
//        listaAl6.add(a61);
//        listaAl6.add(a62);
//        listaAl6.add(a63);
//        //Profesores en el Trabajo
//        RolEnTrabajo rt61= new RolEnTrabajo(fecha1, (Profesor)listaPersonas.get(3), Rol.TUTOR);
//        listaR6.add(rt61);
//        LocalDate fechaAp6= null;
//        //Trabajo trab2 = new Trabajo ("Gestión de Trabajos Finales", listaA2,8, fecha1, listaAeT2, listaRT2);
//        Trabajo t6= nuevoTrabajo("", listaA2,5, fecha1, fechaAp6, listaAl6, listaR6);
//        if (t6!=null){
//            if(!listaTrabajos.contains(t6)) {
//                listaTrabajos.add(t6);
//                System.out.println("Se agregó el trabajo 6");
//            }
//            else
//                System.out.println("No se agregó el trabajo 6");
//        }
//        else 
//             System.out.println("No se creó el trabajo 6");
//        //</editor-fold> 
//        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 7">  
//        System.out.println("\n*** Trabajo 7- No debería agregar, duracion <0  *** \n ");
//        // TRABAJO 7, duracion negativa
//        ArrayList<AlumnoEnTrabajo> listaAl7 = new ArrayList<>();
//        ArrayList<RolEnTrabajo> listaR7 = new ArrayList<>();
//        //Alumnos en el Trabajo    
//        AlumnoEnTrabajo a71 = new AlumnoEnTrabajo(fecha1, (Alumno)listaPersonas.get(5));
//        
//        listaAl7.add(a71);
//        //Profesores en el Trabajo
//        RolEnTrabajo rt71= new RolEnTrabajo(fecha1, (Profesor)listaPersonas.get(3), Rol.TUTOR);
//        listaR7.add(rt71);
//        
//        Trabajo t7= nuevoTrabajo("Segurida en Redes", listaA4,-5, fecha3, fechaAp6, listaAl7, listaR7);
//        if (t7!=null){
//            if(!listaTrabajos.contains(t7)) {
//                listaTrabajos.add(t7);
//                System.out.println("Se agregó el trabajo 7");
//            }
//            else
//                System.out.println("No se agregó el trabajo 7");
//        }
//        else 
//             System.out.println("No se creó el trabajo 7");
//        //</editor-fold> 
//        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 8">  
//        System.out.println("\n*** Trabajo 8  - No deberia agregar fechaPres > fechaAp*** \n ");
//        // TRABAJO 8
//        //TRABAJO 8 NO  LO AGREGA fecha3> fecha1
//        ArrayList<AlumnoEnTrabajo> listaAl8 = new ArrayList<>();
//        ArrayList<RolEnTrabajo> listaR8 = new ArrayList<>();
//        //Alumnos en el Trabajo    
//        AlumnoEnTrabajo a81 = new AlumnoEnTrabajo(fecha1, (Alumno)listaPersonas.get(5));
//        
//        listaAl8.add(a81);
//        //Profesores en el Trabajo
//        RolEnTrabajo rt81= new RolEnTrabajo(fecha1, (Profesor)listaPersonas.get(3), Rol.TUTOR);
//        listaR8.add(rt81);
//        
//        Trabajo t8= nuevoTrabajo("Seguridad en Redes", listaA3,7, fecha3, fecha1, listaAl8, listaR8);
//        if (t8!=null){
//            if(!listaTrabajos.contains(t8)) {
//                listaTrabajos.add(t8);
//                System.out.println("Se agregó el trabajo 8");
//            }
//            else
//                System.out.println("No se agregó el trabajo 8");
//        }
//        else 
//             System.out.println("No se creó el trabajo 8");
//        //</editor-fold> 
//        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 9">  
//        System.out.println("\n*** Trabajo 9 - Debería Agregar *** \n ");
//        // TRABAJO 9 Se agrega
//        ArrayList<AlumnoEnTrabajo> listaAl9 = new ArrayList<>();
//        ArrayList<RolEnTrabajo> listaR9 = new ArrayList<>();
//        //Alumnos en el Trabajo    
//        AlumnoEnTrabajo a91 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(5));
//        AlumnoEnTrabajo a92 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(8));
//        
//        listaAl9.add(a91);
//        //Profesores en el Trabajo
//        RolEnTrabajo rt91= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(3), Rol.TUTOR);
//        RolEnTrabajo rt92= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(4), Rol.COTUTOR);
//        listaR9.add(rt91);
//        listaR9.add(rt92);
//        
//        Trabajo t9= nuevoTrabajo("Sistema de Gestión", listaA1,7, fecha4, fecha1, listaAl9, listaR9);
//        if (t9!=null){
//            if(!listaTrabajos.contains(t9)) {
//                listaTrabajos.add(t9);
//                System.out.println("Se agregó el trabajo 9");
//            }
//            else
//                System.out.println("No se agregó el trabajo 9");
//        }
//        else 
//             System.out.println("No se creó el trabajo 9");
//    //</editor-fold> 
//        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 10">  
//        System.out.println("\n*** Trabajo 10 - Debería Agregar  *** \n ");
//        // TRABAJO 10 Se Agrega
//        ArrayList<AlumnoEnTrabajo> listaAl10 = new ArrayList<>();
//        ArrayList<RolEnTrabajo> listaR10 = new ArrayList<>();
//        //Alumnos en el Trabajo    
//        AlumnoEnTrabajo a101 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(10));
//        AlumnoEnTrabajo a102 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(9));
//        listaAl10.add(a101);
//        listaAl10.add(a102);
//        //Profesores en el Trabajo
//        RolEnTrabajo rt101= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(3), Rol.TUTOR);
//        RolEnTrabajo rt102= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(4), Rol.COTUTOR);
//        listaR10.add(rt101);
//        listaR10.add(rt102);
//        
//        Trabajo t10= nuevoTrabajo("Sistema de Gestión 2", listaA1,4, fecha4, fecha1, listaAl10, listaR10);
//        if (t10!=null){
//            if(!listaTrabajos.contains(t10)) {
//                listaTrabajos.add(t10);
//                System.out.println("Se agregó el trabajo 10");
//            }
//            else
//                System.out.println("No se agregó el trabajo 10");
//        }
//        else 
//             System.out.println("No se creó el trabajo 10");
//    //</editor-fold> 
//        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 11">  
//        System.out.println("\n*** Trabajo 11 - No deberia agregar - Alumnos repetidos *** \n ");
//        // TRABAJO 10 NO lo Agrega los alumnos son iguales
//        ArrayList<AlumnoEnTrabajo> listaAl11 = new ArrayList<>();
//        ArrayList<RolEnTrabajo> listaR11 = new ArrayList<>();
//        //Alumnos en el Trabajo    
//        AlumnoEnTrabajo a111 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(10));
//        AlumnoEnTrabajo a112 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(10));
//        listaAl11.add(a111);
//        listaAl11.add(a112);
//        //Profesores en el Trabajo
//        RolEnTrabajo rt111= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(3), Rol.TUTOR);
//        RolEnTrabajo rt112= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(4), Rol.COTUTOR);
//        RolEnTrabajo rt113= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(0), Rol.JURADO);
//        RolEnTrabajo rt114= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(1), Rol.JURADO);
//        RolEnTrabajo rt115= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(2), Rol.JURADO);
//        listaR11.add(rt111);
//        listaR11.add(rt112);
//        listaR11.add(rt113);
//        listaR11.add(rt114);
//        listaR11.add(rt115);
//        
//        Trabajo t11= nuevoTrabajo("Sistema de Gestión 2", listaA1,4, fecha4, fecha1, listaAl11, listaR11);
//        if (t11!=null){
//            if(!listaTrabajos.contains(t11)) {
//                listaTrabajos.add(t11);
//                System.out.println("Se agregó el trabajo 11");
//            }
//            else
//                System.out.println("No se agregó el trabajo 11");
//        }
//        else 
//             System.out.println("No se creó el trabajo 11");
//    //</editor-fold> 
//        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 12">  
//        System.out.println("\n*** Trabajo 12 - Debería Agregar  *** \n ");
//        // TRABAJO 12 lo Agrega
//        ArrayList<AlumnoEnTrabajo> listaAl12 = new ArrayList<>();
//        ArrayList<RolEnTrabajo> listaR12 = new ArrayList<>();
//        //Alumnos en el Trabajo    
//        AlumnoEnTrabajo a121 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(10));
//        AlumnoEnTrabajo a122 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(7));
//        listaAl12.add(a121);
//        listaAl12.add(a122);
//        //Profesores en el Trabajo
//        RolEnTrabajo rt121= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(3), Rol.TUTOR);
//        RolEnTrabajo rt123= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(0), Rol.JURADO);
//        RolEnTrabajo rt124= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(1), Rol.JURADO);
//        RolEnTrabajo rt125= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(2), Rol.JURADO);
//        listaR12.add(rt121);
//        listaR12.add(rt123);
//        listaR12.add(rt124);
//        listaR12.add(rt125);
//        
//        Trabajo t12= nuevoTrabajo("Sistema de Gestión Nuevo", listaA1,4, fecha4, fecha1, listaAl12, listaR12);
//        if (t12!=null){
//            if(!listaTrabajos.contains(t12)) {
//                listaTrabajos.add(t12);
//                System.out.println("Se agregó el trabajo 12");
//            }
//            else
//                System.out.println("No se agregó el trabajo 12");
//        }
//        else 
//             System.out.println("No se creó el trabajo 12");
//    //</editor-fold> 
//        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 13">  
//        System.out.println("\n*** Trabajo 13 - No Debería Agregar, lista de Alumnos vacía *** \n ");
//        // TRABAJO 13 NO lo Agrega
//        ArrayList<AlumnoEnTrabajo> listaAl13 = new ArrayList<>();
//        ArrayList<RolEnTrabajo> listaR13 = new ArrayList<>();
//        //Alumnos en el Trabajo    
////        AlumnoEnTrabajo a121 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(10));
////        AlumnoEnTrabajo a122 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(7));
////        listaAl12.add(a121);
////        listaAl12.add(a122);
//        //Profesores en el Trabajo
//        RolEnTrabajo rt131= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(3), Rol.TUTOR);
//        RolEnTrabajo rt133= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(0), Rol.JURADO);
//        RolEnTrabajo rt134= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(1), Rol.JURADO);
//        RolEnTrabajo rt135= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(2), Rol.JURADO);
//        
//        listaR13.add(rt131);
//        listaR13.add(rt133);
//        listaR13.add(rt134);
//        listaR13.add(rt135);
//        
//        Trabajo t13= nuevoTrabajo("Trabajo Nro 13", listaA3,4, fecha4, fecha1, listaAl13, listaR13);
//        if (t13!=null){
//            if(!listaTrabajos.contains(t13)) {
//                listaTrabajos.add(t13);
//                System.out.println("Se agregó el trabajo 13");
//            }
//            else
//                System.out.println("No se agregó el trabajo 13");
//        }
//        else 
//             System.out.println("No se creó el trabajo 13");
//    //</editor-fold> 
//        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 14">  
//        System.out.println("\n*** Trabajo 14 - No Debería Agregar, lista de jurados con menos de 3 *** \n ");
//        // TRABAJO 14 NO lo Agrega
//        ArrayList<AlumnoEnTrabajo> listaAl14 = new ArrayList<>();
//        ArrayList<RolEnTrabajo> listaR14 = new ArrayList<>();
//        //Alumnos en el Trabajo    
//        AlumnoEnTrabajo a141 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(10));
//        AlumnoEnTrabajo a142 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(7));
//        listaAl14.add(a141);
//        listaAl14.add(a142);
//        //Profesores en el Trabajo
//        RolEnTrabajo rt141= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(3), Rol.TUTOR);
//        RolEnTrabajo rt143= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(0), Rol.JURADO);
//        RolEnTrabajo rt144= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(1), Rol.JURADO);
//        
//        listaR14.add(rt141);
//        listaR14.add(rt143);
//        listaR14.add(rt144);
//        
//        Trabajo t14= nuevoTrabajo("Trabajo Nro 14", listaA1,4, fecha4, fecha1, listaAl14, listaR14);
//        if (t14!=null){
//            if(!listaTrabajos.contains(t14)) {
//                listaTrabajos.add(t14);
//                System.out.println("Se agregó el trabajo 14");
//            }
//            else
//                System.out.println("No se agregó el trabajo 14");
//        }
//        else 
//             System.out.println("No se creó el trabajo 14");
//    //</editor-fold> 
//        //<editor-fold defaultstate="collapsed"  desc="TRABAJO 15">  
//        System.out.println("\n*** Trabajo 15 - No Debería Agregar, lista de jurados repetidos *** \n ");
//        // TRABAJO 14 NO lo Agrega
//        ArrayList<AlumnoEnTrabajo> listaAl15 = new ArrayList<>();
//        ArrayList<RolEnTrabajo> listaR15 = new ArrayList<>();
//        //Alumnos en el Trabajo    
//        AlumnoEnTrabajo a151 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(10));
//        AlumnoEnTrabajo a152 = new AlumnoEnTrabajo(fecha4, (Alumno)listaPersonas.get(7));
//        listaAl15.add(a151);
//        listaAl15.add(a152);
//        //Profesores en el Trabajo
////        RolEnTrabajo rt151= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(3), Rol.TUTOR);
////        RolEnTrabajo rt153= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(0), Rol.JURADO);
////        RolEnTrabajo rt154= new RolEnTrabajo(fecha4, (Profesor)listaPersonas.get(1), Rol.JURADO);
////        
////        listaR14.add(rt141);
////        listaR14.add(rt143);
////        listaR14.add(rt144);
//        
//        Trabajo t15= nuevoTrabajo("Trabajo Nro 14", listaA1,4, fecha4, fecha1, listaAl14, listaR14);
//        if (t15!=null){
//            if(!listaTrabajos.contains(t15)) {
//                listaTrabajos.add(t15);
//                System.out.println("Se agregó el trabajo 15");
//            }
//            else
//                System.out.println("No se agregó el trabajo 15");
//        }
//        else 
//             System.out.println("No se creó el trabajo 15");
//    //</editor-fold> 
//        
//        System.out.println("\n*** LISTA DE TRABAJOS *** \n ");
//        for (Trabajo t : listaTrabajos)
//            t.mostrar();
//        
//     */   
//       
//    } 
//   /* public static Trabajo nuevoTrabajo(String titulo, ArrayList<Area> areas,int duracion,
//            LocalDate fechaPresentacion,LocalDate fechaAprobacion ,
//            ArrayList<AlumnoEnTrabajo> listaAlumnoEnT, ArrayList<RolEnTrabajo> listaRolEnT){
//        String mensaje;
//        Trabajo t=null;
//        boolean tieneTituloYDuracion;
//        boolean tieneAreas;
//        boolean tieneFechasValidas;
//        boolean tieneAlumnosValidos, tieneTutoresValidos, tieneJuradosValidos;
//        
//        tieneTituloYDuracion=controlarTituloYDuracion(titulo, duracion);
//        tieneAreas=controlarAreas(areas);
//        tieneFechasValidas= controlarFechas(fechaPresentacion, fechaAprobacion);
//        tieneAlumnosValidos= controlarAlumnos(listaAlumnoEnT);
//        tieneTutoresValidos= controlarTutores(listaRolEnT);
//        tieneJuradosValidos= controlarJurados(listaRolEnT);
////        if(!tieneTituloYDuracion)
////            System.out.println("t y d");
////        if(!tieneAreas)
////            System.out.println("area");
////         if(!tieneFechasValidas)
////            System.out.println("fec");
////         
////         if(!tieneAlumnosValidos)
////            System.out.println("al" + tieneAlumnosValidos);
////         if(!tieneTutoresValidos)
////            System.out.println("tut");
////         if(!tieneJuradosValidos)
////            System.out.println("jur");
//         
//        boolean datosValidos = tieneTituloYDuracion && tieneAreas && tieneFechasValidas && tieneAlumnosValidos && tieneTutoresValidos && tieneJuradosValidos;
//        if(datosValidos){
//            if(fechaAprobacion ==null ) 
//                t=new Trabajo(titulo, areas, duracion,fechaPresentacion, listaAlumnoEnT , listaRolEnT);
//            else 
//                t=new Trabajo(titulo, areas, duracion,fechaPresentacion, fechaAprobacion, listaAlumnoEnT , listaRolEnT);
//                
//        }
//       
//    return t;
//    }
//    
//    private static boolean controlarTituloYDuracion(String titulo, int duracion){
//        if(titulo.isEmpty() || titulo== null || duracion <=0 )
//            return false;
//        return true;
//    }
//    private static boolean controlarAreas(ArrayList<Area> areas){
//        if(areas.isEmpty()|| areas ==null)
//            return false;
//        return true;
//    }
//    private static boolean controlarFechas(LocalDate fechaPresentacion, LocalDate fechaAprobacion){
//        if(fechaPresentacion ==null)
//            return false;
//        else
//            if(fechaAprobacion==null) //fechaPresentacion no es vacia
//                return true;
//            else 
//                return (fechaAprobacion.isAfter(fechaPresentacion)|| fechaAprobacion.equals(fechaPresentacion));
//    }
//    private static boolean controlarAlumnos (ArrayList<AlumnoEnTrabajo> listaA){
////        System.out.println("size" +listaA.size());
////        System.out.println("empty" +listaA.isEmpty());
////        System.out.println("null" +listaA!=null);
//        if(listaA == null || listaA.isEmpty())
//            return false;
//        else{
//            for(int i = 0; i < listaA.size() - 1; i++) { 
//                    Alumno a1 = listaA.get(i).getUnAlumno();
//                    for(int j = i + 1; j < listaA.size(); j++) {
//                        Alumno a2 = listaA.get(j).getUnAlumno();
//                            if (a1.equals(a2))
//                                return false;
//                    }
//            }
//        }
//        
//        return true;
//    }
//    private static boolean controlarTutores (ArrayList<RolEnTrabajo> listaR){
//        int cantTutor=0, cantCotutor=0;
//        Profesor t=null, c=null;
//        //que la lista tenga datos
//        if(listaR.isEmpty()|| listaR == null)
//            return false;
//        else
//        {
//            for(RolEnTrabajo rt : listaR){
//                if(rt.getUnRol()== Rol.TUTOR){
//                    cantTutor++;
//                    t= rt.getUnProfesor();
//                }
//                if(rt.getUnRol()== Rol.COTUTOR){
//                    cantCotutor++;
//                    c=rt.getUnProfesor();
//                }
//                
//            }
//            //que haya las cantidades que requiere
//            if(cantTutor ==0 || cantTutor >1){
//                System.out.println("cT"+cantTutor); return false; }
//            if(cantCotutor>1){
//                System.out.println("2"); return false; 
//                }
//            //que no sean iguales
//            if(cantCotutor==1 && c.equals(t)){
//                System.out.println("3"); return false;       }             
//        }
//        return true;
//    }
//    private static boolean controlarJurados (ArrayList<RolEnTrabajo> listaR){
//        Profesor tutor=null, coTutor=null;
//        Profesor p1=null, p2=null, p3=null;
//        ArrayList<Profesor> listaJurado = new ArrayList<>();
//        //que la lista tenga datos
//        if(listaR.isEmpty()|| listaR == null) // la lista es vacia
//            return false;
//        else
//        {
//            for(RolEnTrabajo rt : listaR){
//                if(rt.getUnRol()== Rol.JURADO){
//                    listaJurado.add(rt.getUnProfesor());
//                }
//            }    
//            if(listaJurado.size()==3)
//            {
//                //tomo tutor cotutor y externo
//                for(RolEnTrabajo rt : listaR){
//                    if(rt.getUnRol()== Rol.TUTOR)
//                        tutor= rt.getUnProfesor();
//                    if(rt.getUnRol()== Rol.COTUTOR)
//                        coTutor=rt.getUnProfesor();
//                }
//
//                //que no sean iguales con los tutores y cotutores
//                if(listaJurado.contains(tutor))
//                    return false;
//                if(coTutor !=null)
//                    if(listaJurado.contains(coTutor) )
//                        return false;
//                
//                //que no sean iguales entre si
//                p1 = listaJurado.get(0);
//                p2 = listaJurado.get(1);
//                p3 = listaJurado.get(2);
//                if (p1.equals(p2) && p1.equals(p3) && p2.equals(p3))
//                    return false;
//            }
//        }
//        
//        return true;
    }
//  */

    }
