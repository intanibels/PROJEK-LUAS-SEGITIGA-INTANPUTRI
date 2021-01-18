/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek.luassegitiga;
import java.util.Scanner;
/**
 * 
 * @author Intan
 */
public class Program {
    //deklarasi variabel
    double alas,tinggi,hasil;
    String judul = "Menghitung Luas Segitiga";
    //method nonvoid judul
    String judul(){
        return judul; //agar judul dapat dikirim ke output
    }
    //method void perhitungan
    void perhitungan(){
        //membuat scanner
        Scanner a = new Scanner(System.in);
        //menerima inputan dari user
        System.out.print("Masukkan Panjang Alas Segitiga : ");
        alas = a.nextDouble();
        System.out.print("Masukkan tinggi Segitiga       : ");
        tinggi = a.nextDouble();
    }
    //method nonvoid hasil
    double Hasil(){
        //operasi hitung luas segitiga
        hasil = alas*tinggi/2;
        return hasil; //agar hasil dapat dikirim ke output
    }
}
