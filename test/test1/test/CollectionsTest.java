/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import java.util.HashMap;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laurent-LIM
 */
public class CollectionsTest {

    public void map() {
        HashMap<String, String> map = new HashMap<>();

        map.put("java", "langage de programmation objet");
        map.put("c", "langage de programmation structuré");
        map.put("ruby", "langage de script objet");

        map.size();                                //renvoie le nombre de definition
        map.get("ruby");                           //renvoie la definition de la clé
        map.keySet();                              //renvoie un set avec toutes les clés
        map.putAll(map);                           //ajoute une map dans une autre map
        map.remove("c");                           //supprime l'entrée c dans la map
        map.replace("c", "langage préhistorique"); //remplace la valeur 
        map.clear();                               //vide la map
    }

    //@Test   
    //Test 1
    public void recupRuby() {

        //creation du dictionnaire
        HashMap<String, String> map = new HashMap<>();

        //remplissage du dictionnaire
        map.put("java", "langage de programmation objet");
        map.put("c", "langage de programmation structuré");
        map.put("ruby", "langage de script objet");

        //recuperation et affichage de la valeur de la clé ruby
        System.out.println(map.get("ruby"));

    }

    //@Test
    //Test 2
    public void remplaceDefinitionParSuperLangage() {
        //creation du dictionnaire
        HashMap<String, String> map = new HashMap<>();

        //remplissage du dictionnaire
        map.put("java", "langage de programmation objet");
        map.put("c", "langage de programmation structuré");
        map.put("ruby", "langage de script objet");

        //recuperation et affichage de la valeur de la clé ruby
        System.out.println(map.get("ruby"));

        //remplace la definition de ruby
        map.replace("ruby", "Super langage");

        //recuperation et affichage de la valeur de la clé ruby
        System.out.println(map.get("ruby"));

    }

    //@Test
    //Test 3
    public void supprimeLangageC() {
        //creation du dictionnaire
        HashMap<String, String> map = new HashMap<>();

        //remplissage du dictionnaire
        map.put("java", "langage de programmation objet");
        map.put("c", "langage de programmation structuré");
        map.put("ruby", "langage de script objet");

        //suppression de C et affichage du dico
        map.remove("c");
        System.out.println(map);
        
    }

    //@Test
    //Test 4 
    public void newListeEtAjout() {
        //creation des dictionnaires
        HashMap<String, String> map = new HashMap<>();

        //remplissage du dictionnaire
        map.put("java", "langage de programmation objet");
        map.put("c", "langage de programmation structuré");
        map.put("ruby", "langage de script objet");

        HashMap<String, String> dico = new HashMap<>();

        //remplissage
        dico.put("PHP", "Langage Génial");
        dico.put("Python", "Sa pique");

        //affichage des dico
        System.out.println(map + "\n" + dico);

        //fusion des dico et affichage
        map.putAll(dico);
        System.out.println(map);
        
    }

    @Test
    //Test 5
    public void recupCleEtAffiche(){
        //creation des dictionnaires
        HashMap<String, String> map = new HashMap<>();

        //remplissage du dictionnaire
        map.put("java", "langage de programmation objet");
        map.put("c", "langage de programmation structuré");
        map.put("ruby", "langage de script objet");    
        
        for (String key : map.keySet()) {
            System.out.println(key +" : "+ map.get(key));
        }


        
    }
    
    
    
    
}
