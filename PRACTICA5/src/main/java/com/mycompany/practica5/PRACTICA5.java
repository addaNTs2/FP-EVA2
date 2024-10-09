/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica5;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class PRACTICA5 {

    public static void main(String[] args) {
        //Solicitar un numero
        //Imprimir el siguiente patron(Se deben de repetir segun el numero capturado)
        //*
        //**
        //***
        //****
        //*****
        int num;
        Scanner captura = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        num = captura.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
                
            }
            
        }
        
    }
