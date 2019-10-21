/*
    Partiendo de la función del programa anterior, hacer un programa al que se le introduzcan
    dos fechas del mismo año y nos informe de los días comprendidos entre ellas (no usar clases Java
    de fechas)
 */
package proyectojava;

import java.util.Scanner;

public class funcionesEjer4 {
    public static Scanner teclado= new Scanner(System.in);
    public static boolean bisiesto;
    
    public static void main(String[] args) {
    
         int anio, mes, dia, dia2,mes2, unoEnero, diasMaximo, sumaDias=0, cont=1, mesMayor, mesMenor;
           Scanner teclado= new Scanner(System.in);
           
           System.out.println("Introduce año: ");
           anio=teclado.nextInt();
           bisiesto=bisiesto(anio);
   
           mes=PidoMes();
           diasMaximo=diasMes(mes);
           dia=PidoDia(diasMaximo);
           //Me aseguro de que el segundo mes es mayor
           
           do{
              mes2=PidoMes();
           }while(mes2<mes);
           
           diasMaximo=diasMes(mes2);
           dia2=PidoDia(diasMaximo); 
           
           System.out.println("Los dias entre las fechas son: " + sumoMes(mes,mes2,dia,dia2));
         
           
        
    }
    
    public static int sumoMes(int mes1, int mes2, int dia1, int dia2){
        int diasTotales=0;
        if (mes1==mes2) diasTotales=dia2-dia1;
        else if (mes2==(mes1+1)){
            diasTotales=dia2+(diasMes(mes1)-dia1);
        }
        else{
            diasTotales=dia2+(diasMes(mes1)-dia1);
            for (int i = mes1+1; i < mes2; i++) {
               diasTotales+=diasMes(i);  
            }
            
        }
    
    return diasTotales;
    }
    
    public static int PidoMes(){
        int mes;
        do{
                System.out.println("Introduce mes: ");
                mes=teclado.nextInt();
        }while(mes>12 || mes<1);
        return mes;
        }
    
     public static int PidoDia(int diasMaximo){
           int dia;
           do{
                System.out.println("Introduce dia: ");
                dia=teclado.nextInt();
           }while(dia<0 || dia>diasMaximo);
           return dia;
     }
    
    public static boolean bisiesto(int anio){
        if((anio%100!=0 && anio%4==0) || anio%400==0){
           return true;
          }
        else return false; 
      }
     
     public static int diasMes(int mes){
         int diasMes=0;
            if(mes==1 || mes==3|| mes==5||mes==7||mes==8||mes==10||mes==12) diasMes=31;
            else if (mes==11 || mes==9|| mes==6||mes==4) diasMes=30;
            else{
                    if (bisiesto) diasMes=29;
                    else diasMes=28;
                }
         
         return diasMes;
     }
}
