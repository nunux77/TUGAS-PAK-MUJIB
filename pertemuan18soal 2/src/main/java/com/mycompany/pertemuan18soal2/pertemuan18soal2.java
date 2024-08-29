/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan18soal2;

/**
 *
 * @author iMOp
 */
public class pertemuan18soal2 {

    public static void main(String[] args) {
        try { 
         float data= 500 / 15; 
         System.out.println(data); 
        } catch(NullPointerException e) {
         System.out.println(e); 
        }
        
        finally { 
         System.out.println("blok finally akan selalu di eksekusi ");
        }
    }
}
