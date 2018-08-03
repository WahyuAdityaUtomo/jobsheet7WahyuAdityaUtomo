/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet7;
import java.util.Scanner;
public class KarcisParkir {
    public static void main(String[] args) {
        System.out.println("Masukan jenis 1 jika kendaraan = sepeda");
        System.out.println("Masukan jenis 2 jika kendaraan = mobil");
        System.out.println("Masukan jenis 3 jika kendaraan = motor");
        
        System.out.println("Masukan jenis kendaraan: ");
        
        Scanner baca = new Scanner(System.in);
        int jenis = baca.nextInt();
        
        if(jenis == 1) {
            System.out.println("Harga = Rp.3000");
        }else if (jenis == 2) {
            System.out.println("Harga = Rp.7000");
        }else if (jenis == 3) {
            System.out.println("Harga = Rp.5000");
        }
    }
    
}
