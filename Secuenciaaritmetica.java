/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secuenciaaritmetica;


/**
 *
 * @author alfa
 */
import java.util.Scanner;
public class Secuenciaaritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner Scanner = new Scanner(System.in);
 System.out.print("Ingrese el primer número de la secuencia: ");
        int primerNumero = Scanner.nextInt();

        System.out.print("Ingrese la diferencia entre los números: ");
        int diferencia = Scanner.nextInt();

        System.out.print("Ingrese el número máximo de la secuencia: ");
        int numeromaximo = Scanner.nextInt();

        int numeroActual = primerNumero;

        System.out.println("Secuencia aritmética:");

        do {
            System.out.print(numeroActual);
            numeroActual += diferencia;
        } while (numeroActual <= numeromaximo);

        Scanner.close();
    }

    }


    



