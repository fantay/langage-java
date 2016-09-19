/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.test;

import org.junit.Test;
import test1.classes.Film;

/**
 *
 * @author Laurent-LIM
 */
public class FilmTest {
    
    @Test
    public void Test1(){
        
        Film f1 = new Film();
        f1.setTitre("Pulp ficton");
        f1.setSynopsis("a");
        
        Film f2 = new Film();
        f2.setTitre("Kung fu panda");
        f2.setSynopsis("ba");
        
        System.out.println(f1);
        System.out.println(f2);
        
    }
}
