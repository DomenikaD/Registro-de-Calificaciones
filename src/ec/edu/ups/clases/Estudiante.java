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
    
    //Atributo de Estudiante
    private Carrera carrera;

    //Metodo Constructor
    public Estudiante(){
        
    }
    
    public Estudiante(int codigo){
       super(codigo);
    }
    
    
    public Estudiante(int codigo, String nombre, String cedula){
        //Hace referencia a los atributos del padre y le pasa el constructor con esos atributos
      super(codigo, nombre, cedula);
    }

    
    //Constructor con todos los parametros
    public Estudiante(Carrera carrera, int codigo, String nombre, String cedula, String telefono, String direccion, String correo, Sede sede) {
        //Atributos del padre(Persona)
        super(codigo, nombre, cedula, telefono, direccion, correo, sede);
        //Atributos propios(Estudiante)
        this.carrera = carrera;
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
