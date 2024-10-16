/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_validar_2;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA2_11_VALIDAR_2 {

    public static void main(String[] args) {
        int diaSem;
        Scanner captura = new Scanner(System.in);

        // Validar que el valor esté entre 1 y 7
        while (true) {
            System.out.println("Introduce tu día de la semana (1 al 7): ");
            diaSem = captura.nextInt();
            captura.nextLine();
            if (diaSem >= 1 && diaSem <= 7) {
                break;
            } else {
                System.out.println("Número inválido, por favor introduce un número entre 1 y 7.");
            }
        }

        // Imprimir el día correspondiente
        switch (diaSem) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miércoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Tu día de la semana no existe");
        }
    }
}
