/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva_2_17_composicion_vehiculo;

/**
 *
 * @author bisonte
 */
public class Vehiculo {
    private String marca;
        private String modelo;
            private int year;
    private Motor motor;
    
     public Vehiculo() {
        this.marca = "";
        this.modelo = "";
        this.year = 0;
        this.motor = null;
    }

    public Vehiculo(String marca, String modelo, int year, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Datos del Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", year=" + year + ", motor=" + motor + '}';
    }
    
    
    
    


    
}
