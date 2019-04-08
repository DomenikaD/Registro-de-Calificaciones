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
public class Grupo {
    
    //Atributos
    private int codigo;
    private String nombre;
    private int cupo;

    //Constructor
    public Grupo(int codigo, String nombre, int cupo) {    
        this.codigo = codigo;
        this.nombre = nombre;
        this.cupo = cupo;
    }

    //Getters & Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    
    //toString
    @Override
    public String toString() {
        return "Grupo{" + "codigo=" + codigo + ", nombre=" + nombre + ", cupo=" + cupo + '}';
    }
    
    
    
    
}
