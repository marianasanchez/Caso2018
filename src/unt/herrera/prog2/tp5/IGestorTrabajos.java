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
 * @author mariana
 */
public interface IGestorTrabajos {
    public static final String EXITO = "Trabajo creado con éxito";
    public static final String DUPLICADO = "Ya existe un Trabajo con ese título";
    public static final String ERROR_TITULO_DURACION = "El título y/o duración del trabajo son incorrectos,\no ya existe un trabajo con el mismo título";
    public static final String ERROR_AREA = "El área del trabajo no puede ser nula";    
    public static final String ERROR_FECHAS = "Las fechas de presentación/aprobación son incorrectas y/o la fecha de aprobación no es posterior o igual a la de presentación";
    //public static final String ERROR_FECHA_EXPOSICION = "La fecha de exposición es incorrecta y/o no es posterior a la de aprobación";    
    public static final String ERROR_TUTOR_COTUTOR = "El trabajo no tiene tutor, o el tutor y cotutor son la misma persona";
    public static final String ERROR_JURADO = "El jurado debe estar compuesto por 3 profesores distintos, y el tutor y cotutor no pueden formar formar parte del mismo";
    public static final String ERROR_ALUMNOS = "El trabajo no tiene alumnos, y/o los alumnos seleccionados son incorrectos o están actualmente en otro trabajo";    

    
    public String nuevoTrabajo(String titulo, int duracion, LocalDate fechaPresentacion, LocalDate fechaAprobacion, ArrayList<Area> areas, ArrayList<RolEnTrabajo> profesores, ArrayList<AlumnoEnTrabajo> aet);
//    public String modificarTrabajo(Trabajo trabajo, LocalDate fechaFinalizacion);    
//    public String borrarTrabajo(Trabajo trabajo);
    public Trabajo dameTrabajo(String titulo);
    public ArrayList<Trabajo> buscarTrabajos(String titulo);
    public void mostrarTrabajos();
//    public boolean hayTrabajosConEsteArea(Area area);
//    public boolean hayTrabajosConEsteProfesor(Profesor profesor);    
//    public boolean hayTrabajosConEsteAlumno(Alumno alumno); 
//    public String reemplazarProfesor(Trabajo trabajo, Profesor profesorReemplazado, LocalDate fechaHasta, String razon, Profesor nuevoProfesor);
//    public String finalizarAlumno(Trabajo trabajo, Alumno alumno, LocalDate fechaHasta, String razon);    
//    public int verUltimoTrabajo();
//    public void cancelar();
}
