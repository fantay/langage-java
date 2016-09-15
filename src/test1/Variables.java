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
public class Variables {

    public static void main(String[] args) {

        //types primitifs entiers
        byte byte1 = 99;
        short short1 = 9999;
        int entier1, entier2;
        long long1 = 999999999;
        
        
        //types primitifs décimaux
        float float1 = (float) 1234.56;
        double double1 = 1234.56;
          
        //type booleen
        boolean booleen = true; // ou false
        
        //texte
        String string1 = "coucou";
        
        entier1 = 123;
        entier2 = 456;

        System.out.println(entier1 + entier2);
        System.out.println(string1);
        
        
        // convertion

        Integer f1 = 123;
        
        String s1 = f1.toString();
        
        Long l1 = Long.valueOf(s1);
        
        l1 = l1+100;
        
        s1 = l1.toString();
        
        System.out.println(s1);
        
           
        
        
    }

}
 