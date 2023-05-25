import java.io.*;
class busqueda
  {    
    public static void main(String[] args)
     {
      //declarar variables e introducir informacion
      int a[]= {7,8,-5};
      int e= 0, numB=0, numE=1, j=0;
      //Procesar la informacion es decir, organizar la tabla de multiplicacion
      while(e<3)
       {
        if(numB==a[e])
         {
          numE=1;  
          e=3;    
         }
        else
         {
          j=0;
          e++;
         }
       }
      if(numE==1)
       {
        System.out.print("Numero encontrado");
       }
      else
       {
        System.out.print("Numero NO encontrado");
       }
     }
  }