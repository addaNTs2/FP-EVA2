/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica2;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class PRACTICA2 {

    public static void main(String[] args) {
        //Solicittar dos numeros
        //Imprimir todos los numeros entre esos dos en orden ascendentte y descendente
        int num1, num2;
        Scanner captura = new Scanner(System.in);
        
        System.out.print("Ingresa el primer numero: ");
        num1 = captura.nextInt();
        captura.nextLine();
        
        System.out.print("Ingresa el segundo numero: ");
        num2 = captura.nextInt();
        captura.nextLine();

        System.out.println("Numeros en orden ascendente:");
        for (int i = num1; i <= num2; i++) {
            System.out.println(i);
        }

        System.out.println("Numeros en orden descendente:");
        for (int i = num2; i >= num1; i--) {
            System.out.println(i);
    }
}
}