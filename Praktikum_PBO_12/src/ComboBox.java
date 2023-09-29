import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ComboBox {
    public static void main (String[] args) {

        Utama u = new Utama();

        JPanel panel = new JPanel();
    
        JComboBox cc = new JComboBox<>(new String[] { "Sangat tidak setuju", "Tidak setuju", "Kurang setuju", "Setuju", "Sangat setuju" });

        JLabel label1 = new JLabel("Modul Praktikum Pemrograman Berorientasi Objek jelas dan mudah");

        panel.add (cc);
        panel.add (label1);
        u.add (panel);
    }
}