/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_18_restaurante;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA_18_RESTAURANTE {

    public static void main(String[] args) {
        String menu[] = {"Dogos","Hamburguesas", "Boneless", "Tacos", "Montados", "Camarones"};
        int precios[] = {50, 80, 120, 150, 70, 200};
        Scanner captura = new Scanner(System.in);
        int cantidad, producto;
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + " - " + menu[i] + " $" + precios[i]);
            
        }
        System.out.println("Cual es tu orden? (Introduce el numero):");
        producto = captura.nextInt();
        captura.nextLine();
        System.out.println("Cuantas ordenes?");
        cantidad = captura.nextInt();
        captura.nextLine();
        System.out.println("El costo total es igual a: " +"$" + cantidad*precios[producto]);
        
        
    }
}
