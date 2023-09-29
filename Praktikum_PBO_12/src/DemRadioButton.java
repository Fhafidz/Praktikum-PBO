import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class DemRadioButton {
    public static void main (String[] args) {
        Utama u = new Utama();
        u.setSize (1000,100);

        JRadioButton[] teams = new JRadioButton[4];
        
        teams [0] = new JRadioButton("Sangat tidak setuju");
        teams [1] = new JRadioButton("Tidak setuju");
        teams [2] = new JRadioButton("Kurang setuju");
        teams [3] = new JRadioButton("Setuju");
        teams [3] = new JRadioButton("sangat setuju");

        JPanel panel = new JPanel();
        JLabel Pernyataan = new JLabel ("Modul Praktikum Pemrograman Berorientasi Objek jelas dan mudah.");
        panel.add(Pernyataan);
        ButtonGroup group = new ButtonGroup();
        for (int i = 0; i<teams.length; i++) {
            group.add(teams[i]);
            panel.add(teams[i]);
        }

        u.add(panel);
        u.setVisible(true);
    }
}