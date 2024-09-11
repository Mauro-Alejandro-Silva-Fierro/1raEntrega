
package taller.dos;

import java.util.Scanner;

public class TallerDos {

    public static void main(String[] args) {
          Scanner in = new Scanner (System.in);
        System.out.println(" ingrese la cantidad de llantas que desea comprar");
        int llantas;
        int tot;
        llantas=in.nextInt();
        
        
        if (llantas<=5 );{
        tot=llantas*100;
        
       System.out.print ("debido a que su compra no supera la cantidad de 5 llantas debe pagar 100$ por cada llanta y en total " + tot);
        
      }
        
        
        if (llantas <=10);{
       tot=llantas*75;
    
        System.out.print ("debido a que su compra no supera la cantidad de 10 llantas debe pagar 75$ por cada llanta y en total " + tot);
        
          } 
         if (llantas>= 10); { 
         tot=llantas*50;
         
         System.out.print ("debido a que su compra supera la cantidad de 10 llantas debe pagar 75$ por cada llanta y en total " + tot);
        
      }
           
}
}
