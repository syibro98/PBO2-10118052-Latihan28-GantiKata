/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118052.latihan28.gantikata;

import java.util.Scanner;
/**
 * @author 
 * NAMA      : Bagus Syibro Malisi
 * KELAS     : PBO2
 * NIM       : 10118052
 * Deskripsi Program : Program ini bertujuan untuk menggati kata dari yang kita
 * masukkan 
 * 
 */
public class PBO210118052Latihan28GantiKata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // scanner
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("======= Program Ganti Kaata =======");
        System.out.println();
        System.out.print("Masukan Kalimat : ");
        
        // ambil kalimat
        String kalimat = scanner.nextLine();
        
        // ambil kata yang di cari
        System.out.print("Ganti Kata : ");
        
        String find = scanner.next();
        
        System.out.print("Menjadi Kata : ");
        
        // ambil kata untuk pengganti yang di cari
        String replace = scanner.next();
        
        // menampilkan hasil
        System.out.println();
        System.out.println("====== Hasil Formatting ======");
        System.out.println("Kalimat awal : " + kalimat);
        System.out.println("Kalimat baru : " + kalimat.replace(find, replace));
    }
    
}
