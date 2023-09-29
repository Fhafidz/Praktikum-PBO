package Tugas;

public class Kubus extends RuangAbstrak {

    int r = 2;

    public int volume() {
        return r*r*r;
    }

    public int luasPermukaan() {
        return 6*r*r;
    }   
}