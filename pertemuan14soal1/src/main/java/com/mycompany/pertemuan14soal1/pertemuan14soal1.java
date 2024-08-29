/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan14soal1;

/**
 *
 * @author iMOp
 */

public class pertemuan14soal1 extends abstrakHewan{
    public void suara() {
        System.out.println("Suara T-rex RAWWRR!!!");
    }
    
    public static void main(String[] args) {
        abstrakHewan objek = new pertemuan14soal1();
        objek.suara();
        objek.suara2();
    }
}
