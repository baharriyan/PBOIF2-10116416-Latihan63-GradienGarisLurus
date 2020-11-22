package pboif2.pkg10116416.latihan63.gradiengarislurus;

/**
 * @author
 * Nama  : Riyan Bahar
 * Kelas : PBOIF2
 * NIM   : 10116416
 * Deskripsi Program : 
 * Program untuk menghitung gradien
 */

//import class
import GarisLurus.Koordinat;

public class PBOIF210116416LatihanGarisLurus {
    public static void main(String[] args) {
        // Garis pertama
        Koordinat k1 = new Koordinat(2,10,5,7);
        System.out.printf("Garis yang melalui titik (%d,%d) dan (%d,%d)\n",k1.getX1(),k1.getY1(),k1.getX2(),k1.getY2());
        System.out.printf("Memiliki gradien sebesar %d\n",k1.hitungGradien());
        
        // Garis kedua
        Koordinat k2 = new Koordinat(5,1,3,12);
        System.out.printf("Garis yang melalui titik (%d,%d) dan (%d,%d)\n",k2.getX1(),k2.getY1(),k2.getX2(),k2.getY2());
        System.out.printf("Memiliki gradien sebesar %d\n",k2.hitungGradien());
    }
}
