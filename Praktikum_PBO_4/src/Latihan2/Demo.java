package Latihan2;

public class Demo {
    public static void main (String[] args) {
        
        DefaultModifier dm1 = new DefaultModifier();
        
        dm1.c = 10;

        System.out.println(dm1.a);
        System.out.println(dm1.b);
        System.out.println(dm1.c);

        dm1.jumlah();
    }
}