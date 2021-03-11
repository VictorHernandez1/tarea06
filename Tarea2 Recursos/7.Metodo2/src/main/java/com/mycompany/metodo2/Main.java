/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.metodo2;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Realizacion del proyecto
        
        
        Scanner scanner = new Scanner(System.in);
        int edad;
       
        
        System.out.print("Ingresa tu edad: ");
        edad = scanner.nextInt();
        
       
        NewClass verificar = new NewClass();       
        verificar.VerificarEdad(edad);
   
    }
    
}
