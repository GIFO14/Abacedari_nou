
package Lletres;

import javax.swing.JLabel;


/**
 *
 * @author mblan
 */
public class Lletra {
    
    public JLabel forma = new JLabel();
    public double posicio_X;
    public double posicio_Y;
    
    public Lletra (JLabel forma, double posicio_X, double posicio_Y){
        
        this.forma = forma;
        this.posicio_X = posicio_X;
        this.posicio_Y = posicio_Y;
        
    }
    
}
