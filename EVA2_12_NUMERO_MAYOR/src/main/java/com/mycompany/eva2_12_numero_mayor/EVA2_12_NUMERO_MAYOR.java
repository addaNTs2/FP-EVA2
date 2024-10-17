package com.mycompany.eva2_12_numero_mayor;

import java.util.Scanner;

public class EVA2_12_NUMERO_MAYOR {

    public static void main(String[] args) {
        int num, mayor = 0;
        Scanner captura = new Scanner(System.in);
        
        do {
            System.out.println("Introduce tus numeros (o -1 para terminar): ");
            num = captura.nextInt();
            captura.nextLine();
            if (num > mayor) {
                mayor = num;
            }

        } while (num != -1);         
        System.out.println("Aquí está el numero mayor: " + mayor);
    }
}
