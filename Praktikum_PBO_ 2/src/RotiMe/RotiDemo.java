package RotiMe;

public class RotiDemo {
    public static void main (String[] args) {

        Roti roti1 = new Roti();
        roti1.nama = "Bolu";
        roti1.jenisTepung = "Terigu";
        roti1.changeToping("keju");
        roti1.changeWarna("hijau");
        roti1.changeBentuk("balok");
        roti1.info();

        Roti roti2 = new Roti();
        roti2.nama = "Tawar";
        roti2.jenisTepung = "Gandum";
        roti2.changeToping("kismis");
        roti2.changeWarna("coklat");
		roti2.changeBentuk("kubus");
        roti2.info();

        Roti roti3 = new Roti();
        roti3.nama = "Donat";
        roti3.jenisTepung = "Terigu";
        roti3.changeToping("mesis");
        roti3.changeWarna("kuning");
        roti3.changeBentuk("cincin");
        roti3.info();

    }
}