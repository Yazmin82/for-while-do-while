/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calcbasica;

/**
 *
 * @author alfa
 */import java.util.Scanner;
public class Calcbasica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner = new Scanner(System.in);
        boolean continuar=true;
        while (continuar){
      
            System.out.println("\n=== Calculadora Basica ===");

            System.out.println("1. Sumar");

            System.out.println("2. Restar");

            System.out.println("3. Multiplicar");

            System.out.println("4. Dividir");

            System.out.print("Elige una opcion (1-4): ");

            int opcion = Scanner.nextInt();
            System.out.print("primer numero:");
            double num1= Scanner.nextDouble();
            System.out.print("segundo numero:");
            double num2= Scanner.nextDouble();
            

            switch (opcion) {
                case 1:
                System.out.println("Resultado: " + (num1+num2));
                break;
            case 2:
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case 3:
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) { 
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    System.out.println("Error:");
                    break; 
}  
            default:
                System.out.println("Opcion no valida:");
                break;
}
            System.out.print("¿Quieres hacer otra operacion? (S/N): ");
            char respuesta = Scanner.next().toLowerCase().charAt(0);
            if(respuesta!='S'){
            continuar = false;
            System.out.println("¡Gracias!");
        
        Scanner.close();
            }
        }

    }
    
}
