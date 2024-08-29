/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan16soal2;

/**
 *
 * @author iMOp
 */
import kalkulatorPack.Kalkulator;

public class pertemuan16soal2 {

    public static void main(String[] args) {
        Kalkulator kalkulator = new Kalkulator();
        
        double tambah = kalkulator.getTambah(9.5, 2.5);
        System.out.println(tambah);
             
        double kurang = kalkulator.getKurang(9.5, 2.5);
        System.out.println(kurang);
        
        double bagi = kalkulator.getBagi(9.5, 2.5);
        System.out.println(bagi);
        
        double kali = kalkulator.getKali(9.5, 2.5);
        System.out.println(kali);
    }
}
