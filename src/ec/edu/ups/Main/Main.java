/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Main;

import ec.edu.ups.clases.Carrera;
import ec.edu.ups.clases.Estudiante;
import ec.edu.ups.clases.Grupo;
import ec.edu.ups.clases.Materia;
import ec.edu.ups.clases.Profesor;
import ec.edu.ups.clases.Sede;

/**
 *
 * @author Domenika Delgado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        //Instanciar mediante un constructor y ya no es necesario llamar a los sets
        //Intanciar Sede
        Sede sedeCuenca = new Sede(1, "Sede Cuenca", "Calle Vieja 12-30", "302454");

        //Intanciar Carrera
        Carrera carreraComputacion = new Carrera(2, "Computacion", 10, 30, "Ingenieria en Ciencias de la Computacion");
        //sedeCuenca.agregarCarrera(carreraComputacion); 
        Carrera carreraTelematica = new Carrera(3, "Telematica", 10, 40, "Ingenieria en Telematica");
        Carrera carreraMecatronica = new Carrera(4, "Mecatronica", 10, 25, "Ingenieria en Mecatronica");

        
        //Materias
        Materia materiaAntropologia = new Materia(10, "Antropologia", 80, 2, 1);
        Materia materiaAlgebra = new Materia(12, "Algebra", 200, 8, 1);

        Materia materiaCalculo = new Materia(13, "Calculo de una Variable", 240, 80, 2);
        Materia materiaFisica = new Materia(14, "Fisica", 180, 6, 2);

        Materia materiaCalculo1 = new Materia(15, "Calculo de dos Variables", 240, 8, 2);
        Materia materiaQuimica = new Materia(15, "Quimica", 180, 6, 1);


        
        //Profesores
        Profesor profesorMate = new Profesor("Ingeniero de Sistemas", 800, "Profesor", 20, "Pablo", "1717273401", "0998702282", "Av. Las Americas", "pablo@ups.edu.ec");
        Profesor profesorFisica = new Profesor("Ingeniero de Sistema", 700, "Profesor", 22, "Luis", "1717273441", "0999957578", "24 de Mayo", "luis@ups.edu.ec");

        //Estudiantes
        Estudiante estudiante1 = new Estudiante(carreraComputacion, 02, "Sofia", "1717273401", "0998701232", "Gapal", "sofiai@est.ups.edu.ec");
        Estudiante estudiante2 = new Estudiante(carreraTelematica, 04, "Andres", "1717173449", "0983128216", "Baños", "andresi@est.ups.edu.ec");
        Estudiante estudiante3 = new Estudiante(carreraMecatronica, 06, "Lily", "0105285467", "0999967677", "Monay", "lilyi@est.ups.edu.ec");
        Estudiante estudiante4 = new Estudiante(carreraComputacion, 03, "Santi", "0102303401", "0983188734", "Miraflores", "santii@est.ups.edu.ec");

       
       //Grupos
        Grupo grupo5 = new Grupo(1, "Antropologia", 20);
        Grupo grupo6 = new Grupo(6, "Fisica", 15);
        
    }

}
