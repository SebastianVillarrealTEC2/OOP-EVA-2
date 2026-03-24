/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_abstract;

/**
 *
 * @author bisonte
 */
public class EVA2_7_ABSTRACT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Figuras figura=new Figuras();
        Circulo circulo = new Circulo(20);
        System.out.println(circulo);
        
        Triangulo triangulo = new Triangulo(5, 5);
        System.out.println(triangulo);
    }
    
}
