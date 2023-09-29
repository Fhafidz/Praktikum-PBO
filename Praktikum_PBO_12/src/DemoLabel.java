import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.net.URL;

public class DemoLabel {
    public static void main (String[] args) {

        Utama u = new Utama();
        u.setSize(500,500);
        URL img = FrameB.class.getResource("shakehand2.png");
        ImageIcon ikon = new ImageIcon(img);
        JLabel label = new JLabel("Label", ikon, SwingConstants.CENTER);
        JPanel panel = new JPanel();
        panel.add(label);
        u.add(panel);
    }
}