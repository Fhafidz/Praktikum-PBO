package Latihan1;

public class Demo {
    public static void main (String[] args) {
        
        PrivateModifier pm1 = new PrivateModifier();
        pm1.nama = "GG";
        pm1.umur = 20;

        System.out.println(pm1.nama);
        System.out.println(pm1.umur);
    } 
}