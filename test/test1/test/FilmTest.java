/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import org.junit.Test;
import test1.classes.Acteur;
import test1.classes.Film;
import test1.classes.Genre;

/**
 *
 * @author Laurent-LIM
 */
public class FilmTest {
    
    @Test
    public void Test1(){
        
        Film f1 = new Film("kung fu panda", 240, "Un panda apprend le kung fu", 2002);
        Film f2 = new Film("banane", 200, "le parcours d'une banane", 1985);
        
        Genre g1 = new Genre("dessin animé");
        Genre g2 = new Genre("Documentaire");
        
        Acteur a1 = new Acteur("panda", "leo");
        Acteur a2 = new Acteur("blabla", "george");
        
        System.out.println(""+f1+g1+a1);
        System.out.println(""+f2+g2+a2);
        
        System.out.println(Film.getNbrFilm()+" "+Genre.getNbrGenre()+" "+Acteur.getNbrActeur());
    }
}
