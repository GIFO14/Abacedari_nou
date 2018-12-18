/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Funcionalitats.Separador;
import Interficie.Interficie;
import Lletres.CreadorDeLletres;
import Lletres.Lletra;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author mblan
 */
public class CodiTraduccióDeCatalàAAltreAlfabet {

    private static Lletra frase_traduida[];
    private static int posicio_X = 0;

    public static void main(String[] args) {

        //Pregunta quina frase s'ha de traduir i la tradueix
        String frase = JOptionPane.showInputDialog("Escriu la frase que vulguis traduir:");
        frase_traduida = Separador.Separar(frase);

        //Crea la interfície gràfica
        Interficie i = new Interficie();
        i.setSize(1280, 500);
        i.setVisible(true);
        i.setResizable(false);

        //Personalitza el fondo i posiciona les lletres al seu lloc
        JLabel background;
        ImageIcon img = new ImageIcon("Imatges/blue-bulbs-idea-91413.jpg");
        background = new JLabel("", img, JLabel.CENTER);
        background.setBounds(0, 0, 1000, 500);
        i.add(background);

        i.setLocationRelativeTo(null);

        for (int j = 0; j < frase_traduida.length; j++) {

            if (posicio_X + frase_traduida[j].pixels_ample <= 1280) {
                
                JLabel forma_lletra_traduida = frase_traduida[j].forma;
                forma_lletra_traduida.setBounds(posicio_X, frase_traduida[j].posicio_Y, frase_traduida[j].pixels_ample, frase_traduida[j].pixels_alt);
                i.add(forma_lletra_traduida);

                posicio_X += 15;
                
            }

        }
    }

}
