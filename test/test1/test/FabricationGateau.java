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
    public void gateau(){
        
        //fabrication de 3 gateaux
        Gateau fab1 = new Gateau();
        Gateau fab2 = new Gateau();
        Gateau fab3 = new Gateau();
        
        //affectation du gout
        fab1.setGout("chocolat");
        fab2.setGout("chocolat");
        fab3.setGout("citron");
        
        //affectation de la forme
        Gateau.setForme("ronde");
        Gateau.setForme("étoile");
        Gateau.setForme("ronde");
        
        //affichage des gateaux 
        System.out.println(fab1+"\n"+fab2+"\n"+fab3);
    }
}
