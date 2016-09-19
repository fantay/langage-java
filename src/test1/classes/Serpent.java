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
public class Serpent extends Reptile{

    @Override
    public void manger() {
        System.out.println("il étouffe et avale");
    }

    @Override
    public void bouger() {
        System.out.println("se déplace en rampant");
    }
    
}
