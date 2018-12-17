
package Funcionalitats;

/**
 *
 * @author mblan
 */
public class Separador {
    
    public static String[] frase_separada_per_lletres;
    public static Lletra lletra_actual;
    
    public static void Separar(String frase){
        
        frase_separada_per_lletres = frase.split("");
        lletra_actual = SaberLletra.Saber_lletra(frase_separada_per_lletres);
        
    }
    
}
