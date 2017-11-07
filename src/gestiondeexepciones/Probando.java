/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeexepciones;

/**
 *
 * @author Jaime
 */
public class Probando {
    public static void main(String args[]){
        int x,y;
        x=2;y=1;
        if (x != y) {
            throw new AssertionError("x != y");
        }
        assert x != y;
   }
}
