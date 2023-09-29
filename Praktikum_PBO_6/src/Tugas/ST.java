package Tugas;

public class ST extends BangunDatar {
    
    double alas;
    double tinggi;

    double luas() {

        luas = (1/2) * alas * tinggi ;
        System.out.println("Luas Segitiga : " + luas);
        return luas;
    }
}