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
public class GestionExepciones {
    public static class Test1
    {
        public Test1(){
            divideByZero2();
        }
        int divideByZero(){
            return 25/0;
        }
        int divideByZero2(){
            int result=0;
            try{
                result = 25/0;
            }catch(ArithmeticException exception){
                System.out.println(exception.getMessage());
                System.out.println("Error aritmetico, no es posible dividir por cero");
            }
            return result;
        }
        
    }
    
    public static void main(String[] args) {
        new Test1();
        System.out.println("Continuo");
    }
    
}
