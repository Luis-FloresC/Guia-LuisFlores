/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1;

 
import java.util.*;
/**
 *
 * @author Luis Flores
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
  
    public static void main(String[] args) {
        // TODO code application logic here
         
         DatosGenerales Datos = new DatosGenerales();
         int opcion=0;
         Scanner leer = new Scanner(System.in);
         while(opcion != 3)
         {
            System.out.print("Menu Principal\n"
                           + "1.Ingrese Datos Generales\n"
                           + "2.Mostrar Datos\n"
                           + "3.Salir\n"
                           + "ingrese una opcion: ");
            
            opcion = leer.nextInt();
            opcion = Datos.ValidarOpcion(opcion, 1, 3);
            
             switch (opcion) {
                 case 1:
                     Datos.IngresarDatos();
                     break;
                 case 2:
                     Datos.MostrarDatos();
                     break;
                 default:
                     System.out.print("Gracias por usar nuestro programa\n");
                     break;
             }
         }
        
       
    }
    
}
