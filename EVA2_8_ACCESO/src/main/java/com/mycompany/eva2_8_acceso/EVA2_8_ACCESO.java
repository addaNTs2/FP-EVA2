/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_8_acceso;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA2_8_ACCESO {

    public static void main(String[] args) {
        //PANTALLA DE VALIDACION: USUARIO Y CONTRASEÑA
        String usu, psw;
        Scanner captura = new Scanner(System.in);
       
        do{
        System.out.println("Introduce el usuario: ");
        usu = captura.nextLine();
        System.out.println("Introduce el password: ");
        psw = captura.nextLine();
        }while(!(usu.equals("admin") && psw.equals("1234")));
        // ! = No
       
        //PROGRAMA PRINCIPAL

        System.out.println("PROGRAMA PRINCIPAL");
    }
}
