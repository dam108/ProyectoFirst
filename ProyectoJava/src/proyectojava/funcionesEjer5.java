/*
 * Programa que calcule el factorial de números menores de 100. El programa permite al usuario
meter los números que desee y finalizará cuando meta un número menor que 1 o mayor que 100.
Crea las funciones que consideres útiles y que puedas reutilizar en otros programas.
 */
package proyectojava;

import java.util.Scanner;

/**
 *
 * @author dam107
 */
public class funcionesEjer5{
     public static void main(String [] args){
         int numero, total;
         Scanner teclado = new Scanner(System.in);

         do{
            System.out.println("");
            System.out.println("Factorial del numero: ");
            numero=teclado.nextInt();
            if(numero>=1 && numero<=100) total=calculaFactor(numero);
         }while(numero>=1 && numero<=100);
         System.out.println("Adios!");
     }
     
     public static int calculaFactor(int numero){
        int total=0;

        System.out.println("Factorial de " + numero);
        System.out.println("------------------------------------");
        total=numero; 
        for(int i=numero-1; i>=1;i--){
           System.out.println(total+"X"+i+"="+(total*i));
           total*=i;
        }
        return total;
     }
    
}
