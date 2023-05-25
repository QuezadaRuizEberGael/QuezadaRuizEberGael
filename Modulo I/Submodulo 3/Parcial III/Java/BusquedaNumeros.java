import java.io.*;
class busqueda
  {    
    public static void main(String[] args)
     {
      //declarar variables e introducir informacion
      int a[][] = {{4,50,-5},
                   {111,8,0},
                   {3,6,230}};
      //Procesar la informacion es decir, organizar la tabla de multiplicacion
      for(int i= 0; i < a.length; i++)
       {
        for(int t =0; t < a[i].length; t++)
         {
          if(a[i][t]>=100)
           {
            System.out.print(a[i][t]+" ");
           }
         }
       }
     }
  }