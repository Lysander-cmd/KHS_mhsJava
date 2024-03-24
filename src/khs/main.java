/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khs;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukan NIM Mahasiswa : ");
        String nim = input.nextLine();
        System.out.println("Masukan Nama Mahasiswa : ");
        String nama = input.nextLine();
        
        mahasiswa Mahasiswa = new mahasiswa(nim, nama);
        
        System.out.println("Masukan Jumlah Mata Kuliah : ");
        int JumlahMataKuliah = input.nextInt();
        input.nextLine();
        
        mata_kuliah[] matakuliah = new mata_kuliah[JumlahMataKuliah];
        
        for (int i = 0 ; i< JumlahMataKuliah; i++){
            System.out.println("Mata Kuliah "+(i+1));
            System.out.print("Kode MK : ");
            String kode = input.nextLine();
            System.out.print("Nama MK : ");
            String namaMK = input.nextLine();
            System.out.print("Nilai Angka : ");
            int nilai = input.nextInt();
            input.nextLine();
            
            matakuliah[i] = new mata_kuliah(kode, namaMK, nilai);
            
        }
        KHS khs = new KHS(Mahasiswa, matakuliah);
        khs.cetakKHS();
    }
    
}
