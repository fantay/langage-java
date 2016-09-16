/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author Laurent-LIM
 */
public class SetTest {
    
    public static void main(String[] args) {
        
        //creation des listes
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        ArrayList<Integer> liste = new ArrayList<>();
        
        //remplissage des listes
        for (int i = 1; i < 4; i++) {
            set.add(i);
            set2.add(i);
        }
        
        for (int i = 1; i < 7; i++) {
            liste.add(i);
            if (i==3) {
                liste.add(i);
            }
            if (i==4) {
                liste.add(i);
            }
        }
        
        //affichage des listes
        System.out.println("contenue du set "+set);
        System.out.println("contenue de liste "+liste); 
        
        //ajout de liste a set et affichage
        set.addAll(liste);
        System.out.println("set avec liste ajouter "+set);
        
        //ajout de set a liste et affichage
        liste.addAll(set2);
        System.out.println("liste avec set ajouter "+liste);
        
        
    }
}
