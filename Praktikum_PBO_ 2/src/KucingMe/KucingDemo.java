package KucingMe;
public class KucingDemo {
    public static void main (String[] args) {

        Kucing kucing = new Kucing();
        kucing.nama = "Bambul";
        kucing.usia = 1.5;
        kucing.warnaBulu = "Abu-abu";

        System.out.println(
            "Nama kucing : " + kucing.nama + "\n" +
            "Warna bulu : " + kucing.warnaBulu
        );

        System.out.println(kucing.umur());
        kucing.meong(); 
    }
}