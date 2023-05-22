import java.io.*;
class SaludoApp
  {    
    public static void main(String[] args)
     {
      int a[][] = {{5,1,0},
                   {5,2,0},
                   {5,3,0}};
      //int NMtres = 0;
      int suma = 0;
      for(int f = 0; f<a.length; f++)
       {
        for(int c = 0; c<a[f].length; c++)
         {
          //System.out.print(a[f][c] + " ");
          //if(a[f][c] > 3)
             //NMtres++;
          //suma = suma + a[f][c];
          a[f][c] = a[f][c] * a[f][c];
         }//for interno
        //System.out.println();
       }//for externo
      //System.out.print(NMtres);
      for(int f = 0; f<a.length; f++)
       {
        for(int c = 0; c<a[f].length; c++)
         {
          System.out.print(a[f][c] + " ");
         }//for interno
        System.out.println();
       }//for externo
     }//metodo main
  }//clase TablasMultiplicacion