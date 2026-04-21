/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva_2_17_composicion_vehiculo;

/**
 *
 * @author bisonte
 */
public class Combustion extends Motor {
    private String tipoCombustible;
    private int cilindros;

    public Combustion() {
        this.tipoCombustible = "";
        this.cilindros = 0;
    }

    public Combustion(String tipoCombustible, int cilindros, double potencia) {
        super(potencia);
        this.tipoCombustible = tipoCombustible;
        this.cilindros = cilindros;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    @Override
    public String toString() {
        return "Combustion{" + "Tipo Combustible=" + tipoCombustible + ", Cilindros=" + cilindros + '}';
    }

    
    
    
}
