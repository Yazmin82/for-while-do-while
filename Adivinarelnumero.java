/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * C/*lick nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adivelnumero;

/**
 *
 * @author alfa
 */import java.util.Scanner;
   import java.util.Random;
public class Adivelnumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Random random = new Random();
         int numeroSecreto = random.nextInt(100) + 1;
        Scanner Scanner = new Scanner(System.in);
           int intento;
              System.out.println(" ¡Adivina un numero entre 1 y 100!");
         
        do {
          System.out.print("Ingresa el numero: ");
          intento = Scanner.nextInt();

         if (intento < numeroSecreto) {
             System.out.println("el numero es bajo.Intenta de nuevo.");
       } else if (intento > numeroSecreto) {
           System.out.println("El numero es alto. Intenta de nuevo.");
         } else {
          System.out.println("¡muy bien ! Este es el numero.");
       }
         } while (intento != numeroSecreto);

        Scanner.close();
}

}

