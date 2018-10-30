/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Cel
 */
public class Principal {
    public static void main(String[] args) {
        
        ArrayList<Trabajo> listaTrabajos = new ArrayList<>();
        LocalDate fecha = LocalDate.of(2017, Month.MARCH, 25);
        LocalDate fecha2 = LocalDate.of(2017, Month.APRIL, 20);
        Trabajo unTrabajo=new Trabajo("Software", "gestion de alumnos",6, fecha) ;
        unTrabajo.mostrar();
        
        System.out.println(unTrabajo);
        
        Trabajo unTrabajo2= new Trabajo("Hw", "placa",5,fecha, fecha2,null  );
        
        listaTrabajos.add(unTrabajo);
        listaTrabajos.add(unTrabajo2);
        System.out.println("\n LISTA de TRABAJOS");
        for(Trabajo t:listaTrabajos)
            t.mostrar();
        
        unTrabajo.setDuracion(4);
        
        System.out.println("\n LISTA de TRABAJOS");
        for(Trabajo t:listaTrabajos)
            //t.mostrar();
            System.out.println(t);
        
        
        
    }
}
