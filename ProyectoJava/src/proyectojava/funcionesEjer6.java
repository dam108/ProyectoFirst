/*
 * Realiza una función llamada cantidadDivisores al que se le pase como parámetro un número
entero y devuelva el número de divisores o bien cero si el número es negativo. Usa dicha función en
un main.
 */
package proyectojava;

import java.util.Scanner;

/**
 *
 * @author dam107
 */
public class funcionesEjer6 {
     public static void main(String [] args){
         int numero;
         Scanner teclado = new Scanner(System.in);            
         System.out.println("Dime numero: ");
         numero=teclado.nextInt();
         System.out.println("Tiene " + cantidadDivisores(numero) + " divisores");
     }
     public static int cantidadDivisores(int numero){
         int cont=0;
            if(numero<0) return 0;
            else
                for (int i = 1; i <=numero/2; i++) {
                    if(numero%i==0){ 
                        cont++;
                        System.out.println("El numero es divisible por " + i);
                    }
                }
         return cont;
     }
}
