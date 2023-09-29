package RotiMe;

public class Roti {
    String nama;
    String jenisTepung;
    String beriWarna;
    String beriToping;
    String beriBentuk;
    String info;

    void changeWarna(String warnaRoti) {
        beriWarna = warnaRoti;
    }

    void changeToping(String isiToping) {
        beriToping = isiToping;
    }

    void changeBentuk(String buatBentuk) {
        beriBentuk = buatBentuk;
    }
    void info() {
        System.out.println(
            "Roti   : " + nama + "\n" +
            "Tepung : " + jenisTepung + "\n" +
            "Toping : " + beriToping + "\n" +
            "Warna  : " + beriWarna + "\n" +
            "Bentuk : " + beriBentuk);
    }    
}