/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion.logica;

/**
 *
 * @author 503
 */
public class Punto2 {
    public static void main(String[] args) {
        
        int[][] edadesFamiliares = {{30, 25, 35}, {40, 50, 28},{22, 18, 60}};

        System.out.println("Edades de familiares:");
        
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                
                System.out.print(edadesFamiliares[i][j] + " ");
            }
            
            System.out.println();
        }
        
    }
}
