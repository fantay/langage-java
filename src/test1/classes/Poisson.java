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
public class Poisson extends Animal {

    @Override
    public void manger() {
        System.out.println("je gobe");
    }

    @Override
    public void bouger() {
        System.out.println("je nage");
    }

}
