package Tugas;

public class PP extends BangunDatar {
    
    int panjang;
    double lebar;

    double luas() {

        luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang : " + luas);
        return luas;
    }

    double keliling() {

        keliling = 2 * (panjang + lebar);
        System.out.println("Keliling Persegi Panjang : " + luas);
        return keliling;
    }
}