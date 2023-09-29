package Tugas;

public class Balok extends RuangAbstrak {

    int p = 2;
    int l = 4;
    int t = 6;

    public int volume() {
        return p*l*t;
    }

    public int luasPermukaan() {
        return 2*((p*l)+(p*t)+(l*t));
    }
}