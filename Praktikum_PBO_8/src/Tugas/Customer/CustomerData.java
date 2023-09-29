package Tugas.Customer;

public class CustomerData {
    String nama;
    String alamat;
    int tgLahir;
    String pekerjaan;
    int gaji;

    public CustomerData() {
        System.out.println("Hallo Customer yang berbahagia");
    }

    public CustomerData ( String nama ,  String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public CustomerData ( String nama ,  String alamat, int tgLahir) {
        this.nama = nama;
        this.alamat = alamat;
        this.tgLahir = tgLahir;
    }

    public CustomerData ( String nama ,  String alamat, int tgLahir, String pekerjaan, int gaji) {
        this.nama = nama;
        this.alamat = alamat;
        this.tgLahir = tgLahir;
        this.pekerjaan = pekerjaan;
        this.gaji = gaji;
    }

    public void info() {
        System.out.println (
            "Nama : " + nama + "\n" +
            "Alamat : " + alamat + "\n" +
            "Tanggal Lahir : " + tgLahir + "\n" +
            "Pekerjaan : " + pekerjaan + "\n" +
            "Gaji : " + gaji + "\n"
        );
    }
}