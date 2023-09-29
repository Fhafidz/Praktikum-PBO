package UniversityMe;

import java.sql.Date;

public class Dosen {

    String nama;
    int nik;
    String pendidikan;
    Date tglLahir;

    void tampilkanNama(String namaDosen){
        nama = namaDosen;
    }
    void tampilkanTglLahir(Date tglLahirDosen){
        tglLahir = tglLahirDosen;
    }
    void tampilkanNIK(int NIKDosen){
        nik = NIKDosen;
    }

}