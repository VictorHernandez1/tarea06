/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modulo3;

/**
 *
 * @author frank
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Desarrollador desarrollador = new Desarrollador();
      desarrollador.setNombres("Adonay");
      desarrollador.setApellidos("Hernandez");
      desarrollador.setSexo("Masculino");
      desarrollador.setEdad(25);
      desarrollador.setEspecializacion("Programador Java");
      
      System.out.println("Nombre:" + desarrollador.getNombres());
      System.out.println("Apellido:" + desarrollador.getApellidos());
      System.out.println("Edad:" + desarrollador.getEdad());
      System.out.println("Sexo:" + desarrollador.getSexo());
      System.out.println("Especializacion:" + desarrollador.getEspecializacion());
           
    }
    
}
