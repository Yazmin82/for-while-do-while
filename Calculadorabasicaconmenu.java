/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorabasicaconmenu;
import java.util.Scanner;

/**
 *
 * @author alfa
 */
public class Calculadorabasicaconmenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       

  
        Scanner Scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("----- Calculadora Básica -----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("Seleccione una opción (1-4): ");

            int opcion = Scanner.nextInt();

            System.out.print("Ingrese el primer número: ");
            double num1 = Scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = Scanner.nextDouble();

            double resultado = 0;
            boolean operacionValida = true;

            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                        operacionValida = false;
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
                    operacionValida = false;
                    break;
            }

            if (operacionValida) {
                System.out.println("El resultado es: " + resultado);
            }

            System.out.print("¿Desea realizar otra operación? (s/n): ");
            String respuesta = Scanner.next();

            if (!respuesta.equalsIgnoreCase("s")) {
                continuar = false;
                System.out.println("¡Gracias por usar la calculadora!");
            }

            System.out.println();
             }

        Scanner.close();
    }
}
