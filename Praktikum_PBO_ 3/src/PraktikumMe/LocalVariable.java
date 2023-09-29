package PraktikumMe;

public class LocalVariable{
    
    int umur = 20;

    public void hitungUsia() {
        
        int tahunSekarang = 2019;
        int tahunLahir = 1993;

        umur = tahunSekarang - tahunLahir;

        System.out.println("Usia saya : " + umur);
    }

    public void beratBadan() {
        int beratLahir = 3;
        int beratBadan;

        beratBadan = beratLahir + (umur/2);

        System.out.println(beratBadan);
    }
}