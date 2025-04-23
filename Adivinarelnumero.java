/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivinarelnumero;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author alfa
 */
public class Adivinarelnumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Random random = new Random();
        int numeroSecreto = random.nextInt(100) + 1; 

        Scanner Scanner = new Scanner(System.in);
        int intento;
        int contadorIntentos = 0;
         System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("Estoy pensando en un número entre 1 y 100.");

        do {
            System.out.print("Introduce tu suposición: ");
            intento = Scanner.nextInt();
            contadorIntentos++;

            if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (intento > numeroSecreto) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                System.out.println("¡Correcto! Has adivinado el número en " + contadorIntentos + " intentos.");
            }

        } while (intento != numeroSecreto);

        Scanner.close();
    }
    
}
