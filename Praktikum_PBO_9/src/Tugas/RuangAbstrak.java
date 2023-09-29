package Tugas;

public abstract class RuangAbstrak {

    public abstract int volume();
    public abstract int luasPermukaan();

    public int getVol() {
        return volume();
    }

    public int getLp() {
        return luasPermukaan();
    }
}