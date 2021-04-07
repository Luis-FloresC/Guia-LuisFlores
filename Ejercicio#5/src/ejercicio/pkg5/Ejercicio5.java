/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;
import java.util.Scanner;
/**
 *
 * @author Luis Flores
 */
public class Ejercicio5 {

    private static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         int opcion=0;
         float base=0,altura=0;
         float lado=0;
         float radio=0;
         
        try
        {
         while(opcion != 5)
        {
         System.out.println("Menu Principal");
         System.out.println("1.Calcular Area del Triangulo");
         System.out.println("2.Calcular Area del Cuadrado");
         System.out.println("3.Calcular Area del Circulo");
         System.out.println("4.Calcular Area del Rectangulo");
         System.out.println("5.Salir");
         System.out.print("su opcion: ");
         opcion = leer.nextInt();
         opcion = ValidarOpcion(opcion,1,5);
         
         
            switch (opcion) {
                case 1:
                    System.out.println("Area de un Triangulo");
                    System.out.print("Base: ");
                    base = leer.nextFloat();
                    System.out.print("Altura: ");
                    altura = leer.nextFloat();
                    System.out.println("El area del Triangulo es: " + CalcularArea(base,altura)/2);
                break;
                case 2:
                    System.out.println("Area de un Cuadrado");
                    System.out.print("Lado: ");
                    lado = leer.nextFloat();
                    System.out.println("El area del Cuadrado es: " + Potencia(lado));
                break;
                case 3:
                    
                    System.out.println("Area de un Cuadrado");
                    System.out.print("Radio: ");
                    radio = leer.nextFloat();
                    System.out.println("El area del Circulo es: " + CalcularAreaCirculo(radio));
                    
                break;
                case 4:
                         
                    System.out.println("Area de un Triangulo");
                    System.out.print("Base: ");
                    base = leer.nextFloat();
                    System.out.print("Altura: ");
                    altura = leer.nextFloat();
                    System.out.println("El area del Rectangulo es: " + CalcularArea(base,altura));
                    
                break;
                default:
                    
                break;
            }
         
        }
        }
        catch(Exception ex)
        {
          System.out.println("Error: " + ex);
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

   private static float CalcularArea(float base,float altura)
   {
      return (base * altura );
   }
   
   private static float CalcularAreaCirculo(float radio)
   {
      return (float) Math.PI * Potencia(radio);
   }
   
    private static float Potencia(float lado)
   {
      return (float) Math.pow(lado,2);
   }
   
}
