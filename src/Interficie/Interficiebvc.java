package Interficie;

import java.awt.Image;
import javax.swing.*;

/**
 *
 * @author mblan
 */
public class Interficiebvc extends JFrame {

    public ImageIcon imageIcon;
    
    public Interficiebvc() {

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Timer");

        imageIcon = new ImageIcon("1Life miniatura.jpg");
        JLabel label = new JLabel(imageIcon);
        
    }

}
