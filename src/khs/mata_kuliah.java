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
public class mata_kuliah {
    private String kode;
    private String nama;
    private double nilaiAngka;

    public mata_kuliah(String kode, String nama, double nilaiAngka) {
        this.kode = kode;
        this.nama = nama;
        this.nilaiAngka = nilaiAngka;
    }

    public String getKode() {
        return kode;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getNilaiAngka() {
        return nilaiAngka;
    }

    public void setNilaiAngka(double nilaiAngka) {
        this.nilaiAngka = nilaiAngka;
    }
    
    public String getNilaiHuruf(){
        if(nilaiAngka >= 85)
            return "A";
        else if(nilaiAngka >= 80)
            return "A-";
        else if(nilaiAngka >= 75)
            return "B+";
        else if(nilaiAngka >= 70)
            return "B";
        else if(nilaiAngka >= 65)
            return "C+";
        else if(nilaiAngka >= 60)
            return "C";
        else if(nilaiAngka >= 55)
            return "D";
        else
            return "E";
    }
    
    
}
