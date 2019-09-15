/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp5;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author mariana
 */
public class Trabajo {
    //<editor-fold defaultstate="collapsed"  desc="variables de instancia">
    private String titulo;
    private ArrayList<Area> listaAreas=new ArrayList<>();//private String area;
    private int duracion;
    private LocalDate fechaPresentacion; //en la Comisión Académica
    private LocalDate fechaAprobacion; // por la Com. Académica
    private LocalDate fechaFinalización; // Presentación final del trabajo   
    private ArrayList<Seminario> listaSeminarios = new ArrayList<>();
    private ArrayList<AlumnoEnTrabajo> listaAlumnoEnTrab = new ArrayList<>();
    private ArrayList<RolEnTrabajo> listaRolEnTrab = new ArrayList<>();
    //</editor-fold>
    //<editor-fold defaultstate="collapsed"  desc="constructores">
    /**
     * Constructor 1
     * @param titulo
     * @param area
     * @param duracion
     * @param fechaPresentacion
     * @param listaAlumnoEnT
     * @param listaRolEnT 
     */
    public Trabajo(String titulo, ArrayList<Area> area,int duracion,  LocalDate fechaPresentacion, ArrayList<AlumnoEnTrabajo> listaAlumnoEnT, ArrayList<RolEnTrabajo> listaRolEnT) {
        this.titulo=titulo;
        this.listaAreas=area; this.duracion=duracion;
        this.fechaPresentacion= fechaPresentacion;
        this.listaAlumnoEnTrab= listaAlumnoEnT;
        this.listaRolEnTrab= listaRolEnT;
    }
    
    /**
     * Constructor 2
     * @param titulo
     * @param area
     * @param duracion
     * @param fechaPresentacion
     * @param listaAlumnoEnT
     * @param listaRolEnT 
     */
    public Trabajo(String titulo, ArrayList<Area> area,int duracion,  LocalDate fechaPresentacion,LocalDate fechaAprobacion ,ArrayList<AlumnoEnTrabajo> listaAlumnoEnT, ArrayList<RolEnTrabajo> listaRolEnT) {
        this.titulo=titulo;
        this.listaAreas=area; this.duracion=duracion;
        this.fechaPresentacion= fechaPresentacion;
        this.fechaAprobacion= fechaAprobacion;
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

    public ArrayList<Area> getArea() {
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

    public ArrayList<Seminario> getListaSeminarios() {
        return listaSeminarios;
    }

    public void setListaSeminarios(ArrayList<Seminario> listaSeminarios) {
        this.listaSeminarios = listaSeminarios;
    }

    public ArrayList<AlumnoEnTrabajo> getListaAlumnoEnTrab() {
        return listaAlumnoEnTrab;
    }

    public void setListaAlumnoEnTrab(ArrayList<AlumnoEnTrabajo> listaAlumnoEnTrab) {
        this.listaAlumnoEnTrab = listaAlumnoEnTrab;
    }

    public ArrayList<RolEnTrabajo> getListaRolEnTrab() {
        return listaRolEnTrab;
    }

    public void setListaRolEnTrab(ArrayList<RolEnTrabajo> listaRolEnTrab) {
        this.listaRolEnTrab = listaRolEnTrab;
    }
    
    
//</editor-fold>
    @Override
    public String toString() {
        //return "Trabajo{" + "titulo=" + titulo + ", area=" + area + ", duracion=" + duracion + '}';
        String t ;
        t= "Trabajo: " + this.titulo + "\n";
        t+= "Area(s): " + this.areas() + "\n";
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
//      String t ;
//        t= "Trabajo: " + this.titulo + "\n";
//        t+= "Area(s): " + this.areas() + "\n";
//        t+="Duración: " + this.duracion + " meses \n";
//        t+= "Fecha de Presentación en la C.A.: " +  fechaConFormato(this.fechaPresentacion)+"\n";
//        t+="Fecha de Aprobacion: " +  fechaConFormato(this.fechaAprobacion)+"\n";
//        t+="Fecha de Exposición Final: " +  fechaConFormato(this.fechaFinalización)+"\n";
        System.out.println(this);
//    }
//    public void mostrarDetallado(){
        System.out.print("***********************************\n");
       // System.out.println(this);
//        this.mostrar();
        
        System.out.println("Alumnos");
        System.out.println("-----------------------");
        for(AlumnoEnTrabajo a: this.listaAlumnoEnTrab)
            a.getUnAlumno().mostrar();
        
        System.out.println("Tutores");
        System.out.println("-----------------------");
        for (RolEnTrabajo r: this.listaRolEnTrab)
            if(r.getUnRol().equals(Rol.TUTOR)||r.getUnRol().equals(Rol.COTUTOR))
                r.getUnProfesor().mostrar();
        
        System.out.println("Jurado");
        System.out.println("-----------------------");
        for (RolEnTrabajo r: this.listaRolEnTrab)
            if(r.getUnRol().equals(Rol.JURADO))
               r.getUnProfesor().mostrar();
        
        if(!this.listaSeminarios.isEmpty()){
            System.out.println("Seminarios");
            System.out.println("-----------------------");
            for(Seminario s: this.listaSeminarios)
                System.out.println(s);
        }
        System.out.print("***********************************\n");
    }
    
    
    private String areas(){
        String a="";
        if(!this.listaAreas.isEmpty())
            for(Area l: this.listaAreas)
                a= a + ' ' + l;
    return a;
    }


    /**
     * Agregar un Profesor en un rol al Trabajo
     */
    //VER esto
    public String agregarProfesor (RolEnTrabajo rT){
        if(!this.listaRolEnTrab.contains(rT)){
            listaRolEnTrab.add(rT);
            return "Se agregó el Rol de Profesor";
        }
        else
            return "No se puede agregar el Rol";
    }
    
    public String agregarSeminario (Seminario unSeminario){
        if(!this.listaSeminarios.contains(unSeminario)){
            this.listaSeminarios.add(unSeminario);
            return "Se agregó el Rol de Profesor";
       }
        else
            return "No se puede agregar el Rol";
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.titulo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Trabajo other = (Trabajo) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        return true;
    }

   
    
    
}
