/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva_2_17_composicion_vehiculo;

/**
 *
 * @author bisonte
 */
public class Electrico extends Motor {
    private String tipoBateria;
    private int tiempoCarga;

    public Electrico() {
        this.tipoBateria = "";
        this.tiempoCarga = 0;
    }

    public Electrico(String tipoBateria, int tiempoCarga, double potencia) {
        super(potencia);
        this.tipoBateria = tipoBateria;
        this.tiempoCarga = tiempoCarga;
    }

    public String getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(String tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public int getTiempoCarga() {
        return tiempoCarga;
    }

    public void setTiempoCarga(int tiempoCarga) {
        this.tiempoCarga = tiempoCarga;
    }

    @Override
    public String toString() {
        return "Carro Electrico{" + "Tipo Bateria=" + tipoBateria + ", Tiempo Carga=" + tiempoCarga + '}';
    }
    
    
    
    
    
    
}
