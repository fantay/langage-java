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
public class ArrayListeTest {
    
    public static void main(String[] args) {
        
        ArrayList<String> liste1 =  new ArrayList<>();
        ArrayList<String> liste2 =  new ArrayList<>();
        
        liste1.add("Myrtha");
        liste1.add("Nicolas");
        liste1.add("Thomas");
        liste1.add("Julien");
        
        System.out.println("Liste 1 : \n"+liste1);
        
        liste2.add("Laurent");
        liste2.add("Myrtha");
        
        System.out.println("Liste 2 : \n"+liste2);
        
        liste1.addAll(liste2);
        
        System.out.println("Liste 1 + 2 : \n"+liste1);
        
    }
    
}
