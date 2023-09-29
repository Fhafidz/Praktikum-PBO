package Manager;

import Karyawan.Karyawan;

public class Manager extends Karyawan {
    private float jamKerja = 7.5f;

    public float getjamKerja() {
        return jamKerja;
    }

    public float getGajiManager () {
        return getGaji()*2;
    }

    public void setJamKerja (float jamKerja) {
        this.jamKerja = jamKerja;
    }

    public void info() {
        System.out.println (
            "Nama : " + getNama() + "\n" +
            "Gaji : " + getGajiManager() + "\n" +
            "Usia : " + getUsia() + "\n" +
            "Nama : " + getjamKerja() + "\n"
            );
    }
}