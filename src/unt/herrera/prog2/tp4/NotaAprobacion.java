/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unt.herrera.prog2.tp4;



/**
 *
 * @author p2
 */
public enum NotaAprobacion {
    APROBADO_SINOBS, APROBADO_CONOBS, DESAPROBADO;

    @Override
    public String toString() {
        switch(this){
            case APROBADO_SINOBS:
                return "Aprobado sin Observaciones";
            case APROBADO_CONOBS:
                return "Aprobado con Observaciones";
            case DESAPROBADO:
                return "Desaporbado";
            default: return"";
        }
    }
    
    
}
