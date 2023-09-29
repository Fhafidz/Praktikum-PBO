package Latihan21;

import Latihan2.DefaultModifier;

public class valo {
    public static void main (String[] args) {
        
        DefaultModifier dm2 = new DefaultModifier();
    
        dm2.c = 10;
    
        System.out.println(dm2.a);
        System.out.println(dm2.b);
        System.out.println(dm2.c);
    
        dm2.jumlah();
    }
}