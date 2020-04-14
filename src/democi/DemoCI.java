/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democi;

import util.MyToy;

/**
 *
 * @author Tan
 */
public class DemoCI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("5!= " + MyToy.cF(5));
        System.out.println("6!= " + MyToy.cF(6));
        System.out.println("0! = " + MyToy.cF(0));//ki vong execption 
        System.out.println("-1! = " + MyToy.cF(-1));//ki vong JVM se giet app
    }

}
