package Tugas;

public class Laptop {

    String namaLP, jenisLP;
    int ramLP, ssdLP;

    public Laptop () {
        System.out.println("Ini adalah Laptop : ");
    }

    public Laptop (String nama, String jenis, int ram, int simpan) {
        this.namaLP = nama;
        this.jenisLP = jenis;
        this.ramLP = ram;
        this.ssdLP = simpan;
    }

    public void info() {
        System.out.println 
        (
            "Merk Laptop  : " + namaLP    + 
            "\nJenis Laptop : " + jenisLP   +
            "\nRAM          : " + ramLP     + "GB" +
            "\nSSD          : " + ssdLP     + "GB"
        );
    }
}