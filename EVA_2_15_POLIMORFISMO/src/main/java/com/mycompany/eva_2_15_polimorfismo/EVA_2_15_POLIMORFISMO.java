/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_2_15_polimorfismo;

/**
 *
 * @author bisonte
 */
public class EVA_2_15_POLIMORFISMO {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Lider", 10000, "Juan", "Perez", 40);
        System.out.println("Datos empleado");
        imprimir(empleado);
        
        Cliente cliente = new Cliente("Juan", "Calderon", 10000, 10000, "ASDF1234");
        System.out.println("Datos cliente");
        imprimir(cliente);
       
        Persona persona = new Persona ("Pedro", "De la hoya", 34);
        System.out.println("Datos Persona");
        imprimir(persona);
        
        
        Persona perso = empleado;// POLIMORFISMO: el empleado se "disfraza" de persona
        System.out.println("EMPLEADO DISFRAZADO DE PERSONA");
        imprimir(perso);
        
        Persona perso2 = cliente;
        System.out.println("CLIENTE DISFRAZADO DE PERSONA");
        imprimir(perso2);
        
        //Cliente clienteX = new persona;
        //CASTING 
        Cliente cl= (Cliente)perso2;// en perso2 se almacean un objeto, se puede hacer casting
               // Cliente cl2= (Cliente)perso;// en perso se almacean un objeto,NO se puede hacer casting 
           
    }
    
    public static void imprimir(Persona perso){
        System.out.println(perso.generarDatos());
        if(perso instanceof Empleado)
            System.out.println("Empleado");
        else if(perso instanceof Cliente)
            System.out.println("Cliente");
        else if(perso instanceof Persona)
            System.out.println("Persona");
        
            
    }
}


//TERMINAR LOS IMPRESIONES 