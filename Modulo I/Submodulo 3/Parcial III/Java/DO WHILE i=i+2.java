import java.io.*;
class clase
  {    
    public static void main(String[] args)
     {
      //declarar variables e introducir informacion
      int a[] = {-3,1,-25,5,300};
      int i = 0;
      //Procesar la informacion es decir, organizar la tabla de multiplicacion
      do{
        System.out.println(a[i]);
        i=i+2;
       }while(i<a.length);
     }
  }