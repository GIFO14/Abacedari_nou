package Lletres;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author mblan
 */
public class CreadorDeLletres {

    private static JLabel imatge_a;
    public static Lletra a, b, c, d, e, f, g, h, i, j, k, l, m, ñ, n, o, p, q, r, s, t, u, v, w, x, y, z;
    
    public static void CrearLletres() {
        
        imatge_a.setIcon(new ImageIcon("Imatges/ImatgeD'exemple.png"));
        a = new Lletra(imatge_a, 0, 0);
        
        imatge_a.setIcon(new ImageIcon("Imatges/ImatgeD'exemple.png"));
        b = new Lletra(imatge_a, 0, 0);
        
    }
    
    public void f(){
        JOptionPane.showMessageDialog(null, imatge_a);
    }

}
