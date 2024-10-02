/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_1_ciclos;

/**
 *
 * @author Angel
 */
public class EVA2_1_CICLOS {

    public static void main(String[] args) {
        //CICLO FOR -1 CUANDO SABEMOS CUANTAS VECES SE REPITE UNA INTRUCCION
        //FUNCIONA COMO UN CONTADOR: INICIO, FIN(condicion) Y SALTO DE CONTEO
        //i -->index(indice)
        //vamos a repetir 10 veces, contando de 1 a 10
        //operadores de acumulacion ++ sumar 1 a la variable, -- restar uno, += sumar "N a la variable"
        //-= restar "N" a la variable 
        for(int i = 1; i <= 10; i++){
            System.out.print(i + " - "); //se ejecuta 10 veces
        }
        System.out.println("");
        for(int i = 10; i >= 1; i--){
            System.out.print(i + "-");
        }
    }
    
}
