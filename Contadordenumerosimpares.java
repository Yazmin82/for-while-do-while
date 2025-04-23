/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contadordenumerosimpares;
import java.util.Scanner;

/**
 *
 * @author alfa
 */
public class Contadordenumerosimpares {

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

        System.out.println("Números impares del 1 al " + numero + ":");

        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= numero);

        Scanner.close();
    }
    }
    

