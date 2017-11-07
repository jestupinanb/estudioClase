/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionDeArchivos;
import java.util.*;
import java.io.*;
/**
 *
 * @author Jaime
 */
public class Practicando {
    public static void main(String args[]) throws FileNotFoundException{
        Scanner input = new Scanner(new File("poem.txt"));
        lector(input);
    }
    public static void lector(Scanner input){
        while(input.hasNextLine()){
            System.out.println(input.nextLine().toUpperCase());
        }
    }
}
