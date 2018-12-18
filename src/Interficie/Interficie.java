package Interficie;

import java.awt.Image;
import javax.swing.*;

/**
 *
 * @author mblan
 */
public class Interficie extends JFrame {

    public ImageIcon imageIcon;
    
    public Interficie() {

        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Traductor");

        imageIcon = new ImageIcon("1Life miniatura.jpg");
        JLabel label = new JLabel(imageIcon);
        
    }

}
