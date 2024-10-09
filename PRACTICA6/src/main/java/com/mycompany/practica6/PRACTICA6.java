/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica6;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class PRACTICA6 {

    public static void main(String[] args) {
        // Solicitar un numero
        // Imprimir el siguiente patron (Se deben repetir segun el numero capturado)
        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *

        int num;
        Scanner captura = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        num = captura.nextInt();
        captura.nextLine();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = num - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}