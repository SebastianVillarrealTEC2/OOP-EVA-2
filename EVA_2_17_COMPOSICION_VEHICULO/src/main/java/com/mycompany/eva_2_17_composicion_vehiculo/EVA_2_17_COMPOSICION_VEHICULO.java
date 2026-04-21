/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_2_17_composicion_vehiculo;

/**
 *
 * @author bisonte
 */
public class EVA_2_17_COMPOSICION_VEHICULO {

    public static void main(String[] args) {
        Electrico motorElectrico = new Electrico("Litio", 100, 100);
        Vehiculo vehiculo = new Vehiculo("tesla", "x", 2025, motorElectrico);
        System.out.println("VEHICULO ELECTRICO");
        System.out.println(vehiculo);
        
        Combustion motorGasolina = new Combustion("Gsolina", 8, 300);
        Vehiculo tradicional = new Vehiculo("Ford", "Mustang", 1967, motorGasolina);
         System.out.println("VEHICULO TRADICIONAL");
        System.out.println(tradicional);
        
    }
}
