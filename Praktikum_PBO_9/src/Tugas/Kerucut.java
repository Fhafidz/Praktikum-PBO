package Tugas;

public class Kerucut extends RuangAbstrak {

    int r = 7;
    int s = 10;
    int t = 12;

    public int volume() {
        return ((22/7)*r*r*t)/3;
    }

    public int luasPermukaan() {
        return (22/7)*r*(r+s);
    }   
}