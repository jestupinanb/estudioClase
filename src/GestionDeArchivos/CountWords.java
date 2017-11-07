/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionDeArchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author Jaime
 */
public class CountWords {
    public static void main(String args[]) throws FileNotFoundException{
        Scanner input = new Scanner(new File("hamlet"));
        int count=0;
        while(input.hasNext()){
            System.out.println(input.hasNextInt());
            count++;
            String word = input.next();
        }
        System.out.println("Total words = " + count);
    }
}
