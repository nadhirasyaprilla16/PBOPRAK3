/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class TestKoperasi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjam());
       
        int angka;
        String pilih;
    do{
        do{
            System.out.println("==== Menu ====");
            System.out.println("1. Pinjam");
            System.out.println("2. Angsur");
            System.out.println("3. Keluar");
            System.out.println("Pilih : ");
            angka = sc.nextInt();
            
            if(angka == 1){
                System.out.print("Jumlah pinjam : ");
                int pinjam = sc.nextInt(); 
                
                donny.pinjam(pinjam);
                System.out.println("Jumlah pinjaman saat ini: " + donny.getjmlPinjam());
            } else if (angka == 2){
                System.out.print("Jumlah Angsuran: ");
                int angsur = sc.nextInt();
                
                donny.angsur(angsur);
                System.out.println("Jumlah pinjaman saat ini: " + donny.getjmlPinjam());
            }
        } while(angka < 3);
        
        System.out.println("Apakah anda ingin melakukan transaksi lagi? (y/n) ");
        pilih = sc.next();
    } while (pilih.equalsIgnoreCase("y"));
    }
}
  