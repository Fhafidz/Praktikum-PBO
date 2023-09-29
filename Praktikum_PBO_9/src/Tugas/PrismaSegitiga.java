package Tugas;

public class PrismaSegitiga extends RuangAbstrak {

    int ab = 4; // Panjang rusuk alas prisma segitiga
    int bc = 3; // Panjang rusuk alas prisma segitiga
    int ac = 5; // Panjang rusuk alas prisma segitiga
    int t = 8; // Tinggi prisma segitiga

    public int volume() {
        return (bc*ab*t)/2;
    }

    public int luasPermukaan() {
        return 2*((bc*ab)/2) + ((ab+bc+ac)*8) ;
    }
}