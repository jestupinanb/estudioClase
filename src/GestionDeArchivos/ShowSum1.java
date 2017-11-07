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
public class ShowSum1 {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner input = new Scanner( new File("hamlet2"));
        double sum = 0.0;
        for (int i = 0; i < 5; i++) {
            double next = input.nextDouble();
            System.out.println("number "+i+"="+next);
            sum += next;
        }
        System.out.println("Sum = "+sum);
    }
}
