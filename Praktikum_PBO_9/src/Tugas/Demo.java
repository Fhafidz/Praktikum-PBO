package Tugas;

public class Demo {
    public static void main (String[] args) {

        Balok bk = new Balok();
        System.out.println("Volume Balok = " + bk.getVol());
        System.out.println("Luas Permukaan Balok = " + bk.getLp());

        Kubus ks = new Kubus();
        System.out.println("Volume Kubus = " + ks.getVol());
        System.out.println("Luas Permukaan Kubus = " + ks.getLp());

        Bola ba = new Bola();
        System.out.println("Volume Bola = " + ba.getVol());
        System.out.println("Luas Permukaan Bola = " + ba.getLp());

        Kerucut kt = new Kerucut();
        System.out.println("Volume Kerucut = " + kt.getVol());
        System.out.println("Luas Permukaan Kerucut = " + kt.getLp());

        PrismaSegitiga ps = new PrismaSegitiga();
        System.out.println("Volume PrismaSegitiga = " + ps.getVol());
        System.out.println("Luas Permukaan PrismaSegitiga = " + ps.getLp());
    }
}