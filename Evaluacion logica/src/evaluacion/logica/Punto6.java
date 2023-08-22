/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion.logica;


import java.util.ArrayList;
import java.util.Scanner;

public class Punto6 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        ArrayList <Integer> numeros = new ArrayList<> ();
        
        int contador = 0;
        
        do {
            
            System.out.print("Ingresa un número (" + (contador + 1) + "/7): ");
            
            int numero = sc.nextInt();
            
            numeros.add(numero);
            
            contador++;
              
        } while (contador < 7);
        
        System.out.println("Los números ingresados son: " + numeros + "\n");
        
        //Punto 7 
        
        System.out.println("Numeros ingresados");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        
    }
}