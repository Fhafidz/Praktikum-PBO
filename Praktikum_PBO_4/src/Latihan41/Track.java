package Latihan41;

import Latihan4.PublicModifier;

public class Track extends PublicModifier {
    public static void main (String[] args) {

        PublicModifier pubm2 = new PublicModifier();

        System.out.println(pubm2.a);
        System.out.println(pubm2.b);
        System.out.println(pubm2.c);

        pubm2.kali();
        pubm2.tambah();
        pubm2.kurang();
        pubm2.bagi();
        pubm2.rata_rata();
    }
}