/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva2_13_final;

/**
 *
 * @author bisonte
 */
public class EVA2_13_FINAL {

    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.setNombre("juan"); 
        empleado.setPuesto("Profesor");
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Puesto: " + empleado.getPuesto());
    }
}

class Persona {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

final class Empleado extends Persona {

    private String puesto;

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
