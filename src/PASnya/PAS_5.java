/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PASnya;

import java.util.Scanner;
/**
 *
 * @author ArifS
 */
public class PAS_5 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
            System.out.println("Masukkan angka dalam beberapa detik : ");
        int detik = input.nextInt();
        System.out.println("Hasil Konversi : " + detik + " Detik = " + konversiJam(detik) + " Jam.");
        System.out.println("Hasil Konversi : " + detik + " Detik = " + konversiMenit(detik) + " Menit.");      
    }
    public static int konversiMenit(int detik){
        
        int menit = detik / 60;
        
        return menit;
    }
    public static int konversiJam(int detik){
        int hasil = 0;
        int jam = detik / 3600;
        hasil = hasil + jam;
        return hasil;
    }
    
}
