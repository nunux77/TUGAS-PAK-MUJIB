/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan8soal1;

/**
 *
 * @author iMOp
 */
import java.util.Scanner;

public class pertemuan8soal1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nilai Awal ?: ");
        int nilaiAwal = scanner.nextInt();

        System.out.print("Nilai Akhir ?: ");
        int nilaiAkhir = scanner.nextInt();

        System.out.println("Hasil nya : ");

        int count = 1;
        for (int i = nilaiAwal; i <= nilaiAkhir; i += 5) {
            System.out.println(count + ". " + i);
            count++;
        }
    }
}
