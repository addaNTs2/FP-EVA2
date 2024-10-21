/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_16_ciclos_arreglos;

/**
 *
 * @author Angel
 */
public class EVA2_16_CICLOS_ARREGLOS {

    public static void main(String[] args) {
        int[] datos, x, y, z; //TODOS SON ARREGLOS
        int vall, val2, arreglo[]; //SOLO ARREGLO ES ARREGLO, EL ARREGLO SIEMPRE SERA EL QUE ESTE A LADO DE
        // []
        
        arreglo = new int[10];
        
        for (int i = 0; i < 10; i++) {
            arreglo[i] = (int)(Math.random() * 100);
            
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
