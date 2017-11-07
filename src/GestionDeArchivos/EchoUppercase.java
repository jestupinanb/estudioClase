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

//reads a file and echoes it in uppercase
public class EchoUppercase {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner input = new Scanner (new File("poem.txt"));
        while(input.hasNextLine()){
            String text = input.nextLine();
            System.out.println(text);//Como es
            System.out.println(text.toLowerCase());//En minuscula
            System.out.println(text.toUpperCase()+"\n");//En mayuscula
        }
        input = new Scanner (new File("poem.txt"));
        while(input.hasNextLine()){
            System.out.println("Primera letra "+input.next());
            input.nextLine();
        }
    }
}
