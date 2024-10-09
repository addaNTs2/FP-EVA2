/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica4;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class PRACTICA4 {

    public static void main(String[] args) {
        //Solicitar una cadena al usuario
        //Imprimir todas las vocales
        String vocal;
        char caracter;
        Scanner captura = new Scanner(System.in);
        
        System.out.println("Introduce un texto: ");
        vocal = captura.nextLine();
        
        System.out.println("Las vocales son: ");
        for (int i = 0; i < vocal.length(); i++) {
            caracter = vocal.charAt(i);
            
            if (caracter == 'a' ||caracter == 'e'||caracter == 'i'||caracter == 'o'||caracter == 'u'){
                System.out.println(caracter);
            }
            }
        }
        
    }