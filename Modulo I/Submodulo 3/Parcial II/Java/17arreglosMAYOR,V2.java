import java.io.*;
class Estaturas
  {   
   public static void main(String[] args)     
     {
       float[] listaNumeros= {1.8f, 1.5f, 2.0f, -8.0f, -3.0f, 3.0f, 10.0f};
       float numMayor = 0.0f;       
       for(int i=0; i < listaNumeros.length; i++)
         {
          if (numMayor < listaNumeros[i])
             numMayor = listaNumeros[i];
         }      
       System.out.println(numMayor);    
     }
  }