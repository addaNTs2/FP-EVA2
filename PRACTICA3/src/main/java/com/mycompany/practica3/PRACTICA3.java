/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica3;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class PRACTICA3 {

    public static void main(String[] args) {
        //Solicitar una cadena al usuario.
        //Imprimir cada caracter por separado en su propia linea
        String cadena;
        Scanner captura = new Scanner(System.in);
        
        System.out.println("Introduce el texto: ");
        cadena = captura.nextLine();
        
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.charAt(i));
            
        }
        
    }
}
