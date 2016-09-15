/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.util;

/**
 *
 * @author admin
 */
public class MathUtil {

    public static Integer carre(int chiffre) {
        int resultat = chiffre * chiffre;
        return resultat;
    }

    public static int genereNombre() {
        double generationNombreVirgule = Math.random() * 100 + 1;
        int nombreEntier = (int) generationNombreVirgule;
        return nombreEntier;
    }

//    public static int genereNombreMinMax(int min, int max) {
//        
//        //renvoi erreur si min>= max
//        if (min >= max) {
//            throw new RuntimeException("Erreur : min >= max");
//        }        
//        int resultat;
//        int nbrTours = 0;
//        boolean validiter = false;
//        
//        do { 
//            nbrTours++;
//            resultat = (int)(Math.random()*(max-min+1)+min);
//            if (resultat > min) {
//                if (resultat < max) {
//                    validiter = true;
//                }
//            } 
//        } while (validiter==false);
//        System.out.println("Nombre de tours de la boucle : "+nbrTours);
//        return resultat ;
//        
//    }
    
    
    public static int genererNombreAleatoire(int min, int max) {
        if (min > max) {
            throw new RuntimeException("Min > Max");
        }
        int res = (int) (Math.random() * (max - min + 1) + min);
        return res;
    }

    
    
    public static int exposant(int nombre, int puissance) {
        if (puissance <= 0) {
            return 1;
        }

        int resultat = nombre;
        while (puissance > 1) {
            resultat = resultat * nombre;
            puissance = puissance - 1;
        }

        return resultat;
    }

    public static int factorielle(int nombre) {
        int resultat = 1;
        int increment = 1;

        if (nombre < 0) {
            throw new RuntimeException("erreur mathématique!!!");
        }

        do {
            resultat = resultat * increment;
            increment++;
        } while (increment <= nombre);

        return resultat;
    }

    public static int factorielleRecursive(int nombre) {

        if (nombre < 0) {
            throw new RuntimeException("erreur mathématique!!!");
        }

        if (nombre <= 1) {
            return 1;
        }

        return nombre * factorielleRecursive(nombre - 1);

    }

}
