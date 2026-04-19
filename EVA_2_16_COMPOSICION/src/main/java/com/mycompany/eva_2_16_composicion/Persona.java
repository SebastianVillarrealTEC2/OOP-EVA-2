/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva_2_16_composicion;

/**
 *
 * @author bisonte
 */
public class Persona {
    private String nombre;
        private String apellido;
            private int edad;
            private Direccion direccion;
            
            //CONSTRUCTORES
            // constuye los objetos
            
             public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
        this.direccion = new Direccion();
    }

    public Persona(String nombre, String apellido, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    public Persona(String nombre, String apellido, int edad,
            String calle, int numero, String colonia, String cp) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.direccion = new Direccion( calle,  numero,  colonia,  cp);
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
public String toString() {
    return "Datos Persona \n" + 
           "Nombre: " + nombre + " " + apellido + "\n" + 
           "Edad: " + edad + "\n" + 
           direccion;
}

    
    
    
            
            
    }
            
            



