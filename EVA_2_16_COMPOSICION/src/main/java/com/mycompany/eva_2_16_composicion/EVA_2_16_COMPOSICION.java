/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_2_16_composicion;

/**
 *
 * @author bisonte
 */
public class EVA_2_16_COMPOSICION {

    public static void main(String[] args) {
        Direccion direccion = new Direccion("Lopez", 1234, "Centro", "31234");
        Persona perso= new Persona("Juna", "Cruz", 50, direccion);
        System.out.println(perso);
        //
         Persona perso2= new Persona("Sergio", "lopez", 23, "Uni", 4312, "NORTE", "123452");
         System.out.println(perso2);
         
         //cambiar direccion
         // clases que tiene variables en objetos
         perso.getDireccion().setCalle("Tecnologico");
         perso.getDireccion().setNumero(20);
         perso.getDireccion().setColonia("Sur");
         perso.getDireccion().setCp("08123");
         
         //simplificacion para cod de arriba
         Direccion temp=perso.getDireccion();
         temp.setCalle("Tecnologico");
         temp.setNumero(20);
                 temp.setColonia("Sur");
                 temp.setCp("08123");
    }
}
