/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_5_ejemplo_herencia;

/**
 *
 * @author bisonte
 */
public class EVA2_5_EJEMPLO_HERENCIA {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("1", "juan", "Perez ", 200000);
        System.out.println(empleado);
        
        EmpleadoBase empleadobase = new EmpleadoBase(2000, "1234" , "sebatian", "villarreal", 20000);
        System.out.println(empleadobase);
        
        EmpleadoHonorarios empleadohonorarios = new EmpleadoHonorarios(100, "242526", "Candido", "Perez", 20000);
        System.out.println(empleadohonorarios);
        
    }
}
