/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

import java.util.*;
/**
 *
 * @author Luis Flores
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        List<Integer> listaNumeros = new ArrayList<Integer>();
        
        int numero=1;
        int acum=0;
        
        try
        {
           while(numero != 0)
        {
          System.out.print("Ingrese un Numero: ");
          numero = leer.nextInt();
          acum += numero;
          if(numero != 0)
          {
            listaNumeros.add(numero);
          }
         
        }
        System.out.println();
        System.out.println("Estadisticas\n");
        System.out.println("El máximo valor es: " + Collections.max(listaNumeros));
        System.out.println("El Minimo valor es: " + Collections.min(listaNumeros));
        System.out.println("La suma total es: " + acum);
        }
        catch(Exception ex)
        {
          System.out.println("Error: Solo se Permiten Numeros Enteros\n" + ex);
        }
       
    }
    
}
