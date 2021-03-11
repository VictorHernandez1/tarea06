/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.metodo4;

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Lista lista = new Lista();
        Scanner scanner = new Scanner(System.in);
        int numero;
      
        
        System.out.print("Ingrese el numero maximo de una lista que desee imprimir: ");
        numero = scanner.nextInt();
        
        
        lista.GenerarLista(numero);
        
    }
    
}
