
package taller;

import static java.lang.System.in;
import java.util.Scanner;

public class Taller {
       

    public static void main(String[] args) {
         float desc;
         int com;
         float tot;
        System.out.print("hola, ingrese la cantidad de articulos");
        Scanner in = new Scanner (System.in);
        int cant;
        cant=in.nextInt();
        
        
        if(cant<5){
            com=cant*500;
          desc= (com*10)/100;
          tot=com-desc;
            
          System.out.print("debido a que sus compras no superaron la cantidad de 5 productos su descuento sera del 10% al precio final, el  precio de todas sus compras es de "+tot);
          
        }
        
        if (cant<10);{
         com=cant*500;
          desc= (com*20)/100;
          tot=com-desc;
            
          System.out.print("debido a que sus compras no superaron la cantidad de 10 productos su descuento sera del 20% al precio final, el  precio de todas sus compras es de "+tot);
    }
            
        if (cant>=10);{
         com=cant*500;
          desc= (com*40)/100;
          tot=com-desc;
            
          System.out.print("debido a que sus compras superaron la cantidad de 10 productos su descuento sera del 40% al precio final, el  precio de todas sus compras es de "+tot);
        
    }
        
        
        
     
    }
    
}
