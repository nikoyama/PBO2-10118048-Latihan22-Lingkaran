/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan22.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menghitung luas dan keliling lingkaran
 */
public class PBO210118048Latihan22PerhitunganLingkaran {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diameter; 
        
        System.out.println("======PERHITUNGAN LINGKARAN======");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        while (!scanner.hasNextInt()) {
            System.out.println("Nilai Diameter Tidak Sesuai");
            System.out.println("");
            System.out.print("Masukan Nilai Diameter Lingkaran : ");
            scanner.next();
        }
        diameter = scanner.nextInt();
        tampilHasil(diameter);
    }
    
    public static void tampilHasil(int diameter) {
        int r = diameter / 2;
        System.out.println("\n=====HASIL PERHITUNGAN LINGKARAN=====");
        System.out.println("Jari-jari Lingkaran = " + r + " cm");
        hitungLuas(r);
        hitungKeliling(r);
    }
    
    public static double hitungLuas(int r) {
        double luas = Math.PI * r * r;
        System.out.printf("Luas Lingkaran = %.2f cm %n", luas);
        return luas;
    }
    
    public static double hitungKeliling(int r) {
        double keliling = 2 * Math.PI * r;
        System.out.printf("Keliling Lingkaran = %.2f cm %n", keliling);
        return keliling;
    }
}