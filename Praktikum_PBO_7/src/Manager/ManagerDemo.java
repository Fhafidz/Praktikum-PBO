package Manager;

public class ManagerDemo {
    public static void main(String[] args) {

        Manager m1 = new Manager();
        m1.setNama ("Alif");
        m1.setGaji (3000000);
        m1.setUsia (30);
        m1.setJamKerja(8.5f);
        m1.info();

        Manager m2 = new Manager();
        m2.setNama ("Budi");
        m2.setGaji (3100000);
        m2.setUsia (31);
        m2.setJamKerja(8.5f);
        m2.info();

        Manager m3 = new Manager();
        m3.setNama ("Caca");
        m3.setGaji (2500000);
        m3.setUsia (25);
        m3.setJamKerja(8.5f);
        m3.info();

        Manager m4 = new Manager();
        m4.setNama ("Daryan");
        m4.setGaji (2800000);
        m4.setUsia (28);
        m4.setJamKerja(8.5f);
        m4.info();

        Manager m5 = new Manager();
        m5.setNama ("ElonMa");
        m5.setGaji (4000000);
        m5.setUsia (40);
        m5.setJamKerja(8.5f);
        m5.info();
    }
}