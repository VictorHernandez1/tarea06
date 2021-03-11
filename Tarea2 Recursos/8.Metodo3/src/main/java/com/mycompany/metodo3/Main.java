/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.metodo3;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // Realizacion del programa
        
        
        Scanner scanner = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        int number1;
        int number2;
        
        
        System.out.print("MULTIPLICACION DE DOS NUMEROS");
        System.out.print("\n Ingrese numero 1: ");
        number1 = scanner.nextInt();
        
       
        System.out.print("\n Ingrese numero 2: ");
        number2 = scanner.nextInt();
        
        
        operaciones.Multiplicar(number1, number2);
    
    }
    
}
