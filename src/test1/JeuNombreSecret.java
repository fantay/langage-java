/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import test1.util.ConsoleUtil;
import static test1.util.ConsoleUtil.lireTexte;
import test1.util.MathUtil;

/**
 *
 * @author admin
 */
public class JeuNombreSecret {

    public static void main(String[] args) throws IOException {
       
        String minString = ConsoleUtil.lireTexte("Entrez un minimum : ");
        String maxString = ConsoleUtil.lireTexte("Entrez un maximum : ");
        
        int min = Integer.valueOf(minString);
        int max = Integer.valueOf(maxString);
        int nombreSecret = MathUtil.genererNombreAleatoire(min, max);
        int essais = 0;
        int nombreSaisieConvertie;
        String appreciation = "";

        System.out.println(nombreSecret + "\n");

        do {

            System.out.println("\n Essai n° : " + (essais + 1));

            String nombreSaisie = lireTexte("Entrer un nombre : ");
            nombreSaisieConvertie = Integer.valueOf(nombreSaisie);

            essais = essais + 1;

            if (nombreSaisieConvertie < nombreSecret) {
                System.out.println("\n le nombre cherché est plus grand");
            } else if (nombreSaisieConvertie > nombreSecret) {
                System.out.println("\n le nombre cherché est plus petit");
            }

        } while (nombreSaisieConvertie != nombreSecret);

        if (essais < 3) {

            appreciation = "GENIAL!!!";

        } else if (essais < 6) {

            appreciation = "SUPER!!!";

        } else if (essais < 9) {

            appreciation = "COOL!!!";

        } else if (essais < 12) {

            appreciation = "PAS MAL!!!";

        } else {

            appreciation = "NUL!!!";

        }

        System.out.println(appreciation + " vous avez mis " + essais + " essais");
        
    }

}
