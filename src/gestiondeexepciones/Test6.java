/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestiondeexepciones;
import java.lang.Math;

/**
 *
 * @author Jaime
 */
public class Test6 {
    /**
     * Retorna el valor mas largo entre las dos raices de una ecuacion cuadratica
     * a*x*x + b*x + c = 0, verifica que esta tiene raices si a==0 o 
     * si el discriminante, b*b -4 a*c es negativo, entonces entrega una exepcion del tipo
     * IllegalArgumentException is thrown.
     */
    public double root(double A, double B, double C) throws IllegalArgumentException{
        if(A==0){
            throw new IllegalArgumentException("A can't be zero");
        }
        else{
            double disc =B*B - 4*C*A;
            if(disc<0)
                throw new IllegalArgumentException("Discriminant < zero");
                return (-B+Math.sqrt(disc))/(2*A);
        }
    };
    
    public static void main(String[]Args){
        Test6 test = new Test6();
        try{
            test.root(1, 1, 1);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
