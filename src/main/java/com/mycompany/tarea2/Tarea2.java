/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea2;

import java.util.Scanner;

public class Tarea2 {

    public static void main(String[] args) {
        Scanner console=new Scanner(System.in);
        String cadenaingresada;
        System.out.println("Igrese la cadena");
        cadenaingresada= console.nextLine();
        
        String[] cadena= cadenaingresada.split(" ");
        int num1= Integer.parseInt(cadena[0]);
        String operador= cadena[1];
        int num2= Integer.parseInt(cadena[2]);
        System.out.println("\n");
        
        switch(operador){
            case "+":
                System.out.println(num1+num2);
                break;
            case "-":
                System.out.println(num1-num2);
                break;
            case "*":
                System.out.println(num1*num2);
                break;
            case "/":
                System.out.println(num1/num2);
                break;
                
        }
    }
}
