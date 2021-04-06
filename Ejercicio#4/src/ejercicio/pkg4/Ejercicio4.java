/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4;

import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Luis Flores
 */
public class Ejercicio4 {

    private static Scanner leer = new Scanner(System.in);
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0,x=0,y=0;
        int Matriz[][] = new int[x][y];
        while(opcion != 5)
        {
         System.out.println("Menu Principal");
         System.out.println("1.Ingrese las Dimensiones de la Matriz");
         System.out.println("2.Ingrese los Datos a la Matriz");
         System.out.println("3.Imprimir la Matriz");
         System.out.println("4.Muestre el numero menor de la matriz");
         System.out.println("5.Salir");
         System.out.print("su opcion: ");
         opcion = leer.nextInt();
         opcion = ValidarOpcion(opcion,1,5);
         
            switch (opcion) 
            {
                case 1:
                    System.out.println("Dimensiones de la Matriz");
                    System.out.print("Numero de Filas: ");
                    x = leer.nextInt();
                    x = ValidarDimension(x);
                    System.out.print("Numero de Columnas: ");
                    y = leer.nextInt();
                    y = ValidarDimension(y);
                break;
                case 2:
                   Matriz = new int[x][y]; 
                   if(Matriz.length > 0)
                   {
                        
                        System.out.println("Ingresae Datos a la Matriz");
                      for(int i=0; i < Matriz.length; i++)
                        {    
                           for(int j=0; j < Matriz[i].length; j++)
                           {
                               System.out.print("Ingrese un numero " + "[" + i + "]" + "[" + j + "]: ");
                               Matriz[i][j] = leer.nextInt();
                           }
                        }
                   }
                   else
                   {
                     System.out.println("por Favor ingrese las Dimensiones de la Matriz");
                   }
                break;
                case 3:
                    System.out.println();
                    if(Matriz.length > 0)
                    {
                       System.out.println("Imprimir la Matriz");
                       for(int i=0; i < Matriz.length; i++)
                       {
                        for(int j=0; j < Matriz[i].length; j++)
                        {
                            System.out.print(" | " + Matriz[i][j]+ " | "); 
                        }      
                         System.out.println();
                       }  
                       
                    }
                    else
                    {
                      System.out.println("por Favor ingrese las Dimensiones de la Matriz");
                    }
                 
                break;
                case 4:
                    int Menor=0;
                    System.out.println();
                    if(Matriz.length > 0)
                    {
                       System.out.println("Numero Menor de la Matriz");
                       for(int i=0; i < Matriz.length; i++)
                       {
                        for(int j=0; j < Matriz[i].length; j++)
                        {
                           if(Menor == 0)
                           {
                              Menor = Matriz[i][j];
                           }
                           else if(Matriz[i][j] < Menor)
                           {
                              Menor = Matriz[i][j];
                           }
                        }      
                       
                       }  
                        System.out.println("El numero menor de la Matriz es: " +  Menor);
                    }
                    else
                    {
                      System.out.println("por Favor ingrese las Dimensiones de la Matriz");
                    }
                    break;
                default:
                    
                    break;
            }
         
        }
    }
 
       private static int ValidarOpcion(int valor,int li,int ls)
    {
       while(valor < li || valor > ls)
       {
           System.out.print("Ingrese una opcion valida entre " + li + " y " + ls + ": ");
           valor = leer.nextInt();
       }
       return valor;
    }
       
     private static int ValidarDimension(int valor)
    {
       while(valor <= 0)
       {
           System.out.print("Ingrese un numero mayor a 0: ");
           valor = leer.nextInt();
       }
       return valor;
    }
    
}
