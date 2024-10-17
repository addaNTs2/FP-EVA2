package com.mycompany.eva2_13_contar;

import java.util.Scanner;

public class EVA2_13_CONTAR {

    public static void main(String[] args) {
        // CONTAR VOCALES DE UNA CADENA
        String texto;
        int numVoc = 0; // Contador de vocales
        Scanner captura = new Scanner(System.in);
        
        System.out.println("Introduce tu texto: ");
        texto = captura.nextLine();
        
        for (int i = 0; i < texto.length(); i++) {
            char vocal = texto.charAt(i);
            
            if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u' ||
                vocal == 'A' || vocal == 'E' || vocal == 'I' || vocal == 'O' || vocal == 'U') {
                numVoc++; 
            }
        }
        
        System.out.println("El numero de vocales es: " + numVoc);
    }
}
