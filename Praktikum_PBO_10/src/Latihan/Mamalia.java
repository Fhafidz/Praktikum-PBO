package Latihan;

public class Mamalia implements ActivityAnimal {
    
    public void eat() {
        System.out.println("Mammal eats");
    }

    public void travel() {
        System.out.println("Mammal travels");
    }

    public int noOfLegs() {
        return 0;
    }

    public static void main(String[] args) {
        Mamalia m = new Mamalia();
        m.eat();
        m.travel();
    }
}