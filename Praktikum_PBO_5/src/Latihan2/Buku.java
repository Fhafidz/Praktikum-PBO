package Latihan2;

public class Buku {
    String namaPengarang, judulBuku;
    int tahunTerbit, cetakanKe;
    Double hargaJual;

    public Buku (String nama, String judul) {
        this.namaPengarang = nama;
        this.judulBuku = judul;
    }
    
    public Buku (int tahun, int cetak) {
        this.tahunTerbit = tahun;
        this.cetakanKe = cetak;
    }

    public Buku (Double harga) {
        this.hargaJual = harga;
    }

    public void info() {
        System.out.println
        (
            "\nNama Pengarang   : " + namaPengarang + 
            "\nJudul Buku       : " + judulBuku     + 
            "\nTahun Terbit     : " + tahunTerbit   +
            "\nCetakan Ke       : " + cetakanKe     + 
            "\nHarga Jual       : " + hargaJual
        );
    }
}