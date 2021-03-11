/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.operacionesaritmeticas;

import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        // Realizacion del programa
      
        float number1;
        float number2;
        float resultado;
        String leer;
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Por favor ingresa el primer número\n");
        number1 = scanner.nextFloat();
          
        
        System.out.println("Por favor ingresa el Segundo número\n");
        number2 = scanner.nextFloat();
        
       
        //suma
        resultado = number1 + number2;
        System.out.println("\n resultado de una suma es: "+ resultado);
        
       
        //resta
        resultado = number1 - number2;
        System.out.println("\n resultado de una resta es: "+ resultado);
        
       
        //multiplicacion
        resultado = number1 * number2;
        System.out.println("\n resultado de una multiplicación es: "+ resultado);
        
        
        // division
        resultado = number1 / number2;
        System.out.println("\n resultado de una división es: "+ resultado);
   
    
    }
    
}
