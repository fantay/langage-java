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
public class Gateau {

    //variable de la classe
    static private String forme;
    private String gout;
    private String couleur;
    static private int nbrGateau = 0;


    //constructeur de la classe gateau
    //sa definie des valeurs par defauts, qui sont modifiables
    public Gateau() {

        nbrGateau++;
        
    }

    //affichage du gateau
    @Override
    public String toString() {
        return "Le gateau est au " + gout + ", de forme " + forme + " et de couleur " + couleur + "\n";
    }

    //getter et setter

    public static Integer getNbrGateau() {
        return nbrGateau;
    }
    
    public static String getForme() {
        return forme;
    }

    public static void setForme(String forme) {
        Gateau.forme = forme;
    }

    public String getGout() {
        return gout;
    }

    public void setGout(String gout) {
        this.gout = gout;
    }

    
    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    
    
}
