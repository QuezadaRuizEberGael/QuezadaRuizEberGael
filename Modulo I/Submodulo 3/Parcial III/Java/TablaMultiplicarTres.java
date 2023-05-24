import java.io.*;
class TABLAMULTIPLICARTRES
  {    
    public static void main(String[] args)
     {
      //declarar variables e introducir informacion
      int a[][] = {{3,1,0},
                   {3,2,0},
                   {3,3,0},
                   {3,4,0},
                   {3,15,0}};
      //Procesar la informacion es decir, organizar la tabla de multiplicacion
      for(int i= 0; i < a.length; i++)
       {
        for(int t =0; t < a[i].length; t++)
         {
          a[i][2]= a[i][0] * a[i][1];
          if(t==2)
           {
            System.out.print("= ");
           }
          else if(t==1) {
           System.out.print("* ");
           }
          System.out.print(a[i][t]+" ");
         }
        System.out.println();
       }
     }
  }