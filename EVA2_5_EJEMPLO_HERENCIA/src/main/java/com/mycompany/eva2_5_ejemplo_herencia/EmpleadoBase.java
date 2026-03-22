/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_5_ejemplo_herencia;

/**
 *
 * @author bisonte
 */
public class EmpleadoBase extends Empleado {

    private int annioingreso;

    public EmpleadoBase() {
        super();
        this.annioingreso = 0;
    }

    public EmpleadoBase(int annioingreso, String numeroEmpleado, String nombre, String apellido, double salario) {
        super(numeroEmpleado, nombre, apellido, salario);
        this.annioingreso = annioingreso;
    }
    

    public EmpleadoBase(int annioingreso) {
        super(); 
        this.annioingreso = annioingreso;
    }

    public int getAnnioingreso() {
        return annioingreso;
    }

    public void setAnnioingreso(int annioingreso) {
        this.annioingreso = annioingreso;
    }

    public int antiguedad(){
        int anti = 2026 - annioingreso;
        int cinco = anti / 5; 
        return cinco;
    }
    
    @Override
    public double calcularSalario(){
       return getSalario() * (1 + (antiguedad()* 0.1));
       
   }
    
    @Override
    public String toString(){
     String resu = super.toString() + "\n" + 
       "Antiguedad:" + antiguedad() + "\n" +
           "Salario total:"+ calcularSalario(); 
    return resu;
       
}
    
    
    

}
