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
public class Latihan37ProgramRataRataNilaiOO {

    double rataRata = 0;

    private double hitungRataRata(int[] nilai){
        for(int x : nilai){
            rataRata += x;
        }
        return rataRata = rataRata / nilai.length;
    }

    public void tampilRataRata(int[] nilai){
        hitungRataRata(nilai);
        System.out.println("Rata-rata Nilainya adalah "+rataRata);
    }
}
