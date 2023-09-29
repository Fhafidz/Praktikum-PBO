import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class ChangeBackground {
    public static void main (String[] args) {

        Utama u = new Utama();
        JPanel panel = new JPanel();
        JLabel label1 = new JLabel ("Ubah Warna");      
        JComboBox jcombobox1 = new JComboBox<>(new String[] { "Merah", "Kuning", "Hijau"});
        jcombobox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (jcombobox1.getSelectedItem( )== "Merah") {
                    panel.setBackground(new java.awt.Color(192, 57, 43));

                } else if (jcombobox1.getSelectedItem() == "Kuning") {
                    panel.setBackground(new java.awt.Color(241, 196, 15));

                } else if (jcombobox1.getSelectedItem() == "Hijau") {
                    panel.setBackground(new java.awt.Color(39, 174, 96));
                };
            }
        });

        panel.add (jcombobox1);
        panel.add (label1);
        u.add (panel);

    }
}