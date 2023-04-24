import java.io.*;
class MayorQueCinco
  {
   public static void main(String[] mil)
     {
      int[] listaNumeros = {15, 93, 2, 10};
      int contar = 0;
      for(int i = 0; i < listaNumeros.length; i++)
        {
         if(contar > listaNumeros[i])
           {
            contar=contar;
           }
         else
           {
            contar=listaNumeros[i];
           }
        }
      System.out.println(contar);
     }  
  }