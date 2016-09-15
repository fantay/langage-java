/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author admin
 */
public class ForeachEtTableaux {
    
    public static void main(String[] args) {
        
        int [] tab = new int[10];
        
        //remplissage du tableau avec une boucle
        for (int i = 0; i < 10; i++) {
            tab[i] = i+1;
        }
        
        
        //affichage tableau (equivalent au foreach)
        for (int elemAct : tab) {
            System.out.println(elemAct);
        }
        
    }
    
}
