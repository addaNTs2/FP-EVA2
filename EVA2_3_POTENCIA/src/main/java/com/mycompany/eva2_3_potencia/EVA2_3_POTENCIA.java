/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA2_3_POTENCIA {

    public static void main(String[] args) {
        int base, expo, acum;
        Scanner captura = new Scanner(System.in);
        acum = 1;
        System.out.println("Introduce la base: ");
        base = captura.nextInt();
        captura.nextLine();
        System.out.println("Introduce el exponente: ");
        expo = captura.nextInt();
        captura.nextLine();
        // System.out.println("potencia = " + Math.pow(base, expo));
        
        for (int i = 1; i <= expo; i++) {
            acum = acum * base;
            
        }
        System.out.println("Potencia = "+ acum);
        
    }
}
