/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vocalono;

/**
 *
 * @author alfa
 */import java.util.Scanner; 
public class Vocalono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        char letra;
        System.out.println("El programa terminará con un espacio:");
        while (true) {
            System.out.print("Ingresa una letra: ");
            String entrada = scanner.nextLine();
            if (entrada.isEmpty()) {
                System.out.println("Intenta de nuevo.");
                continue;
            }
             letra = entrada.charAt(0); 
            if (letra == ' ') {
            System.out.println("Fin del programa");
            break;
        }
            if (!Character.isLetter(letra)) {
            System.out.println(" No es una letra");
             continue;
        }
            char letraMinuscula = Character.toLowerCase(letra);
            if (letraMinuscula == 'a' || letraMinuscula == 'e' || letraMinuscula == 'i' ||
            letraMinuscula == 'o' || letraMinuscula == 'u') {
            System.out.println("Es una vocal.");
            } else {
                System.out.println("Es una consonante.");
            }
        }
    }
}


        
        

    
        
        
                
                                
              
                 
