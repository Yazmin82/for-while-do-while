/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vocalesonovocales;


/**
 *
 * @author alfa
 */import java.util.Scanner;
public class Vocalesonovocales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letra;

        System.out.println("Ingresa letras. El programa finalizará cuando ingreses un espacio.");

        while (true) {
            System.out.print("Ingresa una letra: ");
            String entrada = scanner.nextLine();
            if (entrada.length() != 1) {
                System.out.println(" Ingresa una letra.");
                continue;
            }
            letra = entrada.charAt(0);
            if (letra == ' ') {
                System.out.println("finalizado.");
                break;
            }
            if (!Character.isLetter(letra)) {
                System.out.println("No es una vocal.");
                continue;
            }
            letra = Character.toLowerCase(letra);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'||
                    letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                System.out.println("Es una vocal.");
            } else {
                System.out.println("Es una consonante.");
            }
        }

        scanner.close();
}
}



        
        

    
        
        
                
                                
              
                 
