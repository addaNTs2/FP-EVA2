/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_9_acceso_while;

import java.util.Scanner;

/**
 *
 * @author Angel
 */
public class EVA2_9_ACCESO_WHILE {

    public static void main(String[] args) {
        //PANTALLA DE VALIDACION: USUARIO Y CONTRASEÑA
        String usu="", psw="";
        Scanner captura = new Scanner(System.in);
       
        while(!(usu.equals("admin") && psw.equals("1234"))){
        System.out.println("Introduce el usuario: ");
        usu = captura.nextLine();
        System.out.println("Introduce el password: ");
        psw = captura.nextLine();
       
        //PROGRAMA PRINCIPAL

        System.out.println("PROGRAMA PRINCIPAL");
    }
}
}