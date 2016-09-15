/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author Laurent-LIM
 */
public class CorrectionJeuMorpion {

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
    
    public static void saisieEtPlacementCoordonneesJoueur(char[][] tab, char symbole){
        
    }

    public static void main(String[] args) {

        int taille = 3;
        char[][] plateau = new char[taille][taille];

        //initalise le plateau
        for (int l = 0; l < plateau.length; l++) {
            for (int c = 0; c < plateau[l].length; c++) {
                plateau[l][c] = '.';
            }
        }
        
        
        
        
    }

}
