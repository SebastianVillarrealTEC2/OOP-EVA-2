/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva_2_17_composicion_vehiculo;

/**
 *
 * @author bisonte
 */
public class Motor {
    private double potencia;
    
    public Motor() {
        this.potencia = 0.0;
    }

    public Motor(double potencia) {
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
    

    @Override
    public String toString() {
        return "Motor{" + "Potencia=" + potencia + '}';
    }

    
}
