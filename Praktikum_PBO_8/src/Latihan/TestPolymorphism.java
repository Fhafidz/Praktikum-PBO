package Latihan;

public class TestPolymorphism {
    public static void main (String[] args) {
        
        Kucing k1 = new Kucing();
        k1.beriNama("TOM");
        System.out.println(k1.panggilNama());
        System.out.println(k1.perilaku());
        k1.suara();

        Anjing a1 = new Anjing();
        a1.beriNama("BULL");
        System.out.println(a1.panggilNama());
        System.out.println(a1.perilaku());
        a1.suara();
    }
}