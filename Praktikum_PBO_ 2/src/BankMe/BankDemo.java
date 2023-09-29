package BankMe;



public class BankDemo {
    public static void main (String[] args) {
        
        Nasabah1 nsbh1 = new Nasabah1();

        System.out.println(
            "Nama Nasabah adalah : " + nsbh1.nama + "\n" + 
            "Nomor Rekening Nasabah : " + nsbh1.no_rekening);

        nsbh1.menabung(5000);
        nsbh1.menarik(1000);
        nsbh1.transfer(2000);
        
    } 
}