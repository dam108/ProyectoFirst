/*
 Un número primo es aquel que solo tiene como divisores el número 1 y a él mismo. Usando
la función del programa anterior, haz un programa que muestre la suma de los números primos
comprendidos entre 1 y 1000.
 */
package proyectojava;

import java.util.Scanner;

/**
 *
 * @author dam107
 */
public class funcionesEjer7 {
     public static void main(String [] args){
         int numero, total;
         Scanner teclado = new Scanner(System.in);            
         System.out.println("Dime numero: ");
         numero=teclado.nextInt();
         
         if(numero!=0){
            total=cantidadDivisores(numero);
  
            if (total>2)  System.out.println("No es primo. Tiene " + total + " divisores");
            else  System.out.println("Es primo. Tiene " + total + " divisores");
         }
         else
             System.out.println("El 0 no es primo");
     }
     public static int cantidadDivisores(int numero){
         //Partimos de la base de que un numero es divisible por uno y por si mismo (Excepto 1). 0 no es primo
            int cont;
            if(numero==0) cont=0;
            else if(numero==1) cont=1;
            else cont=2;
            
            if(numero<0) return 0;
            else
                for (int i = 2; i <=numero/2; i++) {
                    if(numero%i==0){ 
                        cont++;
                        System.out.println("El numero es divisible por " + i);
                    }
                }
         return cont;
     }
}
