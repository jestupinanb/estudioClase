/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionDeArchivos;

import java.io.File;

/**
 *
 * @author Jaime
 */
public class Basico {
    public static void main(String args[]){
    File f = new File("Archivo.txt");
        System.out.println(f.exists());
        f.delete();
        System.out.println(f.exists());
    }
}
