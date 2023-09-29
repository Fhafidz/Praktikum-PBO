package NilaiMe;

public class NilaiDemo {
    public static void main (String[] args) {

        Nilai mhs1 = new Nilai();
        mhs1.uts_mahasiswa(90);
        mhs1.uas_mahasiswa(94);
        mhs1.tugas_mahasiswa(85);
        mhs1.nilai_total();
        
        System.out.println("nilai total mahasiswa adalah : " + mhs1.nilai_total());

    } 
}