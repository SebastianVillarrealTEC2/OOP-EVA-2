/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_12_clases_anonimas;

/**
 *
 * @author bisonte
 */
public class EVA2_12_CLASES_ANONIMAS {

    public static void main(String[] args) {
        
        //POLIMORDISMO= HACER QUE ALGO SE COMPORTE COMO OTRA COSA
        Prueba prueba = new Prueba(){// CLASE ANONONIMA
            
        @Override
        public void mostrarMensaje(){
            System.out.println("Hola mundo feliz!!");
        }
        };
        prueba.mostrarMensaje();
        
        
    }
}

/*class Miclase implements Prueba{

    @Override
    public void mostrarMensaje() {
    }
    
}*/

interface Prueba{
    void mostrarMensaje();
    
}