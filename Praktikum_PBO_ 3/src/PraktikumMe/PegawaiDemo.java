package PraktikumMe;

public class PegawaiDemo {
    public static void main(String [] args) { 
        Pegawai p1 = new Pegawai();
        p1.namaPegawai("fariz");
        p1.nipPegawai(1001);
        p1.gajiPegawai(50000);
        p1.cetak_info();

        Pegawai p2 = new Pegawai();
        p2.namaPegawai("taufiq");
        p2.nipPegawai(1002);
        p2.gajiPegawai(100000);
        p2.cetak_info();

        Pegawai p3 = new Pegawai();
        p3.namaPegawai("hafidz");
        p3.nipPegawai(1003);
        p3.gajiPegawai(150000);
        p3.cetak_info();

        Pegawai p4 = new Pegawai();
        p4.namaPegawai("ko Budi");
        p4.nipPegawai(1004);
        p4.gajiPegawai(200000);
        p4.cetak_info();

        Pegawai p5 = new Pegawai();
        p5.namaPegawai("Ci Bella");
        p5.nipPegawai(1005);
        p5.gajiPegawai(250000);
        p5.cetak_info();
    }
}