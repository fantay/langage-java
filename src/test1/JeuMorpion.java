/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.io.IOException;
import static test1.util.ConsoleUtil.lireInt;

/**
 *
 * @author admin
 */
public class JeuMorpion {

//afficher le plateau
    public static void affiche(char[][] p) {
        for (char[] ligneAct : p) {
            for (char elemAct : ligneAct) {
                System.out.print(" " + elemAct);
            }
            System.out.println("");
            System.out.println("");
        }
    }

//remplissage du tableau avec les valeurs par defauts
    public static void remplirPlateau(char[][] plateau) {
        for (int indice1 = 0; indice1 < plateau.length; indice1++) {
            for (int indice2 = 0; indice2 < plateau.length; indice2++) {
                plateau[indice1][indice2] = '*';
            }
        }
    }

//saisie de la ligne
    public static int saisirLigne() throws IOException {
        int ligne = lireInt("Entrez un numéro de ligne : ");
        return ligne;
    }

//saisie de la colonne
    public static int saisirColonne() throws IOException {
        int colonne = lireInt("Entrez un numéro de colonne : ");
        return colonne;
    }

//test joueur
    public static boolean testJoueur(int joueur) {
        return joueur % 2 == 0;
    }

//Main du jeu
    public static void main(String[] args) throws IOException {

        //Definition des variables
        int ligneJoueur;
        int colonneJoueur;
        int joueur = 1;
        char testCase;

        boolean testLigne = false;
        boolean testColonne = false;

        //definition du plateau de jeu
        char[][] plateau = new char[3][3];

        //remplissage du plateau par defaut
        remplirPlateau(plateau);

        // affiche le plateau
        affiche(plateau);

        //Boucle joueur1 impair (O)  et joueur2 pair (X)
        if (testJoueur(joueur) == true) {
            System.out.println("Joueur 2");
        } else {
            System.out.println("Joueur 1");
        }

        //Boucle de verification d occupaton de la case
        do {
            //Boucle validation de la ligne
            do {
                ligneJoueur = saisirLigne();
                if (ligneJoueur >= 1 && ligneJoueur <= 3) {
                    testLigne = true;
                } else {
                    System.out.println("Nombre hors limite");
                }
            } while (testLigne == false);
            //Boucle validation de la colonne
            do {
                colonneJoueur = saisirColonne();
                if (colonneJoueur >= 1 && colonneJoueur <= 3) {
                    testColonne = true;
                } else {
                    System.out.println("Nombre hors limite");
                }
            } while (testColonne == false);

            testCase = plateau[ligneJoueur - 1][colonneJoueur - 1];
            if (testCase != '*') {
                System.out.println("Erreur case déjà occupé");
            }
        } while (testCase != '*');
        
        

        // affiche le plateau
        affiche(plateau);
    }
}
