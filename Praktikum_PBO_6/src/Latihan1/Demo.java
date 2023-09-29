package Latihan1;

public class Demo{
    public static void main (String[] args) {
        Mobil m1 = new Mobil();
        System.out.println(
            "Merek Mobil    : " + m1.merk        + "\n" +
            "Roda           : " + m1.penggerak   + " roda"  + "\n" +
            "Model          : " + m1.pintu       + " pintu" + "\n" +
            "Mesin          : " + m1.mesin       + " mesin" + "\n" +
            "Warna          : " + m1.warna
            );

        Pesawat p1 = new Pesawat();
        System.out.println(
            "\nMerek Pesawat  : " + p1.jenis     + "\n" +
            "Roda           : " + p1.penggerak   + " roda"  + "\n" +
            "Model          : " + p1.pintu       + " pintu" + "\n" +
            "Mesin          : " + p1.mesin       + " mesin" + "\n" +
            "Warna          : " + p1.warna
            );
    }
}