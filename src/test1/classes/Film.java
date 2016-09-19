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
public class Film {

    // variable de la classe film
    private String titre;
    private Integer dureeEnMinute;
    private String synopsis;
    private Integer annee;
    private static int nbrFilm;

    public Film() {
        nbrFilm++;
    }

    /* contructeur de la classe film avec tous les parametres*/
    public Film(String titre, Integer dureeEnMinute, String Synopsis, Integer annee) {
        this();
        this.titre = titre;
        this.dureeEnMinute = dureeEnMinute;
        this.synopsis = Synopsis;
        this.annee = annee;
    }

    /* getter de la classe film */
    public String getTitre() {
        return titre;
    }

    public Integer getDureeEnMinute() {
        return dureeEnMinute;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public Integer getAnnee() {
        return annee;
    }

    public static int getNbrFilm() {
        return nbrFilm;
    }

    /* affichage des donnees de la 
    classe acteur par le toString */
    @Override
    public String toString() {
        return "Titre du film :" + titre + "\nAnnée : " + annee + "\nDurée : " + dureeEnMinute + " en minutes\nSynopsis : " + synopsis + "\n";
    }

}
