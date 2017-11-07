/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeexepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jaime
 */
public class teste2test3 {
    public static void main(String[] args) {
        double dividebyzero = divideByZero();
        System.out.println("25/0 "+dividebyzero);
    } 
    static double divideByZero(){
        double resoult;
        Scanner read = new Scanner(System.in);
        double result=0,number=0;
        try{
        System.out.println("please try enter one number");
        number=read.nextInt();
        result=25/number;
        }
        catch(ArithmeticException exception){
            System.out.println("No se puede dividir por 0");
        }
        catch(InputMismatchException e){
            System.out.println("Debe introducir un numero");
        };
        return result;
};
}
