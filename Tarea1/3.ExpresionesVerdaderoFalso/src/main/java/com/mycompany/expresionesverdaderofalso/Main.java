/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.expresionesverdaderofalso;

public class Main {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // Realizacion del programa
        
       
        int M =6;
        int T = 1;
        int K = -10;
        boolean resultM = false;
        boolean resultT = false;
        boolean resultK = false;
        
       
        if (M>T) {
        resultM = true;
        }
        
        
        if (T/K == -5) {
            resultT = true;
        }
        
       
        if ((M+T==7)||(M-T == 5)){
            resultK = true;
        }
        
        
        System.out.print("\n El resultado de M>T es:" + resultM);
        System.out.print("\n El resultado de T/K == -5 es:" + resultT);
        System.out.print("\n El resultado de (M+T==7)||(M-T == 5) es:" + resultK);
        
    
    }
    
}
