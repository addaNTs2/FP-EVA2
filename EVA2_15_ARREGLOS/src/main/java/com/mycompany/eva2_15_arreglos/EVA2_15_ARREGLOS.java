/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_15_arreglos;

/**
 *
 * @author Angel
 */
public class EVA2_15_ARREGLOS {

    public static void main(String[] args) {
        //DECLARACION DE ARREGLOS: new = objeto
        int[] arreglo = new int[10]; //Ocupa 40 bytes
        //Primer elemento de un arreglo -->0
        arreglo[0] = 100;
        arreglo[1] = 200;
        arreglo[2] = 300;
        arreglo[3] = 400;
        arreglo[4] = 500;
        arreglo[5] = 600;
        arreglo[6] = 700;
        arreglo[7] = 800;
        arreglo[8] = 900;
        
        //Ultimo elemento de un areglo --> TAMAÑO -1
        arreglo[9] = 900;
        
        //EL ACCESO SIEMPRE ES A TRAVES DE LAS POSICIONES
        System.out.println(arreglo[0]);
        System.out.println(arreglo[1]);
        System.out.println(arreglo[2]);
        System.out.println(arreglo[3]);
        System.out.println(arreglo[4]);
        System.out.println(arreglo[5]);
        System.out.println(arreglo[6]);
        System.out.println(arreglo[7]);
        System.out.println(arreglo[8]);
        System.out.println(arreglo[9]);
    }
    }
