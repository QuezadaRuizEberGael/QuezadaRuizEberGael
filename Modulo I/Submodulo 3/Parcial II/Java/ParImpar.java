import java.io.*;
class parimpar
  {
   public static void main(String[] args)
     {
      int num = 6;
      int parimpar = 0;
      parimpar = num % 2;
      if (parimpar==0)
        {
         System.out.println("par");
        }
      else
        {
         System.out.println("impar");
        }
     }
  }