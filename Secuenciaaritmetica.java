/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package secdecuadrados;

/**
 *
 * @author alfa
 */import java.util.Scanner;
public class Secdecuadrados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner = new Scanner(System.in);
        int numero;
        System.out.print("Ingresa un numero entero positivo: ");
        numero = Scanner.nextInt();
        if (numero > 0)
        { int i = 1;
        System.out.println("Los cuadrados de los numeros desde 1 hasta " + numero + "son:");
        do {
            int cuadrado = i * i;
            System.out.println("El cuadrado de " + i + " es " + cuadrado); 
            i++;
        } while (i <= numero);
        } else {
            System.out.println("Por favor, ingresa un numero positivo.");
        }
        Scanner.close();

    }
    
}

    }


    



