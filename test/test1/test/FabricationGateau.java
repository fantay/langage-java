/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import org.junit.Test;
import test1.classes.Gateau;

/**
 *
 * @author Laurent-LIM
 */
public class FabricationGateau {

    @Test
    public void gateau() {

        //fabrication de 3 gateaux
        Gateau fab1 = new Gateau();
        Gateau fab2 = new Gateau();
        Gateau fab3 = new Gateau();

        //affectation du gout
        fab1.setGout("chocolat");
        fab2.setGout("chocolat");
        fab3.setGout("citron");

        //affectation de la couleur
        fab1.setCouleur("blanc");
        fab2.setCouleur("noir");
        fab3.setCouleur("jaune");

        //affectation de la forme, etant static 
        //elle est commune a tous les gateaux
        Gateau.setForme("ronde");

        //affichage des gateaux 
        System.out.println("" + fab1 + fab2 + fab3 );
        System.out.println(Gateau.getNbrGateau());
    }
}
