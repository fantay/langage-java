/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import test1.util.MathUtil;
import static test1.util.MathUtil.exposant;
import static test1.util.MathUtil.genererNombreAleatoire;

/**
 *
 * @author admin
 */
public class Calcule {
    
     public static void main(String[] args) {
         
         //calcule exposant
         System.out.println("exposant : "+exposant(2,3)+"\n"); 
         
         //calcule factorielle
         System.out.println("factorielle : "+MathUtil.factorielle(4)+"\n");
         
         //calcule factorielle recursive
          System.out.println("factorielle recursive : "+MathUtil.factorielleRecursive(4)+"\n");
          
          //generation d'un nombre aleatoire entre Min et Max
          System.out.println("generation d'un nombre aléatoire entre 1 et 10 : "+genererNombreAleatoire(1,10)+"\n");
         
     }
     
     
}
