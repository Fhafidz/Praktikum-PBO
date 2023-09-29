package Tugas;

public class P extends BangunDatar {

    double sisi;

    double luas() {

        luas = sisi * sisi;
        System.out.println("Luas Persegi : " + luas);
        return luas;
    }

    double keliling() {

        keliling = 4 * sisi;
        System.out.println("Keliling Persegi : " + luas);
        return keliling;
    }
}