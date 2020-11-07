/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116380.latihan38.oo.lingkaran;

/**
 * @author 
 * Nama  : Zain Achmad Rizqullah
 * Nim   : 10116380
 * Kelas : PBO2
 * Deskripsi Program : program ini tentang perhitungan lingkaran berbasis OO
 */
public class Lingkaran {
     public double r; //jari-jari
    public double L; //luas
    public double K; //keliling

    public double jari2Lingkaran(double diameter) {
        r = diameter / 2;
        return r;
    }

    public double luasLingkaran(double r) {
        L = Math.PI * r * r;
        return L;
    }

    public double kelilingLingkaran(double r) {
        K = 2 * Math.PI * r;
        return K;
    }

}
