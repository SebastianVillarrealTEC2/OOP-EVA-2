/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva_11_herencia_interfaces;

/**
 *
 * @author bisonte
 */
public class EVA_11_HERENCIA_INTERFACES {

    public static void main(String[] args) {
        Demostracion objeto = new Demostracion();
        objeto.mostrarMensaje();

    }
}

class Demostracion implements OtraPrueba {

    @Override
    public void saludar(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("Hola mundo feliz!!");
    }

}

interface Prueba {

    public void mostrarMensaje();
}

interface OtraPrueba extends Prueba {

    public void saludar(String mensaje);
}
