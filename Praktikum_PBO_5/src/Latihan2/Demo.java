package Latihan2;

public class Demo {
    public static void main (String[] args) {
        Buku b1 = new Buku ("Ashar","Python");
        Buku b2 = new Buku (2001,2);
        Buku b3 = new Buku ("Zahur","JavaScript");
        Buku b4 = new Buku (2002,3);
        Buku b5 = new Buku (100.000);
        Buku b6 = new Buku ("Hari","C++");
        Buku b7 = new Buku (2003,1);
        Buku b8 = new Buku (150.000);
        Buku b9 = new Buku ("Awan","Java");
        Buku b10 = new Buku (2004,5);

        b1.info();
        b2.info();
        b3.info();
        b4.info();
        b5.info();
        b6.info();
        b7.info();
        b8.info();
        b9.info();
        b10.info();
    } 
}