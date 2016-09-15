/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.util;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author admin
 */
public class ConsoleUtil {

    //fonction de saisie du clavier suite a un message
    public static String lireTexte(String message) throws IOException {
        DataInputStream clavier = new DataInputStream(System.in);
        System.out.print(message);
        String texte = clavier.readLine();
        return texte;
    }

    //fonction de saisie au clavier a la ligne d'un message
    public static String lireTexteLigne(String message) throws IOException {
        DataInputStream clavier = new DataInputStream(System.in);
        System.out.print(message);
        String texte = clavier.readLine();
        return texte;
    }

    //fonction de saisie au clavier d'un nombre
    public static int lireInt(String message) throws IOException {
        String txt = lireTexte(message);
        return Integer.valueOf(txt);
    }

}
