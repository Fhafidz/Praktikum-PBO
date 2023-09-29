package Tugas;

public class Bola extends RuangAbstrak {

    int r = 7;

    public int volume() {
        return (4/3)*(22/7)*r*r*r;
    }

    public int luasPermukaan() {
        return (22/7)*r*r*4;
    }   
}