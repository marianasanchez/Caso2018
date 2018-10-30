/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Cel
 */
public class Trabajo {
    private String area;
    private String titulo;
    private int duracion;
    private LocalDate fechaPresentacion;
    private LocalDate fechaAprobacion;
    private LocalDate fechaFinalizacion;

    /**
     * Constructor
     * @param area
     * @param titulo
     * @param duracion
     * @param fechaPresentacion
     * @param fechaAprobacion
     * @param fechaFinalizacion 
     */
    public Trabajo(String area, String titulo, int duracion, LocalDate fechaPresentacion, LocalDate fechaAprobacion, LocalDate fechaFinalizacion) {
        this(area, titulo, duracion, fechaPresentacion);
        this.fechaAprobacion = fechaAprobacion;
        this.fechaFinalizacion = fechaFinalizacion;
    }
    
    public Trabajo (String area, String titulo, int duracion, LocalDate fechaPresentacion){
        this.area=area;
        this.titulo = titulo;
        this.duracion = duracion;
        this.fechaPresentacion = fechaPresentacion;
    }
//<editor-fold defaultstate="collapsed" desc="get y set">
    public LocalDate getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(LocalDate fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
    //</editor-fold>
    
     private String getFechaFormateada(LocalDate fecha){
       String patron = "dd/MM/yyyy";
       String fechaFormateada = fecha.format(DateTimeFormatter.ofPattern(patron)); 
       return fechaFormateada;
    }
    
    public void mostrar(){
        System.out.println("Trabajo:" + this.titulo.toUpperCase()
                + " Area:"+this.area + this.duracion );
        //System.out.println(this.fechaPresentacion);
        System.out.println(getFechaFormateada(this.fechaPresentacion));
    }

    @Override
    public String toString() {
        return "Trabajo{" + area + ", " + titulo + ", " + duracion + '}';
    }
    
}
