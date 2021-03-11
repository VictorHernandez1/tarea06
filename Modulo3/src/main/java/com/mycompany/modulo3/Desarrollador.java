/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.modulo3;

public class Desarrollador {
    
    private String Nombres;   
    public String getNombres()
    {
        return Nombres;
    }
    public void setNombres(String nombre)
    {
        this.Nombres = nombre;
    }
    
    private String Apellidos;
    public String getApellidos()
    {
        return Apellidos;
    }
     public void setApellidos(String apellidos)
    {
        this.Apellidos = apellidos;
    }
    
    private int Edad;
    public int getEdad()
    {
        return Edad;
    }
    public void setEdad(int edad)
    {
        this.Edad = edad;
    }
    private String Sexo;
    public String getSexo()
    {
        return Sexo;
    }
    public void setSexo(String sexo)
    {
        this.Sexo = sexo;
    }
    private String Especializacion;
    public String getEspecializacion()
    {
        return Especializacion;
    }
    public void setEspecializacion(String especi)
    {
        this.Especializacion = especi;
    }
}
