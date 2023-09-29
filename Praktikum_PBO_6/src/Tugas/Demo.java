package Tugas;

public class Demo {
    public static void main (String[] args) {

        P p1 = new P();
        p1.sisi = 2;
        p1.hitungLuas();
        p1.luas();
        p1.hitungKeliling();
        p1.keliling();

        PP pp1 = new PP();
        pp1.panjang = 2;
        pp1.lebar = 4;
        pp1.hitungLuas();
        pp1.luas();
        pp1.hitungKeliling();
        pp1.keliling();

        ST st1 = new ST();
        st1.alas = 3;
        st1.hitungLuas();
        st1.luas();

        STSK stsk1 = new STSK();
        stsk1.sisiMiring = 5;

        STSS stss1 = new STSS();
        stss1.sisi = 4;
    } 
}