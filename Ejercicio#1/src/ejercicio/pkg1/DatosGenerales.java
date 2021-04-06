/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package ejercicio.pkg1;

/**
 *
 * @author Luis Flores
 */



import java.util.*;  


public class DatosGenerales {

  private String NombreCompleto="";
  private String DNI="";
  private String Direccion="";
  private int Edad=0;
  Scanner leer = new Scanner(System.in);
  private ArrayList<DatosGenerales> NewPerson = new ArrayList<DatosGenerales>();
  
  public DatosGenerales(){}
  
  public DatosGenerales(String nombre,String dni,String direccion ,int edad)
  {
   this.NombreCompleto = nombre;
   this.DNI = dni;
   this.Direccion = direccion;
   this.Edad = edad;
  }

    public static void main(String []args)
    {
    
    }
  
   public void MostrarDatos()
   {
    if(NewPerson.size()>0)
    {
       try
      {   
  
       for(DatosGenerales item : NewPerson)
       {
          System.out.print("| Numero de Identidad: " + item.DNI + " | " +
                           "Nombre: " + item.NombreCompleto + " | " +
                           "Direccion: " + item.Direccion + " | " +
                           "Edad: " + item.Edad + " años |\n\n");
       }
      }
      catch(Exception ex)
      {
         System.out.print("Error: " + ex); 
      }
    }
    else
        System.out.println("La Lista se Encuentra vacia");
     
     
   }
    
  public void IngresarDatosPersonales()
  {        
      try
      {
       System.out.print("**** Datos Generales ****\n");
       System.out.print("Numero de Identidad: ");
       DNI = leer.next();
       System.out.print("Nombre Completo: ");
       NombreCompleto = leer.next();
       System.out.print("Direccion: ");
       Direccion = leer.next();
       System.out.print("Edad: ");
       Edad = leer.nextInt();
       NewPerson.add(new DatosGenerales(NombreCompleto,DNI,Direccion,Edad));
       System.out.println("Datos Guardados con exito...");
      }
      catch(Exception ex)
      {
         System.out.print("Error: " + ex); 
      }
  }
    
  
  public int ValidarOpcion(int valor,int limiteInferior,int limiteSuperior)
  {
  
      while(valor < limiteInferior || valor > limiteSuperior)
      {
       System.out.print("por favor ingrese una opcion Valida entre " + limiteInferior + " y " + limiteSuperior + ".\n");
       System.out.print("Opcion: ");
       valor = leer.nextInt();
      }
      return valor;
  }
    
  
    
}

