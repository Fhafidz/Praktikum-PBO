package Tugas.Customer;

public class CustomerDemo {
    public static void main (String[] args) {
    
    CustomerData cd1 = new CustomerData();
    cd1.info();
    
    CustomerData cd2 = new CustomerData("Alif", "Sukoharjo");
    cd2.info();

    CustomerData cd3 = new CustomerData("Budi", "Surakarta", 20);
    cd3.info();

    CustomerData cd4 = new CustomerData("Caca", "KarangAnyar", 12, "Wiraswasta", 15000000);
    cd4.info();

    CustomerData cd5 = new CustomerData("Dedy", "Klaten");
    cd5.info();

    CustomerData cd6 = new CustomerData("ElonMa", "USA", 30);
    cd6.info();

    CustomerData cd7 = new CustomerData("Fariz", "Kudus", 27, "UI/UX Designer", 25000000);
    cd7.info();

    CustomerData cd8 = new CustomerData("Gua", "Sragen");
    cd8.info();

    CustomerData cd9 = new CustomerData("Hafidz", "Jogja", 27);
    cd9.info();

    CustomerData cd10 = new CustomerData("Ikhsan", "Pacitan", 10, "Software Developer", 40000000);
    cd10.info();

    }
}