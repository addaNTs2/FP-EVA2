/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA2_2_PROMEDIO {

    public static void main(String[] args) {
        int calif, acum;
        Scanner captura = new Scanner(System.in);
        acum = 0;
        for(int i = 1; i <= 20; i ++){
        System.out.println("Estudiante #" + i);
        System.out.println("Introduce las calificaciones:");
        calif = captura.nextInt();
        captura.nextLine();
        acum = acum + calif;
        }
        System.out.println("Calificaciones sumadas igual a : " + (acum / 20.0));
        
    }
}
