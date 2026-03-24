/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_6_figuras;

/**
 *
 * @author villa
 */
public class Circulo extends Figura {
    
    private double radio;
    
     public Circulo(){
            this.radio=0;
    }
    
    public Circulo(double radio){
            this.radio=radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return "Circulo = Radio: " + radio + 
               ", Area: " + calcularArea() + 
               ", Perimetro: " + calcularPerimetro();
    }
    
}
