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
public class HurufR {
    public static void main (String[] args ) {
        int x,y;
    
for (x=1;x <= 8; x++) {
for (y=1 ; y<= 7 ; y++) {
    if ((x==1 && y <7) || (x==4 && y < 7)) {
        System.out.print("#");
        
    
    } else if ((x==2 || x==3) && (y==1 || y == 7)) {
        System.out.print("#");
    } else if (x==5 && (y==1 || y==4)) {
        System.out.print("#");
    } else if (x==6 && (y==1 || y==5)) {
        System.out.print("#");
    } else if (x==7 && (y==1 ||y== 6)) {
        System.out.print("#");
    }else if ( x==8 && (y==1 || y==7)) {
        
    }else{
        System.out.print(" ");
    }
    }
        System.out.println();
             }
     
        }
    }    
    
        
   
   