package BankMe;

public class Nasabah1 {

    String nama = "Fariz Hafidz";
    String no_rekening = "111-222-333";
    double saldo = 10000;
    double totalSaldo;

    double cek_saldo() {
        return saldo;
    }

    void menabung(double jumlahUang) {
        System.out.println("Saldo : " + saldo);
        totalSaldo = saldo + jumlahUang;
        saldo = totalSaldo;
        System.out.println(
            "Menabung sebesar : " + jumlahUang + "\n" + 
            "Saldo sekarang   : " + saldo);
    }

    void menarik(double jumlahUang) {
        System.out.println("Saldo : " + saldo);
        totalSaldo = saldo - jumlahUang;
        saldo = totalSaldo;
        System.out.println(
            "Menarik sebesar : " + jumlahUang + "\n" + 
            "Saldo sekarang   : " + saldo);
    }

    void transfer(double jumlahUang) {
        System.out.println("Saldo : " + saldo);
        totalSaldo = saldo - jumlahUang;
        saldo = totalSaldo;
        System.out.println(
            "Nominal transfer : " + jumlahUang + "\n" + 
            "Saldo sekarang   : " + saldo);     
    } 
}