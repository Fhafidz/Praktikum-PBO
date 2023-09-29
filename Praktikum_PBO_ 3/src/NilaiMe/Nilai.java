package NilaiMe;

public class Nilai {
    int nilaiUTS;
    int nilaiUAS;
    int nilaiTugas;
    double nilaiTotal;

    public void uts_mahasiswa (int nilaiuts) {
        nilaiUTS = nilaiuts;
    }
    
    public void uas_mahasiswa (int nilaiuas) {
        nilaiUAS = nilaiuas;
    }

    public void tugas_mahasiswa (int nilaitugas) {
        nilaiTugas = nilaitugas;
    }

    public double nilai_total () {
        nilaiTotal = (nilaiUTS + nilaiUAS + nilaiTugas)/3;
        return nilaiTotal;  
    }
}