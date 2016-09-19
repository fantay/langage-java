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
public class Genre {

    //variable de la classe genre
    private String nomGenre;
    private static int nbrGenre;

    /*constructeur par defaut*/
    public Genre() {
        nbrGenre++;
    }

    //constructeur de la classe genre avec attribut
    public Genre(String nomGenre) {
        this();
        this.nomGenre = nomGenre;

    }

    //getter de nomGenre
    public String getNomGenre() {
        return nomGenre;
    }

    public static int getNbrGenre() {
        return nbrGenre;
    }

    //affichage du genre par le toString
    @Override
    public String toString() {
        return "le genre du film est " + nomGenre + "\n";
    }

}
