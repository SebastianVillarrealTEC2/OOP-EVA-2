/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva_2_15_polimorfismo;

/**
 *
 * @author bisonte
 */
public class Cliente extends Persona {
    private double credito;
    private String rfc;

    public Cliente(double credito, String rfc) {
        this.credito = 0.0;
        this.rfc = "";
    }

    public Cliente(String nombre, String apellidos, int edad, double credito, String rfc) {
        super(nombre, apellidos, edad);
        this.credito = credito;
        this.rfc = rfc;
    }
    
    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    @Override
    public String generarDatos() {
        return super.generarDatos()  + "\n" +
           "Credito: " + credito + "\n" +
           "RFC: $" + rfc;
    }
    
    

    

   
    
    
}
