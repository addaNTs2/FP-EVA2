/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_19_menu;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA2_19_MENU {

    public static void main(String[] args) {
        String menu[];
        int precios[];
        Scanner captura = new Scanner(System.in);
        int cant;
        System.out.println("Cuantos prodcutos tendra el menu:");
        cant = captura.nextInt();
        captura.nextLine();
        menu = new String[cant]; //tamaño de los arreglos (cant)
        precios = new int[cant];
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Nombre de los productos:");
            menu[i] = captura.nextLine();
            System.out.println("Precio:");
            precios[i] = captura.nextInt();
            captura.nextLine();
        }
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + " - " + menu[i] + " $" + precios[i]);
        }
    }
}
