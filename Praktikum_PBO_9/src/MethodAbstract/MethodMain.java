package MethodAbstract;

public class MethodMain {
    public static void main(String[] args) {
        
        Persegi psg = new Persegi();
        System.out.println("Keliling Persegi = " + psg.getKell());
        System.out.println("Luas Persegi = " + psg.getLuas());

        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("Keliling Persegi Panjang = " + pp.getKell());
        System.out.println("Luas Persegi Panjang = " + pp.getLuas());

        JajarGenjang jg = new JajarGenjang();
        System.out.println("Keliling Jajargenjang = " + jg.getKell());
        System.out.println("Luas Jajargenjang = " + jg.getLuas());

        Lingkaran lg = new Lingkaran();
        System.out.println("Keliling Lingkaran = " + lg.getKell());
        System.out.println("Luas Lingakaran = " + lg.getLuas());

        Segitiga sg = new Segitiga();
        System.out.println("Keliling Segitiga = " + sg.getKell());
        System.out.println("Luas Segitiga = " + sg.getLuas());
    }   
}