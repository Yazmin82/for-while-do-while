/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorialdeunnumero;


/**
 *
 * @author alfa
 */import java.util.Scanner;
public class Factorialdeunnumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      // TODO code application logic here
               

   
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa un número entero para calcular su factorial: ");
        int n=leer.nextInt();
        int factorial=1;
        for(int i=1;i<=n; i++){
            factorial=factorial*i;
        }
        System.out.println("El factorial de:"+n+"es:"+factorial);
            
    }
    }


    
       
        
            
            
            
            
            
            
            

            
        
         
         
          
    
    

