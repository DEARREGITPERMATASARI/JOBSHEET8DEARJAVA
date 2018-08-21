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
public class HURUFL {
    public static void main(String [] args ) {
        
        String identitas = "DEAR REGITA PERMATASARI / X RPL 5 / 11";
         System.out.println("identitas :" +identitas);
         
        int x,y;
        
        for (x=1;x<=6;x++){
            for (y=1;y<=5;y++) {
            if (x==6 || x==0 || y==1 || y==0) {
                System.out.print("@");
            }
            else
                System.out.print(" ");
        
    }
            System.out.println();
        }  
    }
}
