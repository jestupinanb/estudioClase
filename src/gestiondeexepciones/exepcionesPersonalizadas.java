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
public class exepcionesPersonalizadas {
    public double areaOfRectangle(double width, double height) throws CustomException{
        if(width<0 || height<0)
            throw new CustomException("Los lados deben tener una longitud positiva");
        double area;
        area = width*height;
        return area;
    }
    public static void main(String[]args){
        double result=0;
        exepcionesPersonalizadas test = new exepcionesPersonalizadas();
        
        //No se puede crear el argumento sin el catch
        try{
            result = test.areaOfRectangle(1, -10);
        }
        catch(CustomException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Resoult "+result);
    }
    
    public class CustomException extends Exception{
        public CustomException(String message){
            super(message);
        }
    }
}
