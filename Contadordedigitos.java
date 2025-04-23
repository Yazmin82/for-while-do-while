/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadordedigitos;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author alfa
 */
public class Contadordedigitos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
         Random random = new Random();
          int numeroAleatorio = random.nextInt(100) + 1;
           int suposicion = 0;
            System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("Estoy pensando en un número entre 1 y 100.");
        System.out.println("Intenta adivinarlo.");
         while (suposicion != numeroAleatorio) {
              System.out.print("Ingresa tu suposición: ");
            suposicion = scanner.nextInt();
             if (suposicion < numeroAleatorio) {
                System.out.println("¡Demasiado bajo! Intenta de nuevo.");
            } else if (suposicion > numeroAleatorio) {
                System.out.println("¡Demasiado alto! Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
                scanner.close();
                
         }
         }
    }
}
    


