/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khs;

/**
 *
 * @author USER
 */
public class KHS {

    private mahasiswa mahasiswa;
    private mata_kuliah[] matakuliah;
    
    
    public KHS(mahasiswa mahasiswa, mata_kuliah[] matakuliah) {
        this.mahasiswa = mahasiswa;
        this.matakuliah = matakuliah;
    }
    
    public void cetakKHS(){
        System.out.println(" ");
        System.out.println("========== Kartu Hasil Studi ==========");
        System.out.println("Data Mahasiswa : ");
        System.out.println("NIM : "+mahasiswa.getNIM());
        System.out.println("Nama Mahasiswa : "+mahasiswa.getNama());
        System.out.println("Mata Kuliah:");
        System.out.println("| Kode     | Nama Mata Kuliah           | Nilai |");
        System.out.println("+----------+----------------------------+-------+");
        for (mata_kuliah mk : matakuliah) {
            System.out.printf("| %-8s | %-26s | %-5s |%n", mk.getKode(), mk.getNama(), mk.getNilaiHuruf());
        }
        System.out.println("+----------+----------------------------+-------+");
    }
}
