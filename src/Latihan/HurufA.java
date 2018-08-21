/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author Nita
 */
public class HurufA {
    public static void main (String[] args ) {
        int x,y;
        
        for (x=1;x <= 7; x++) {
        for (y=1 ; y<=7; y++) {
            
            if ((x<=1 && y <7) || (x==4 && y < 7)) {
                System.out.print("#");
                
          } else if ((x>=0 || x==3) && (y==1 || y == 7)) {
                System.out.print("#");

                }else{
        System.out.print(" ");
    }
    }
        System.out.println();
        }
        }
}
