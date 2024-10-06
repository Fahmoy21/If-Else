/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Diskon2;
import java.util.Scanner;
public class Diskon2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah barang dan harga satuan
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = scanner.nextInt();

        System.out.print("Masukkan harga satuan barang: Rp ");
        double hargaSatuan = scanner.nextDouble();

        // Menghitung total pembelian
        double totalPembelian = jumlahBarang * hargaSatuan;

        // Menghitung diskon
        double diskon = 0;

        if (totalPembelian < 100000) {
            diskon = 0;
        } else if (totalPembelian >= 100001 && totalPembelian <= 200000) {
            diskon = totalPembelian * 0.05;
        } else if (totalPembelian >= 200001 && totalPembelian <= 300000) {
            diskon = totalPembelian * 0.10;
        } else if (totalPembelian >= 300001 && totalPembelian <= 400000) {
            diskon = totalPembelian * 0.15;
        } else if (totalPembelian >= 400001 && totalPembelian <= 500000) {
            diskon = totalPembelian * 0.20;
        } else {
            diskon = totalPembelian * 0.25;
        }

        // Menghitung pembelian final
        double totalSetelahDiskon = totalPembelian - diskon;

        // Menampilkan hasil
        System.out.println("Total Pembelian: Rp " +totalPembelian);
        System.out.println("Nominal Diskon: Rp " +diskon);
        System.out.println("Pembelian Final: Rp " +totalSetelahDiskon);

        // Input uang yang dibayarkan
        System.out.print("Masukkan uang yang dibayarkan: Rp ");
        double uangDibayarkan = scanner.nextDouble();

        // Menghitung kembalian
        double kembalian = uangDibayarkan - totalSetelahDiskon;

        // Menampilkan kembalian atau "Uang Pas"
        if (kembalian > 0) {
            System.out.printf("Kembalian: Rp " +kembalian);
        } else if (kembalian == 0) {
            System.out.println("Uang Pas");
        } else {
            System.out.println("Uang yang dibayarkan tidak cukup.");
        }

        scanner.close();
    }
}

        
        
    
    

