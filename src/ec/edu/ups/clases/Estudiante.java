/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author Domenika Delgado
 */
public class Estudiante extends Persona {
    
    //Atributo
    private Carrera carrera;

    
    public Estudiante(){
        
    }
    
    
    //Getters & Setters
    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    
    //toString
    @Override
    public String toString() {
        return "Estudiante{" + "carrera=" + carrera + '}';
    }
    
    
    
}
