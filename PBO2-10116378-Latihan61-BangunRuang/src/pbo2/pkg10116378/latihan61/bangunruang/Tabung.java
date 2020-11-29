/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116378.latihan61.bangunruang;

/**
 Nama  : Sri Utami Ningsih
 *Kelas : PBO2
 *NIM   : 10116378
 *Deskripsi Program : program ini berisi program yang Menghitung Ruang
 * Volume Tabung, Bola dan Kerucut
 */
class Tabung extends BangunRuang {

    @Override
    public double volume() {
        return 3.142857142857143 * jari2 * jari2 * tinggi;
        
    }
    
}