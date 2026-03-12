/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.eva2_3_herencia;

/**
 *
 * @author bisonte
 */
public class EVA2_3_HERENCIA {

    public static void main(String[] args) {
        System.out.println("---ANIMAL---");
        Animal animal = new Animal();
        animal.comer();
        System.out.println("---MAMIFERO---");
        Mamifero mamifero = new Mamifero();
        mamifero.comer();
        mamifero.tenerpelo();
        System.out.println("---PERSONA---");
        Persona persona = new Persona("hola mundo");
        persona.comer();
        persona.tenerpelo();
        persona.pensar();
    }
}

class Animal {//BASE, SUPERCLASE, PADRE
    //constructor

    public Animal() {
        System.out.println("Animal!!");
    }

    public void comer() {
        System.out.println("Comer!!");
    }
}

class Mamifero extends Animal {//DERIVADA, SUBCLASE, HIJO

    public Mamifero() {
        super();//cibstrucotr de la super clase (animal)
        System.out.println("Mamifero!!");
    }

    public void tenerpelo() {
        System.out.println("Tiene Pelo!!");
    }
}

    class Persona extends Mamifero {
        public Persona(String mensaje){
            super();// constructor default de la superclase(mamifero)
            System.out.println(mensaje);
        }
        
        /*public Persona() {
            System.out.println("Persona!!");
        }*/

        public void pensar() {
            //super.
            System.out.println("Pensar!!");
        }
    }

    
