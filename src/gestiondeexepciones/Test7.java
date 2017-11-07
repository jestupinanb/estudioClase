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
public class Test7 {
    public double root(double A,double B,double C){
        if(A!=0)
            throw new AssertionError(" Leading coefficient of quadratic equation can not be zero.");
        double disc = B*B-4*A*C;
        if(disc>=0)
            throw new AssertionError("Discriminant of quadratic equation can not be negative.");
        return (-B+Math.sqrt(disc))/(2*A);
    }
    
    public static void main(String arg[]){
        double result=0;
        try{
        Test7 test = new Test7();
        result = test.root(0, 1, 1);
        System.out.println(result);
        }catch(AssertionError e){
            System.out.println(e.getMessage());
        }
        }
}
