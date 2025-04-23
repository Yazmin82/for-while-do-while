/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package conteodenumeros;
import java.util.Scanner;


/**
 *
 * @author alfa
 */
public class Conteodenumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
                Scanner Scanner = new Scanner(System.in)) {
            System.out.print("¿Cuántos números quieres ingresar? ");
            int cantidad = Scanner.nextInt();
            int mayoresQueCero = 0;
            int menoresQueCero = 0;
            int igualesACero = 0;
            for (int i = 1; i <= cantidad; i++) {
                System.out.print("Ingresa el número " + i + ": ");
                int numero = Scanner.nextInt();
                if (numero > 0) {
                    mayoresQueCero++;
                } else if (numero < 0) {
                    menoresQueCero++;
                } else {
                    igualesACero++;
                }
            }
            System.out.println("Cantidad de números mayores que 0: " + mayoresQueCero);
            System.out.println("Cantidad de números menores que 0: " + menoresQueCero);
            System.out.println("Cantidad de números iguales a 0: " + igualesACero);
        }
        
    }
    
}
