/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import java.util.ArrayList;
import org.junit.Test;
import test1.classes.Animal;
import test1.classes.Poisson;
import test1.classes.Serpent;
import test1.classes.Tortue;

/**
 *
 * @author Laurent-LIM
 */
public class AnimalTest {

    @Test
    public void test() {

        /* initialisation */
        Animal p = new Poisson();
        Animal s = new Serpent();
        Animal t = new Tortue();

        ArrayList<Animal> listeAnimaux = new ArrayList();

        /* remplissage de la liste */
        listeAnimaux.add(p);
        listeAnimaux.add(s);
        listeAnimaux.add(t);

        /* affichage par boucle */
        for (Animal animal : listeAnimaux) {
            if (animal == p) {
                System.out.println("le poisson :");
            } else if (animal == s) {
                System.out.println("le serpent :");
            } else {
                System.out.println("la tortue :");
            }
            animal.bouger();
            animal.manger();
            System.out.println(" ");
        }
   
    }

}
