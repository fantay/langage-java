/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.classes;

/**
 *
 * @author Laurent-LIM
 */
public class Acteur {
    
    //variable de la classe acteur   
    private String nom;
    private String prenom;
    private static int nbrActeur;

    public Acteur() {
        nbrActeur++;
    }
 
    /*constructeur de la classe avec les parametres*/
    public Acteur(String nom, String prenom) {
        this();
        this.nom = nom;
        this.prenom = prenom;
    }
    
    //getter de la classe 
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public static int getNbrActeur() {
        return nbrActeur;
    }
    
    /* affichage des donnees de la 
    classe acteur par le toString */

    @Override
    public String toString() {
        return "Nom de l'acteur :"+nom+"\nPrénom de l'acteur :"+prenom+"\n";
    }
    

    
    
}
