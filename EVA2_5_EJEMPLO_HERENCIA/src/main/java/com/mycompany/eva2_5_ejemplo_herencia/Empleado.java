/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_5_ejemplo_herencia;

/**
 *
 * @author bisonte
 */
public class Empleado {

    private String numeroEmpleado;
    private String nombre;
    private String apellido;
    private double salario;

    public Empleado() {
        this.numeroEmpleado = "";
        this.nombre = "";
        this.apellido = "";
        this.salario = 0;
    }

    public Empleado(String numeroEmpleado, String nombre, String apellido, double salario) {
        this.numeroEmpleado = numeroEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        String resu = "---EMPLEADO---" + "\n" +
                  "Numero Empleado: " + numeroEmpleado + "\n" +
                  "Nombre: " + nombre + "\n" +
                  "Apellido: " + apellido + "\n" +
                  "Salario: " + salario; 
    return resu;
    }
    
   public double calcularSalario(){
       return salario;
   }
}
