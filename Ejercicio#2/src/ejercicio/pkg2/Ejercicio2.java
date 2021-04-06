/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

import java.util.Scanner;
/**
 *
 * @author Luis Flores
 */
public class Ejercicio2 {

  private static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia=0;
        System.out.println("Ingrese un Dia");
        System.out.print("1.Domingo\n"
                       + "2.Lunes\n"
                       + "3.Martes\n"
                       + "4.Miercoles\n"
                       + "5.Jueves\n"
                       + "6.Viernes\n"
                       + "7.Sabado\n");
        System.out.print("Elija una opcion: ");
        dia = leer.nextInt();
        dia = ValidarDia(dia,1,7);
        
        if(dia > 1 && dia <= 5)
        {
           System.out.println("\nEs un Dia Laboral");
        }
        else
        {
           System.out.println("\nEs un Dia de Descanso");
        }
        
    }
    
    private static int ValidarDia(int valor,int li,int ls)
    {
       while(valor < li || valor > ls)
       {
           System.out.print("Ingrese una opcion valida entre " + li + " y " + ls + ": ");
           valor = leer.nextInt();
       }
       return valor;
    }
    
}
