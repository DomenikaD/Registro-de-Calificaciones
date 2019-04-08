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
public class Profesor extends Persona{
    
    //Atributos de Profesor
    private String titulo;
    private double salario;
    private String cargo;
    
    //Constructor
    public Profesor (){
        
    }

    public Profesor(int codigo) {
        super(codigo);
    }

    public Profesor(int codigo, String nombre, String cedula) {
        super(codigo, nombre, cedula);
    }

    //Constructor con todos los atributos de clase Persona(Padre) y de clase Profesor

    public Profesor(String titulo, double salario, String cargo, int codigo, String nombre, String cedula, String telefono, String direccion, String correo) {
        super(codigo, nombre, cedula, telefono, direccion, correo);
        this.titulo = titulo;
        this.salario = salario;
        this.cargo = cargo;
    }

    
    //Getters & Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    
    //toString
    @Override
    public String toString() {
        return "Profesor{" + "titulo=" + titulo + ", salario=" + salario + ", cargo=" + cargo + '}';
    }
    
    //Metodo salario
    public double getSalario(int horasTrabajadas, double valorPorHora){
        return salario + (horasTrabajadas * valorPorHora);
        
    }
    
    public double getSalario1(int horasTrabajadas, double comision){
        return salario + (horasTrabajadas * comision);
        
    }
    
    
}
