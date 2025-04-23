/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciadecuadrados;
import java.util.Scanner;

/**
 *
 * @author alfa
 */
public class Secuenciadecuadrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner Scanner = new Scanner(System.in);
        int numero;
         do {
            System.out.print("Ingrese un número entero positivo: ");
            numero = Scanner.nextInt();

            if (numero <= 0) {
                System.out.println("El número debe ser positivo. Intente de nuevo.");
            }

        } while (numero <= 0);
 int i = 1;
        System.out.println("Cuadrados del 1 al " + numero + ":");

        do {
            int cuadrado = i * i;
            System.out.println(i + "² = " + cuadrado);
            i++;
        } while (i <= numero);

        Scanner.close();
    }
    }
    


