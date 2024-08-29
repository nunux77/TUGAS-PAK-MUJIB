/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuan10ssoal1;

/**
 *
 * @author PC RPL - R1
 */
public class pertemuan10soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int a=5, b=3;
        
        aritmatika1 aritmatika1 = new aritmatika1();
        
        aritmatika1.setPertambahan(a, b);
        System.out.println("Bilangan 1 = " + a);
        System.out.println("Bilangan 2 = " + b);
        System.out.println("Hasil Pertambahan " + aritmatika1.getAngka());
    }
}