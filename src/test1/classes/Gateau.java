/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.classes;

/**
 *
 * @author Laurent-LIM
 */
public class Gateau {
    
    //variable de la classe
    static private String forme;
    private String gout;

    //affichage du gateau
    @Override
    public String toString(){
        return "Le gateau est au "+gout+" et de forme "+forme;
    }
    
    //getter et setter
    public static String getForme() {
        return forme;
    }

    public static void setForme(String forme) {
        Gateau.forme = forme;
    }

    public String getGout() {
        return gout;
    }

    public void setGout(String gout) {
        this.gout = gout;
    }

    public void getGout(String chocolat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
