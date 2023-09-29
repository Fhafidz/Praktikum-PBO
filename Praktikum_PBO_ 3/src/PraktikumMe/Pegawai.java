package PraktikumMe;

public class Pegawai {
    String nama;
    int nip;
    double gaji;
    String info;

    public String namaPegawai (String username) {
        return this.nama = username;
    }

    public int nipPegawai (int nomorPegawai) {
        return this.nip = nomorPegawai;
    }

    public double gajiPegawai(double uangPegawai) {
        return this.gaji = uangPegawai;
    }

    public void cetak_info() {
        System.out.println(
            "\n" +  "Nama Pegawai   : " + nama + "\n" +
                    "NIP Pegawai    : " + nip + "\n" +
                    "Gaji Pegawai   : " + gaji
        );
    }
}