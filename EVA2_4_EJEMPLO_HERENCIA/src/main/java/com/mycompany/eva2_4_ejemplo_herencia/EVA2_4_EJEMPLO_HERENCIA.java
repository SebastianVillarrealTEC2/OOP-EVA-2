/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_ejemplo_herencia;

/**
 *
 * @author bisonte
 */
public class EVA2_4_EJEMPLO_HERENCIA {

    public static void main(String[] args) {
        Persona persona = new Persona("Juan ", "Villarreal" , "Salazar" , "VCS2" , 45, 'H');
        persona.imprimirDatos();
        Empleado empleado = new Empleado("250588" ,"Lider", 10000,"Juan ", "Villarreal" , "Salazar" , "VCS2" , 45, 'H');
        //empleado.imprimirDatosEmpleado();
        //empleado.imprimirDatos();
        System.out.println(empleado);
       
    }

   
}
