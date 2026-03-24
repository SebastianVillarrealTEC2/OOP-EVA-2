/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_6_figuras;

/**
 *
 * @author villa
 */
public class Triangulo extends Figura {
    private double base;
    private double altura;
    
    public Triangulo() {
        this.base = 0;
        this.altura = 0;
    }
    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    
    @Override
     public double calcularPerimetro() {
        double hipotenusa= Math.sqrt(Math.pow(base, 2)+ Math.pow(altura,2));
        //raiz cuadrada de base cuadrada + altura cuadrada
        return base + altura + hipotenusa;
    }

    @Override
    public String toString() {
        return "Triangulo Rectangulo = Base: " + base + ", Altura: " + altura + 
               ", Area: " + calcularArea() + 
               ", Perimetro: " + calcularPerimetro();
    }
     
     
}
