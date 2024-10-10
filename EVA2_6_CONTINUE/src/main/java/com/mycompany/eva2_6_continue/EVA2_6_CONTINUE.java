/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_6_continue;

/**
 *
 * @author Angel
 */
public class EVA2_6_CONTINUE {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            // CONTINUE --> SE SALTA LA INSTRUCCION ACUTAL
            if (i % 2 == 1) { // numero impar 
                continue; //interumpe la repeticion desde este punto
            }

            System.out.println(i + " - ");
        }
    }
}