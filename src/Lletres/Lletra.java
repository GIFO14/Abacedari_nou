
package Lletres;

import javax.swing.JLabel;


/**
 *
 * @author mblan
 */
public class Lletra {
    
    public JLabel forma = new JLabel();
    public int pixels_ample, pixels_alt, posicio_Y;
    
    public Lletra (JLabel forma, int pixels_ample, int pixels_alt, int posicio_Y){
        
        this.forma = forma;
        this.pixels_ample = pixels_ample;
        this.pixels_alt = pixels_alt;
        this.posicio_Y = posicio_Y;
        
    }
    
}
