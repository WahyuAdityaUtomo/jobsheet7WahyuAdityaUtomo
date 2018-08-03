/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class SaranBahan2Resep {
    public static void main(String[] args) {
        String identitas = "nama lengkap / kelas / no";
        System.out.println("Wahyu Aditya Utomo : "+ identitas);
        
        System.out.println("\nSaran Resep dari Bahan Milik Anda\n");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bahan Pertama: ");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.print("Masukan no pilihan Anda :");
        int bahan1 = scanner.nextInt();
        
        if(bahan1 == 1 || bahan1 == 2)
        {
            System.out.println("Bahan kedua: ");
            if(bahan1 == 1) {
                System.out.println("1. Susu");
                System.out.println("2. Minyak Goreng");
                System.out.println("3. Tidak ada");
            }else{
                System.out.println("1. Minyak Goreng");
                System.out.println("2. Roti");
                System.out.println("3. Tidak ada");
            }
            System.out.print("Masukan no pilihan Anda :");
            int bahan2 = scanner.nextInt();
            
            
        }else
            System.out.println("Mohon Maaf, Pilihan tidak ditemukan, "+ "tidak dapat memberikan saran resep");
        
    }
    
    
}
