/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluacion.logica;

/**
 *
 * @author 503
 */
public class Punto3 {
    public static void main(String[] args) {
        
        String[][] Jugadores = {{"Jugador 1", "Juan", "15 años", "delantero"},{"Jugador 2", "Pedro", "16 años", "defensa"},{"Jugador 3", "Luis", "17 años", "arquero"}};

        System.out.println("Información de los jugadores: \n" );
        
        for (int i = 0; i < Jugadores.length; i++) {
            
            System.out.println("Nombre: " + Jugadores[i][1]);
            
            System.out.println("Edad: " + Jugadores[i][2]);
            
            System.out.println("Posición: " + Jugadores[i][3]);
            
            System.out.println();
        }
        //Punto 4
        
        String posicionArquero = Jugadores[2][3];
        
        System.out.println("La posición del arquero es: " + posicionArquero + "\n");
        
        //Punto 5
        
        String edadPedro = Jugadores[1][2];
        
        System.out.println("La edad de pedro es: " + edadPedro + "\n");
        
        
    }
}
