
package Funcionalitats;

import Lletres.Lletra;

/**
 *
 * @author mblan
 */
public class Separador {
    
    public static String[] frase_separada_per_lletres;
    public static Lletra[] frase_traduida;
    
    public static Lletra Separar(String frase){
        
        frase_traduida = new Lletra[frase.length()];
        
        frase = frase.replace(" ", "");
        frase_separada_per_lletres = frase.split("");
        SaberLletra.Saber_lletra(frase_separada_per_lletres);
        
        return lletra_actual;
    }
    
}
