package Latihan;

import java.util.Scanner;

public class AplikasiLampu {
    public static void main (String[] args) {
        Lampu lampu = new Lampu();
        Scanner sc = new Scanner(System.in);
        lampu.statusLampu = lampu.setSaklar(0);
        System.out.println("Status Lampu = " + lampu.statusLampu + "\nketikkan");
        System.out.println(" 1 untuk menyalakan lampu\n 2 untuk meredupkan lampu \n 0 untuk mematikan lampu");

        int x = sc.nextInt();

        if (lampu.setSaklar(x) == 0) {
            lampu.matikanLampu();

        } else if (lampu.setSaklar(x) == 2) {
            lampu.redupkanLampu();

        } else if (lampu.setSaklar(x) == 1) {
            lampu.hidupkanLampu();
        }
    }
}