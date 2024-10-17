/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_14_dec_a_bin;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA2_14_DEC_A_BIN {

    public static void main(String[] args) {
        int decimal;
        String binario = "";
        Scanner captura = new Scanner(System.in);
        System.out.println("Introduce tu numero decimal: ");
        decimal = captura.nextInt();
        captura.nextLine();
        if (decimal == 0) {
            binario = "0";
        }else
        while(decimal > 0){
            binario = (decimal % 2) + binario;
            decimal = decimal / 2;}
        
        System.out.println("El decimal convertido a binario es igual a: " + binario);
    }
}
