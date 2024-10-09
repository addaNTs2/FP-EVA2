/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica1;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class PRACTICA1 {

    public static void main(String[] args) {
        //Solicitar una cadena de texto y un numero.
        //Imprimir la cadena el numero de veces solicitado.
        String text;
        int num;
        
        Scanner captura = new Scanner(System.in);
        System.out.println("Introduce tu texto: ");
        text = captura.nextLine();
        
        System.out.println("Introduce la cantidad de veces que quieres que se repita: ");
        num = captura.nextInt();
        captura.nextLine();
        
        for (int i = 0; i < num; i++) {
            System.out.println(i+ ":"+ text);
            
        }
    }
}
