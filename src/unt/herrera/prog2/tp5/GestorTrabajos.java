/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author m
 */
public class GestorTrabajos implements IGestorTrabajos {
  private ArrayList<Trabajo> listaTrabajos = new ArrayList<>();
    private static GestorTrabajos gestor;
    /**
     * Constructor
    */                                            
    private GestorTrabajos() {    
    }
    
    /**
     * Método estático para crear una única instancia de gestor
     * @return GestorTrabajos
    */                                                            
    public static GestorTrabajos instanciar() {
        if (gestor == null) 
            gestor = new GestorTrabajos();            
        return gestor;
    }

    
    public String nuevoTrabajo(String titulo, int duracion, LocalDate fechaPresentacion, LocalDate fechaAprobacion, ArrayList<Area> areas, ArrayList<RolEnTrabajo> profesores, ArrayList<AlumnoEnTrabajo> aet) {
        Trabajo t=null;
        boolean tieneTituloYDuracion;
        boolean tieneAreas;
        boolean tieneFechasValidas;
        boolean tieneAlumnosValidos, tieneTutoresValidos, tieneJuradosValidos;
        
        tieneTituloYDuracion=controlarTituloYDuracion(titulo, duracion);
        tieneAreas=controlarAreas(areas);
        tieneFechasValidas= controlarFechas(fechaPresentacion, fechaAprobacion);
        tieneAlumnosValidos= controlarAlumnos(aet);
        tieneTutoresValidos= controlarTutores(profesores);
        tieneJuradosValidos= controlarJurados(profesores);
        if(!tieneTituloYDuracion)
            return ERROR_TITULO_DURACION;
        if(!tieneAreas)
            return ERROR_AREA;
         if(!tieneFechasValidas)
            return ERROR_FECHAS;
         if(!tieneAlumnosValidos)
             return ERROR_ALUMNOS;
         if(!tieneTutoresValidos)
            return ERROR_TUTOR_COTUTOR;
         if(!tieneJuradosValidos)
             return ERROR_JURADO;
         
        boolean datosValidos = tieneTituloYDuracion && tieneAreas && tieneFechasValidas && tieneAlumnosValidos && tieneTutoresValidos && tieneJuradosValidos;
        if(datosValidos){
            if(fechaAprobacion ==null ) 
               t=new Trabajo(titulo, areas, duracion,fechaPresentacion, aet , profesores);
            else 
               t=new Trabajo(titulo, areas, duracion,fechaPresentacion, fechaAprobacion, aet , profesores);
                
        }
        if(!this.listaTrabajos.contains(t)){
            listaTrabajos.add(t);
            return EXITO;
        }
        return DUPLICADO;
       
    
    }

    
    public Trabajo dameTrabajo(String titulo) {
        for(Trabajo trabajo : this.listaTrabajos)
            if (trabajo.getTitulo().equalsIgnoreCase(titulo))
                return trabajo;
        return null;
    }

    
    public ArrayList<Trabajo> buscarTrabajos(String titulo) {
        ArrayList<Trabajo> trabajosBuscados = new ArrayList<>();
        if (titulo != null) {
            for(Trabajo trabajo : this.listaTrabajos) {
                if (trabajo.getTitulo().toLowerCase().contains(titulo.toLowerCase()))
                    trabajosBuscados.add(trabajo);
            }
            return trabajosBuscados;
        }
        else
            return this.listaTrabajos;
    }

    @Override
    public void mostrarTrabajos() {
        for (Trabajo t : listaTrabajos)
            t.mostrar();
    }

    //VALIDACIONES
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
        if(listaA == null || listaA.isEmpty())
            return false;
        else{
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
                    cantCotutor++;
                    c=rt.getUnProfesor();
                }
                
            }
            //que haya las cantidades que requiere
            if(cantTutor ==0 || cantTutor >1){
                System.out.println("cT"+cantTutor); return false; }
            if(cantCotutor>1){
                System.out.println("2"); return false; 
                }
            //que no sean iguales
            if(cantCotutor==1 && c.equals(t)){
                System.out.println("3"); return false;       }             
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
