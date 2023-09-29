package HewanMe;

public class HewanDemo {
    public static void main (String[] args) {

        Hewan hewan1 = new Hewan();
        hewan1.getNama("Harimau");
        hewan1.getKaki(4);
        hewan1.getMakanan("Daging");
        hewan1.getTipe("Karnivora");
        hewan1.info();

        Hewan hewan2 = new Hewan();
        hewan2.getNama("Kerbau");
        hewan2.getKaki(4);
        hewan2.getMakanan("Rumput");
        hewan2.getTipe("Herbivora");
        hewan2.info();
        
    }  
    
}
