/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Funcionalitats.Separador;
import Interficie.Interficiebvc;
import Lletres.CreadorDeLletres;
import javax.swing.JOptionPane;

/**
 *
 * @author mblan
 */
public class CodiTraduccióDeCatalàAAltreAlfabet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String frase = JOptionPane.showInputDialog("Escriula frase que vulguis traduir:");
        Separador.Separar(frase);
        
        Interficiebvc i = new Interficiebvc();
        i.setBounds(0,0,1000,500);
        i.setVisible(true);
        i.setResizable(false);
        i.setLocationRelativeTo(null);
        
        CreadorDeLletres c = new CreadorDeLletres();
        c.f();
        
        
    }
    
}
