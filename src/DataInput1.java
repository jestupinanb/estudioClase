/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileInputStream;
/**
 *
 * @author Jaime
 */
public class DataInput1 {
    public static void main(String args[]) throws Exception{
        String file = args[0];
        int input;
        FileInputStream fin =  new FileInputStream(file);
        while((input=fin.read())!=-1){
            System.out.print((char)input);
        }
    }
}
