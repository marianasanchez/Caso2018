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
public class GestorAreas implements IGestorAreas{
    private ArrayList<Area> listaAreas = new ArrayList<>();
    private static GestorAreas gestor;
    /**
     * Constructor
    */                                            
    private GestorAreas() {    
    }
    
    /**
     * Método estático para crear una única instancia de GestorAreas
     * @return GestorAreas
    */                                                            
    public static GestorAreas instanciar() {
        if (gestor == null) 
            gestor = new GestorAreas();            
        return gestor;
    } 
    
    //nuevaArea
    public String nuevaArea(String nombre){
    if (!nombre.trim().isEmpty()) { //nombre del área no sea una cadena vacia
        Area area = new Area(nombre);
            if (!this.listaAreas.contains(area)) {//no admite duplicados
                this.listaAreas.add(area); 
                return EXITO;
            }
            else //ya existe un área con este nombre
                return DUPLICADOS;
        }
        else  //nombre del área vacío
           return ERROR; 
    }
    
    public void mostrarAreas(){
        for (Area a: listaAreas)
            System.out.println(a);
    }
    
    public Area dameArea(String nombre){
        for(Area area : this.listaAreas) {
            if (area.getNombre().equalsIgnoreCase(nombre))
                return area;
        }
        return null;
    }
    
    public ArrayList<Area> buscarAreas(String nombre){
        if (nombre != null && !nombre.trim().isEmpty()) { // VER EMPTY
            ArrayList<Area> areasBuscadas = new ArrayList<>();
            for(Area area : this.listaAreas) {
                if (area.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                    areasBuscadas.add(area);
            }
            return areasBuscadas;
        }
        else  //todas las áreas            
            return this.listaAreas;    
    
    }
}
