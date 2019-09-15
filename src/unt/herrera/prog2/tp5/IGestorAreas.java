/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp5;

import java.util.ArrayList;

/**
 *
 * @author mariana
 */
public interface IGestorAreas {
    
    public static final String EXITO ="Area creada correctamente.";
    public static final String ERROR = "Error: verifique los datos.";
    public static final String DUPLICADOS= "Ya existe un área con ese nombre.";
    
    /**
     * Crea un Area nueva y agregarla a la lista siempre y cuando no exista otra igual. 
       deberá controlar que un Area no puede tener un nombre vacío }
       * OJO! o una cadena en NULL. 
     * @param nombre
     * @return String con el resultado de la operacion
     */
    public String nuevaArea(String nombre);
    /**
     * Muestra la lista de Areas
     */
    public void mostrarAreas();
    /**
     * Busca si existe un Area cuyo nombre coincida con el filtro.
     * @param nombre
     * @return Area encontrada o NULL
     */
    public Area dameArea(String nombre);
    /**
     * Busca si existe una o mas Areas que contengan en el nombre el filtro.
     * no controlamos el filtro OJO!
     * @param nombre
     * @return devuelve la lista de Areas o una lista vacía/ null
     */
    public ArrayList<Area> buscarAreas(String nombre);
        

}
