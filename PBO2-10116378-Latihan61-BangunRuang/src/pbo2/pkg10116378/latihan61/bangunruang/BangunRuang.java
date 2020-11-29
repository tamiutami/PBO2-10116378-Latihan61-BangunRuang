/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116378.latihan61.bangunruang;

/**
 *Nama  : Sri Utami Ningsih
 *Kelas : PBO2
 *NIM   : 10116378
 *Deskripsi Program : program ini berisi program yang Menghitung Ruang
 * Volume Tabung, Bola dan Kerucut
 */
public abstract class BangunRuang {

    public double jari2;
    public double tinggi;

    public double getJari2() {
        return jari2;
    }

    public void setJari2(double jari2) {
        this.jari2 = jari2;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public abstract double volume();

}