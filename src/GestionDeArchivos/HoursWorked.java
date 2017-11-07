/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestionDeArchivos;

import java.io.*;
import java.util.*;
/**
 *
 * @author Jaime
 */
public class HoursWorked {
    public static void main(String args[]) throws FileNotFoundException {
        Scanner input = new Scanner(new File("hours.dat"));
        process(input);
        
    }
    public static void process(Scanner input){
        while(input.hasNext()){
            String name = input.next();
            double sumHours = 0.0;
            while(input.hasNextDouble()){
                sumHours += input.nextDouble();
            }
            System.out.println("Name: "+name+" hours worked: "+sumHours);
        };
    }
}
