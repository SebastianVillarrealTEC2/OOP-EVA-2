/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_4_ejemplo_herencia;

/**
 *
 * @author bisonte
 */
public class Empleado extends Persona {

    private String numeroEmpleado;
    private String Puesto;
    private double salario;

    public Empleado() {
        super();
        this.numeroEmpleado = "";
        this.Puesto = "";
        this.salario = 0;
    }

    public Empleado(String numeroEmpleado, String Puesto, double salario, String nombre, String ap_paterno, String ap_materno, String rfc, int edad, char genero) {
        super(nombre, ap_paterno, ap_materno, rfc, edad, genero);
        this.numeroEmpleado = numeroEmpleado;
        this.Puesto = Puesto;
        this.salario = salario;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    /*void imprimirDatosEmpleado() {
        imprimirDatos();
        System.out.println("Numereo de empleado:" + numeroEmpleado);
        System.out.println("Puesto:" + Puesto);
        System.out.println("Salario:" + salario);
    }*/
    
    
    @Override//subre pone el de la superclase
    public void imprimirDatos() {
        super.imprimirDatos();//llamo a impr datos de persona
        System.out.println("Numereo de empleado:" + numeroEmpleado);
        System.out.println("Puesto:" + Puesto);
        System.out.println("Salario:" + salario);
    }
    
    @Override//heredo y modifico
public String toString(){
    String resu="OBJETO DE LA CALSE EMPLEADO";
    resu= "-----DATOS DEL EMPLEADO------" + "\n" +
       "Nombre:" + super.generarNombreCom() + "\n" +
       "RFC:" + getRfc()  + "\n" +
       "Edad:" + getEdad()  + "\n" +
       "Numero Empleado:" + numeroEmpleado  + "\n" +
       "Puesto:" + Puesto +  "\n" +
       "Salario"+ salario;
    return resu;
       
}

}

