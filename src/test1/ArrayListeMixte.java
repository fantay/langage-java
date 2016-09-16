/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.ArrayList;

/**
 *
 * @author Laurent-LIM
 */
public class ArrayListeMixte {
    
    public static void main(String[] args) {
        
        //creation des listes
        ArrayList listeMixte = new ArrayList();
        ArrayList listeASupprimer = new ArrayList();
        
        //remplissage des listes
        listeMixte.add("A");
        listeMixte.add("B");
        listeMixte.add(1);
        listeMixte.add(true);
        listeMixte.add("coucou");
        listeMixte.add(4);
        listeMixte.add(5);
        listeMixte.add(6);
        
        //affichage de la liste mixte
        System.out.println("Liste Mixte : \n"+listeMixte);
        
        //remplissage de la liste a supprimer
        for (int i = 0; i < 10; i++) {
            listeASupprimer.add(i);
        }
        
        //affichage de la liste a supprimer
        System.out.println("Liste a supprimer : \n"+listeASupprimer);
        
        //suppression des chiffres de la liste mixte
        listeMixte.removeAll(listeASupprimer);
        
        //affichage de la liste mixte modifier
        System.out.println("Liste mixte supprimer : \n"+listeMixte);
    }
}
