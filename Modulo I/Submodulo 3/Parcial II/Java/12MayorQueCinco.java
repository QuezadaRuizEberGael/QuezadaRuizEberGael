import java.io.*;
class MayorQueCinco
  {
   public static void main(String[] mil)
     {
      int[] listaNumeros = {15, 3, 2, 10};
      int contar = 0;
      for(int i = 0; i < listaNumeros.length; i++)
        {
         if(listaNumeros[i] > 5)
           {
            contar++;
           }
        }
      System.out.println(contar);
     }  
  }