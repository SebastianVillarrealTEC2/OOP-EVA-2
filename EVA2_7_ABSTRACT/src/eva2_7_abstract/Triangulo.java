/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_7_abstract;

/**
 *
 * @author bisonte
 */
public class Triangulo  extends Figuras {
    
private double base;
    private double altura;
    
    public Triangulo() {
        this.base = 0;
        this.altura = 0;
    }
    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    

    @Override
    public double calcularArea() {
         return (base * altura) / 2;
    }

    @Override
    public double calcularPerimetro() {
         double hipotenusa= Math.sqrt(Math.pow(base, 2)+ Math.pow(altura,2));
        return base + altura + hipotenusa;
    }

    @Override
    public String toString() {
                return "Triangulo Rectangulo = Base: " + base + ", Altura: " + altura + 
               ", Area: " + calcularArea() + 
               ", Perimetro: " + calcularPerimetro();

    }
    
    
    
    
    
    
}
