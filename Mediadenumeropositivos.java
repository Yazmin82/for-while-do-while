/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meddenumeros;

/**
 *
 * @author alfa
 */import java.util.Scanner;
public class Meddenumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Scanner = new Scanner(System.in);
     
        int numero;
        int suma = 0;
        int cantidad = 0;

        System.out.println("Ingresa numeros positivos (un negativo para terminar):");

        while (true) {
            numero = Scanner.nextInt();
            if (numero < 0) { 
                break;
}
            suma = suma + numero;
            cantidad = cantidad + 1;
}
        if (cantidad > 0) {
            double media = (double) suma / cantidad;

            System.out.println("La media es: " + media);

        } else {

            System.out.println("No ingresaste ningun numero positivo.");
}
        Scanner.close();

    }
    
}

