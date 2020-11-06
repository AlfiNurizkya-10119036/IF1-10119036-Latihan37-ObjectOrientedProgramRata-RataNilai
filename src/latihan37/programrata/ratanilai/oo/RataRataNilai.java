/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan37.programrata.ratanilai.oo;

/**
 *
 * @author Alfi Nurizkya
 * NAMA     : ALFI NURIZKYA
 * KELAS    : IF-1
 * NIM      : 10119036
 * DESKRIPSI PROGRAM : Membuat Data Program Rata-Rata Nilai Berbasis Object Oriented
 */

import java.util.Scanner;
public class RataRataNilai {

    static Scanner scan = new Scanner(System.in);
    private static int nilaiMhs[];

    private static int masukkanJumlah(){
        System.out.print("Masukkan banyaknya Mahasiswa : ");
        return scan.nextInt();
    }

    private static void masukkanNilai(){
        int jumlah = masukkanJumlah();
        nilaiMhs = new int[jumlah];
        for(int i = 0; i < jumlah; i++){
            System.out.print("Nilai Mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = scan.nextInt();
        }
    }

    public static void main(String[] args) {
        Latihan37ProgramRataRataNilaiOO nilai = new Latihan37ProgramRataRataNilaiOO();
        masukkanNilai();
        nilai.tampilRataRata(nilaiMhs);
        System.out.println("Developed by : Alfi Nurizkya");
    }
}
