/*
 Realizar un programa al que se le introduzcan dos números enteros positivos y nos diga cuál
de los dos tiene más divisores (usar función previa)
 */
package proyectojava;

import java.util.Scanner;

/**
 *
 * @author dam107
 */
public class funcionesEjer8 {
     public static void main(String [] args){
         int numero, div1, div2;
         Scanner teclado = new Scanner(System.in);            
         
         System.out.println("Dime numero: ");
         numero=teclado.nextInt();
         
         div1=cantidadDivisores(numero);
         System.out.println("Dime numero: ");
         numero=teclado.nextInt();
         
         div2=cantidadDivisores(numero);
        
         System.out.println("El primer número tiene " + div1 + " divisores");
         System.out.println("El segundo número tiene " + div2 + " divisores");
         
         if(div1!=div2)
             if(div1>div2)System.out.println("El primero tiene mas divisores");
             else System.out.println("El segundo tiene mas divisores");
         else System.out.println("Tienen el mismo numero de divisores");
  
    
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
                    if(numero%i==0)cont++;
                    
                }
         return cont;
     }
}
