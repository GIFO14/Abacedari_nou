package Funcionalitats;

import Lletres.CreadorDeLletres;
import Lletres.Lletra;

/**
 *
 * @author mblan
 */
public class SaberLletra {

    public static Lletra Saber_lletra(String[] frase_separada_per_lletres) {

        for (int i = 0; i < frase_separada_per_lletres.length; i++){
            
            switch (frase_separada_per_lletres[i]){
                
                case "a": return CreadorDeLletres.a;
                case "b": return CreadorDeLletres.b;
                
            }
            
            if (frase_separada_per_lletres[i].equalsIgnoreCase("a")) {

                return CreadorDeLletres.a;
            
            } else if ()
            
        }

    }

}
