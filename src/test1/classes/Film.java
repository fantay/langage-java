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
    static private String titre;
    private Integer dureeEnMinute;
    private String Synopsis;
    private Integer annee;

    @Override
    public String toString() {
        return "Film : "+titre+" Synopsis : "+Synopsis;
    }

    // Getter et Setter
    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Integer getDureeEnMinute() {
        return dureeEnMinute;
    }

    public void setDureeEnMinute(Integer dureeEnMinute) {
        this.dureeEnMinute = dureeEnMinute;
    }

    public String getSynopsis() {
        return Synopsis;
    }

    public void setSynopsis(String Synopsis) {
        this.Synopsis = Synopsis;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(Integer annee) {
        this.annee = annee;
    }
   
}
