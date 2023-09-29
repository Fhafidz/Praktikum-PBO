package HewanMe;

public class Hewan {

    String nama;
    int kaki;
    String makan;
    String tipe;
    String info;

    void getNama(String namaHewan) {
        nama = namaHewan;
    }

    void getKaki(int kakiHewan) {
        kaki = kakiHewan;
    }
    
    void getMakanan(String makanHewan) {
        makan = makanHewan;
    }

    void getTipe(String tipeHewan) {
        tipe = tipeHewan;
    }

    void info() {
        System.out.println(
            "Nama Hewan     : " + nama + "\n" +
            "Jumlah Kaki    : " + kaki + "\n" +
            "Makanan        : " + makan + "\n" +
            "Type Hewan     : " + tipe);
    }
}
