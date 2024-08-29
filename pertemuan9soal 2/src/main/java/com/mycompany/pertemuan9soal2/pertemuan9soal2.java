/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan9soal2;

/**
 *
 * @author iMOp
 */
import java.util.Scanner;

public class pertemuan9soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan bilangan awal : ");
        int bilanganAwal = scanner.nextInt();

        System.out.print("Masukan bilangan akhir : ");
        int bilanganAkhir = scanner.nextInt();

        System.out.println("Hasil deret bilangan : ");
        
        while (bilanganAwal < bilanganAkhir) {
            bilanganAwal += 5;
            System.out.print(bilanganAwal + ", ");
        }
    }
}
