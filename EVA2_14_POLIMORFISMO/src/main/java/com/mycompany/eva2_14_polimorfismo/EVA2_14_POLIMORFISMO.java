/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva2_14_polimorfismo;

/**
 *
 * @author bisonte
 */
public class EVA2_14_POLIMORFISMO {

    public static void main(String[] args) {
        System.out.println("Circulo");
        Circulo circulo = new Circulo(30);
        imprimir(circulo);

        System.out.println("Rectangulo");
        Rectangulo rectangulo = new Rectangulo(10, 20);
        imprimir(rectangulo);

        //multiples figuras
        Figuras[] figuras = new Figuras[5];
        figuras[0] = new Circulo(10);
        figuras[1] = new Rectangulo(10, 20);
        figuras[2] = new Circulo(20);
        figuras[3] = new Rectangulo(10, 20);
        figuras[4] = new Circulo(30);
        for (int i = 0; i < figuras.length; i++) {
            imprimir(figuras[i]);
            
            
        }

    }

    public static void imprimir(Figuras figu) {
        System.out.println("Area=" + figu.calcularArea());
        System.out.println("Perimetro=" + figu.calcularPerimetro());
    }
}
