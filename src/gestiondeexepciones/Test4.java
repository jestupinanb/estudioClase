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
public class Test4 {
    public double areaOfRectangle(double width, double height){
        if(width<0 || height<0)
            throw new IllegalArgumentException("Los lados deben tener una longitud positiva");
        System.out.println("Se ejecuto");
        double area;
        area = width*height;
        return area;
    }
    public static void main(String[]args){
        double result=0;
        Test4 test = new Test4();
        //Se puede crear el argumento sin necesidad del catch
        try{
            result = test.areaOfRectangle(1, -10);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Resoult "+result);
    }
}
