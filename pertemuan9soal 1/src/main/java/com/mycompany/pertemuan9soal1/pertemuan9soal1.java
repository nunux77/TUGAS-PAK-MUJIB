/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan9soal1;

/**
 *
 * @author iMOp
 */
public class pertemuan9soal1 {

    public static void main(String[] args) {
        int i = 1;
        
         while (i <= 5) {
            int j = 1;
            
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            
            System.out.println();
            i++;
        }
    }
}
