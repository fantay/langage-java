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
public class Collections {

    public static void main(String[] args) {

        // creation des listes
        ArrayList<Integer> listeMulti10 = new ArrayList<>();
        ArrayList<Integer> listeMulti2 = new ArrayList<>();
        ArrayList<Integer> listeMulti3 = new ArrayList<>();

        //remplissage des listes
        //liste multiple de 10
        for (int i = 10; i < 100; i = i + 10) {
            listeMulti10.add(i);
        }
        System.out.println("Liste de multiple de 10 :\n"+listeMulti10);
        
        //liste multiple de 2
        for (int i = 2; i < 100; i = i + 2) {
            listeMulti2.add(i);
        }
        System.out.println("Liste de multiple de 2 :\n"+listeMulti2);
        
        //liste multiple de 3
        for (int i = 3; i < 99; i = i + 3) {
            listeMulti3.add(i);
        }
        System.out.println("Liste de multiple de 3 :\n"+listeMulti3);

        listeMulti2.removeAll(listeMulti10);
        listeMulti2.removeAll(listeMulti3);
        
        System.out.println("Liste de multiple de 2 modifier :\n"+listeMulti2);
    }
}
