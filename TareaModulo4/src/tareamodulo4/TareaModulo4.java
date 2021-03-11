/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareamodulo4;

import helpers.Doctor;
import helpers.HospitalEscuela;
import helpers.HospitalMarioCatarino;
import helpers.HospitalSanFelipe;

/**
 *
 * @author victorHernandes
 */
public class TareaModulo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Parte 1 tarea
        Doctor doctor = new Doctor();
        
        // Estableciendo informacion del doctor
        doctor.setNombre("Jose");
        doctor.setApellido("Lopez");
        doctor.setEdad(28);
        doctor.setAniosExperiencia(4);
        
        // Obteniendo informacion del doctor
        System.out.println("Nombre doctor:" + doctor.getNombre() + " " + doctor.getApellido());
        System.out.println("Edad: " + doctor.getEdad());
        System.out.println("Años de experiencia: " + doctor.getAniosExperiencia());
        
        System.out.println();
        // Parte 2 tarea
        HospitalEscuela hEscuela = new HospitalEscuela();
        HospitalMarioCatarino hMarioCatarino = new HospitalMarioCatarino();
        HospitalSanFelipe hSanFelipe = new HospitalSanFelipe();
        
        // Imprimir nombre de los hospitales con su director
        System.out.println(hEscuela.getNombreHospital() + ", director(a): " + hEscuela.getDirector());
        System.out.println(hMarioCatarino.getNombreHospital() + ", director(a): " + hMarioCatarino.getDirector());
        System.out.println(hSanFelipe.getNombreHospital() + ", director(a): " + hSanFelipe.getDirector());

    }
    
}
