/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PASnya;

/**
 *
 * @author ArifS
 */
public class PAS_12 {
    public static void main(String[] args){
        int n=20, a, c, e;
        if (n<=2){
            e = 0;
        } else if (n<=5){
            e = 1;
        } else if (n<=7){
            e = 2;
        } else if (n<=10){
            e = 3;
        } else if (n<=12){
            e = 4;
        } else if (n<=15){
            e = 5;
        } else if (n<=20){
            e = 6;
        } else {
            e = 0;
        }
        for (a=0; a<n-e; a++){
            for (c=a+1; c<n; c++){
                System.out.print(" ");
            }
            for (c=-1; c<a; c++){
                System.out.print("*");
            }
            for (c=0; c<a; c++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (a=-1; a<(n-1)-(n-e); a++){
            for (c=a+2; c<n-(n-e); c++){
                System.out.print(" ");
            }
            for (c=a+1; c<n-(n-e); c++){
                System.out.print("*");
            }
            for (c=e+e; c<a+n; c++){
                System.out.print(" ");
            }
            for (c=e; c<a+n+(3-e); c++){
                System.out.print(" ");
            }
            for (c=e-1; c<a+e; c++){
                System.out.print(" ");
            }
            for (c=e-1; c<a+e; c++){
                System.out.print(" ");
            }
            for (c=a+1; c<n-(n-e); c++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
