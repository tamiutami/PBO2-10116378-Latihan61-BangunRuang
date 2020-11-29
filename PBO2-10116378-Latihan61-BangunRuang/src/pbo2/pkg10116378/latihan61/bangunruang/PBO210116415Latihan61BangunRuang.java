/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116378.latihan61.bangunruang;

import java.text.DecimalFormat;

/**
 Nama  : Sri Utami Ningsih
 *Kelas : PBO2
 *NIM   : 10116378
 *Deskripsi Program : program ini berisi program yang Menghitung Ruang
 * Volume Tabung, Bola dan Kerucut
 */
public class PBO210116415Latihan61BangunRuang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bola bola = new Bola();
       bola.setJari2(7);
       Kerucut kerucut = new Kerucut();
       kerucut.setTinggi(9);
       kerucut.setJari2(14);
       Tabung tabung = new Tabung();
       tabung.setJari2(10);
       tabung.setTinggi(21);
       
       DecimalFormat df = new DecimalFormat("#.#");
       System.out.println("Volume Bola    : " + df.format(bola.volume()) + 
                          " cm");
       System.out.println("Volume Kerucut : " + Math.round(kerucut.volume()) +
                          " cm");
       System.out.println("Volume Tabung  : " + Math.round(tabung.volume()) +
                          " cm");
    }
    
}

