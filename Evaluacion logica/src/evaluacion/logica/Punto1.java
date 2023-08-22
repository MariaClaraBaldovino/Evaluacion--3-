/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion.logica;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Punto1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
         String[] nombresCompañeros = new String[6];
         
        for (int i = 0; i < nombresCompañeros.length; i++) {
            
            System.out.print(" Ingrese el nombre del compañero:  ");
            
            nombresCompañeros[i] = sc.nextLine();
        }
 
        System.out.println(" Nombres de los compañeros:  " + nombresCompañeros.length);
        
        
            for (int i = 0; i < nombresCompañeros.length; i++) {
                
            System.out.println(" El nombre del compañero es " +(i + 1)+ " es: " + nombresCompañeros[i]);
        }
    }
}
