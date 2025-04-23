/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediadenumeropositivos;
import java.util.Scanner;

/**
 *
 * @author alfa
 */
public class Mediadenumeropositivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner = new Scanner(System.in);
        int numero;
        int suma = 0;
        int contador = 0;

        System.out.println("Ingrese números positivos uno por uno.");
        System.out.println("Para finalizar, ingrese un número negativo.");

        do {
            System.out.print("Ingrese un número: ");
            numero = Scanner.nextInt();

            if (numero >= 0) {
                suma += numero;
                contador++;
            }

        } while (numero >= 0);

        if (contador > 0) {
            double media = (double) suma / contador;
            System.out.println("La media de los números ingresados es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        Scanner.close();
    }
    
}
