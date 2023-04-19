import java.io.*;
class parimpar
  {
   public static void main(String[] args)
     {
      //Entrada
      int[] Numeros = { 3, 9, 4};
      int par = o, impar = 0;

      //Proceso
      int i = 0;
      while (i <= Numeros.length)
        {
         parimpar = numeros[i] % 2;
         if (parimpar == 0)
           {
            par++;
           }//if
         else
           {
            impar++;
           }//else
         i++;
        }//while
       System.out.println("Cantidad de numeros PARES:"+par);
       System.out.println("Cantidad de numeros IMPARES:"+impar); 
      }
}  