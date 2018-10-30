/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mariana
 */
public class Trabajo {
    //<editor-fold defaultstate="collapsed"  desc="variables de instancia">
    private String titulo;
    private List<Area> listaAreas=new ArrayList<>();//private String area;
    private int duracion;
    private LocalDate fechaPresentacion; //en la Comisión Académica
    private LocalDate fechaAprobacion; // por la Com. Académica
    private LocalDate fechaFinalización; // Presentación final del trabajo   
    private List<Seminario> listaSeminarios = new ArrayList<>();
    private List<AlumnoEnTrabajo> listaAlumnoEnTrab = new ArrayList<>();
    private List<RolEnTrabajo> listaRolEnTrab = new ArrayList<>();
    //</editor-fold>
    //<editor-fold defaultstate="collapsed"  desc="constructores">
//    /**
//     * Constructor
//     * @param titulo
//     * @param area
//     * @param duracion
//     * @param fechaPresentacion 
//     */
//    public Trabajo(String titulo, Area area, int duracion, LocalDate fechaPresentacion) {
//        this.titulo = titulo;
//        this.area = area;
//        this.duracion = duracion;
//        this.fechaPresentacion = fechaPresentacion;
//    }
//    /**
//    * Constructor 
//    * @param titulo
//    * @param area
//    * @param fechaPresentacion
//    * @param duracion
//    * @param fechaAprobacion 
//    */
//    public Trabajo(String titulo, Area area,int duracion,  LocalDate fechaPresentacion, LocalDate fechaAprobacion) {
//        this(titulo, area,duracion, fechaPresentacion);
//        this.fechaAprobacion = fechaAprobacion;
//    }
    
    public Trabajo(String titulo, List<Area> area,int duracion,  LocalDate fechaPresentacion, LocalDate fechaAprobacion, List<AlumnoEnTrabajo> listaAlumnoEnT, List<RolEnTrabajo> listaRolEnT) {
        this.titulo=titulo;
        this.listaAreas=area; this.duracion=duracion;
        this.fechaPresentacion= fechaPresentacion;
        this.fechaAprobacion = fechaAprobacion;
        this.listaAlumnoEnTrab= listaAlumnoEnT;
        this.listaRolEnTrab= listaRolEnT;
    }
     //</editor-fold>
    //<editor-fold defaultstate="collapsed"  desc="getterSetter">
    //Métodos Get y Set
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Area> getArea() {
        return listaAreas;
    }

    public void setArea(ArrayList<Area> listaAreas) {
        this.listaAreas = listaAreas;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public LocalDate getFechaPresentacion() {
        return fechaPresentacion;
    }

    public void setFechaPresentacion(LocalDate fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }

    public LocalDate getFechaAprobacion() {
        return fechaAprobacion;
    }

    public void setFechaAprobacion(LocalDate fechaAprobacion) {
        this.fechaAprobacion = fechaAprobacion;
    }

    public LocalDate getFechaFinalización() {
        return fechaFinalización;
    }

    public void setFechaFinalización(LocalDate fechaFinalización) {
        this.fechaFinalización = fechaFinalización;
    }    
//</editor-fold>
    @Override
    public String toString() {
        //return "Trabajo{" + "titulo=" + titulo + ", area=" + area + ", duracion=" + duracion + '}';
        String t ;
        t= "Trabajo: " + this.titulo + "\n";
        t+= "Area: " + this.areas() + "\n";
        t+="Duración: " + this.duracion + " meses \n";
        t+= "Fecha de Presentación en la C.A.: " +  fechaConFormato(this.fechaPresentacion)+"\n";
        t+="Fecha de Aprobacion: " +  fechaConFormato(this.fechaAprobacion)+"\n";
        t+="Fecha de Exposición Final: " +  fechaConFormato(this.fechaFinalización)+"\n";
        return t;
    }
    public String fechaConFormato(LocalDate fecha){
       String patron = "dd/MM/yyyy";
       String fechaFormateada = fecha==null? " - " : fecha.format(DateTimeFormatter.ofPattern(patron)); 
       return fechaFormateada;
    }
    
    public void mostrar(){
        /*System.out.println("Trabajo: " + this.titulo);
        System.out.println("Duración: " + this.duracion + " meses");
        System.out.println("Fecha de Presentación en la C.A.: " +  fechaConFormato(this.fechaPresentacion));
        System.out.println("Fecha de Aprobacion: " +  fechaConFormato(this.fechaAprobacion));
        System.out.println("Fecha de Exposición Final: " +  fechaConFormato(this.fechaFinalización));*/
        System.out.print("***********************************\n");
        System.out.println(this);
        
        System.out.println("\nAlumnos");
        System.out.println("-----------------------");
        for(AlumnoEnTrabajo a: this.listaAlumnoEnTrab)
            a.getUnAlumno().mostrar();
        
        System.out.println("\nTutores");
        System.out.println("-----------------------");
        for (RolEnTrabajo r: this.listaRolEnTrab)
            //if(r.getUnRol().equals(Rol.TUTOR)||r.getUnRol().equals(Rol.COTUTOR)||r.getUnRol().equals(Rol.EXTERNO))
            if(!r.getUnRol().equals(Rol.JURADO))    
                r.getUnProfesor().mostrar();
        
        System.out.println("\nJurado");
        System.out.println("-----------------------");
        for (RolEnTrabajo r: this.listaRolEnTrab)
        if(r.getUnRol().equals(Rol.JURADO))
               r.getUnProfesor().mostrar();
        
        
        if(!this.listaSeminarios.isEmpty()){
            System.out.println("\nSeminarios");
            System.out.println("-----------------------");
            for(Seminario s: this.listaSeminarios)
                System.out.println(s);
        }
        System.out.print("***********************************\n");
    }
    /**
     * Agregar un Profesor en un rol al Trabajo
     */
    //VER esto
    public void agregarProfesor (RolEnTrabajo rT){
        listaRolEnTrab.add(rT);
    }
    
    public void agregarSeminario (Seminario unSeminario){
        this.listaSeminarios.add(unSeminario);
    }
    
    private String areas(){
        String a="";
        if(!this.listaAreas.isEmpty())
            for(Area l: this.listaAreas)
                a= a + ' ' + l;
    return a;
    }
}
