/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileOutputStream;
/**
 *
 * @author Jaime
 */
public class DataOutput1{
    public static void main(String args[]) throws Exception{
        String file = args[0];
        String output = "Hello world";
        FileOutputStream fout = new FileOutputStream(file);
        char[] outputAsChars = output.toCharArray();
        
        for(int i=0; i<outputAsChars.length; ++i){
            fout.write(outputAsChars[i]);
            fout.close();
        }
    }
}
